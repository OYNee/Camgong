## 🤳스터디 어플

공부하는 시간을 기록하고 공부하는 나를 스스로 감시하는 어플

## 🤷‍페르소나

20대 중후반 취준생

- 목표는 대기업
- 회사에 따라 다르지만 최종면접까지 간 경험 있음
- 스펙을 샇기 위해 영어공부, 자격증공부와 취업준비를 병행
- 코로나때문에 취업준비도, 공부도 나태해지는 것 같아 불안함
- 밤새는게 잦아 바이오리듬이 엉망이 됨

## 🎇프로젝트 주 기능

- 스탑워치
- 다이어리(달력)
    - 하루 공부 시간량을 깃커밋개수 체크하듯이
    - 일, 주, 월별 데이터 보여주기
- 내가 설정한 목표의 달성률 보여주기
- 집중하기 좋은 공부시간 추천
- *****사용하고 싶은 깔끔하고 보기 편한 uiux*****

## 👀와이어프레임

![wireframe](/uploads/7053b527109bfc956b161d5e3d6b12c2/wireframe.png)



## &#128640;수동 배포 방법 

1. Build -> Generate Signed Bundle / APK 선택
2. APK 선택 -> Create New
3. path 부터 First and Last Name 칸까지 필수 입력 후 OK
   - Name칸의 밑칸은 선택사항
4. Key 값을 입력 후 next
   - jks 파일인 Key 파일을 만드는 작업
   - 입력한 Key를 입력하여 APK 배포 파일을 만들 수 있음
     - KEY를 반드시 기억할 것!!! 
5. Build Variants를 release, Signature Version을 v1과 v2 둘다 선택
   - v2는 sdk 7.0 이상부터 지원하는 인증방식
   - 둘중에 하나만 선택할 경우 OS 버전에 따라 설치문제 발생 
6. [프로젝트 이름] -> app -> release 폴더에 APK 파일 배포됨



## 📝개발 계획

![gantt_chart](/uploads/1f8a04f392258ca5cc379aba690d4683/gantt_chart.png)
