package com.example.myapplication

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TimePicker
import com.example.myapplication.util.TimeCalculator
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_goal.*

class GoalActivity : AppCompatActivity() {
    // database에 연결
    private lateinit var database: DatabaseReference
    // Log의 TAG
    companion object {
        private const val TAG = "GoalActivity"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_goal)

        val user = FirebaseAuth.getInstance().currentUser

        // Set a click listener for set time button widget
        button_set.setOnClickListener {
            if (user == null) {
                Log.d(TAG, "user doesn't exist")
            } else {
                var uid = user.uid
                val database = Firebase.database
                val today = TimeCalculator().today()
                val myRef = database.getReference("calendar/$uid/$today")
                goalWrite(myRef,time_picker)
                AlertDialog.Builder(this)
                    .setMessage("목표를 저장했습니다")
                    .setPositiveButton("OK",
                        DialogInterface.OnClickListener { dialog, which -> finish() })
                    .show()
            }
        }

        time_picker.setIs24HourView(true)
    }

    private fun goalWrite(myRef: DatabaseReference, timePicker: TimePicker) {
        // [START write_message]
        val destination = myRef.child("/dailyGoal/goalTime")
        var time = String.format("%02d:%02d:00",timePicker.hour,timePicker.minute)
        val goalTime = TimeCalculator().stringToLong(time)
        destination.setValue(goalTime)
        // [END write_message]
    }
}