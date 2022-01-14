package ch22;

import java.util.ArrayList;

public class Student {

  private int studentNo;
  private String studentName;
  private ArrayList<Subject> subjects;

  public Student(int no, String name) {
    this.studentNo = no;
    this.studentName = name;

    subjects = new ArrayList<>();
  }

  public int getStudentNo() {
    return studentNo;
  }

  public void setStudentNo(int studentNo) {
    this.studentNo = studentNo;
  }

  public String getStudentName() {
    return studentName;
  }

  public void setStudentName(String studentName) {
    this.studentName = studentName;
  }

  public void addSubject(String subjectName, int score) {
    Subject subject = new Subject();
    subject.setSubjectName(subjectName);
    subject.setScore(score);

    subjects.add(subject);
  }

  public void studentInfo() {
    int total = 0;

    System.out.printf("%d학번 %s학생의 ", studentNo, studentName);
    for (Subject s: subjects) {
      System.out.printf("%s 과목은 %d점 ", s.getSubjectName(), s.getScore());

      total += s.getScore();
    }
    System.out.printf("입니다. 총점은 %d점이고, 평균은 %d점입니다.\n", total, (total / subjects.size()));
  }

}