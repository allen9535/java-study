package ch04;

public class Student {

  public int studentNumber;
  public String studentName;
  public int grade;

  // 생성자(Contructor): 객체가 생성될 때 변수나 상수를 초기화하거나 기능을 수행하는 메서드를 호출한다.
  // 반환 값이 없고, 클래스의 이름과 동일하게 작성한다.
  // 대부분 public으로 선언하지만 필요한 경우 private으로 선언할 수도 있다.
  public Student(int studentNumber, String studentName, int grade) {
    this.studentNumber = studentNumber;
    this.studentName = studentName;
    this.grade = grade;
  }

  public String showStudentInfo() {
    String studentInfo;

    studentInfo = studentName + "학생의 학번은 " + studentNumber + "이고, " + grade + "학년 입니다.";

    return studentInfo;
  }

}