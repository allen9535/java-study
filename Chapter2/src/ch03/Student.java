package ch03;

// 객체: 객체 지향 프로그래밍의 대상
// 클래스: 객체를 프로그래밍 하기 위하여 코드로 정의한 상태
public class Student {

  public int studentID;
  public String studentName;
  public String address;

  public void showStudentInfo() {
    System.out.printf("%s, %s\n", studentName, address);
  }

  public String getStudentName() {
    return studentName;
  }

}