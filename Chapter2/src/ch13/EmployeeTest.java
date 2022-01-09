package ch13;

import ch14.Employee;

public class EmployeeTest {

  public static void main(String[] args) {

    Employee employeeLee = new Employee();
    employeeLee.setEmployeeName("이모");
    System.out.println(employeeLee.serialNum);

    Employee employeeKim = new Employee();
    employeeKim.setEmployeeName("김모");
    employeeKim.serialNum++;

    // 서로 다른 변수지만 스태틱 변수는 공동으로 사용한다.
    System.out.println(employeeLee.serialNum);
    System.out.println(employeeKim.serialNum);

    // 스태틱 변수는 클래스 이름으로 직접 참조한다.
    System.out.println(Employee.serialNum);

  }

}