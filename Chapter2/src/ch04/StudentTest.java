package ch04;

public class StudentTest {

  public static void main(String[] args) {
    // Student 객체에 존재하는 생성자에 매개변수를 보내 변수를 초기화한다.
    // 지금은 Student 객체에 따로 생성자를 만들었지만, 만들지 않을 경우 기본 생성자가 생성된다.
    // 컴파일러가 자동으로 해당하는 코드를 만들어주는 것이다.
    Student studentLee = new Student(12345, "Lee", 3);

    String data = studentLee.showStudentInfo();
    System.out.println(data);
  }

}