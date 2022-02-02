package ch22;

public class Answer {

  public static void main(String[] args) {
    Student lee = new Student(1001, "Lee");
    lee.addSubject("국어", 100);
    lee.addSubject("수학", 50);
    lee.studentInfo();

    Student kim = new Student(1002, "Kim");
    kim.addSubject("국어", 70);
    kim.addSubject("수학", 85);
    kim.addSubject("영어", 100);
    kim.studentInfo();
  }

}