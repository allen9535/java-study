package ch07;

public class Student {

  int studentID;
  String studentName;
  Subject korea;
  Subject math;

  Student(int studentID, String studentName) {

    this.studentID = studentID;
    this.studentName = studentName;

    korea = new Subject();
    math = new Subject();

  }

  public void setKoreaSubject(String name, int score) {

    korea.subjectName = name;
    korea.score = score;

  }

  public void seMathSubject(String name, int score) {

    math.subjectName = name;
    math.score = score;

  }

  public void showScoreInfo() {

    int total = korea.score + math.score;

    System.out.printf("%s 학생의 총점은 %d점 입니다.\n", studentName, total);

  }

}