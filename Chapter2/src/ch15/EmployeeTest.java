package ch15;

public class EmployeeTest {

  public static void main(String[] args) {

    // 스태틱 변수를 클래스 이름으로 호출
    System.out.println(Employee.getSerialNum());
    Employee.setSerialNum(1004);
    System.out.println(Employee.getSerialNum());

  }

}