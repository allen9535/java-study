package ch14;

public class EmployeeTest {

  public static void main(String[] args) {
    Employee employeeLee = new Employee();
    employeeLee.setEmployeeName("이모");

    Employee employeeKim = new Employee();
    employeeKim.setEmployeeName("김모");

    System.out.printf("%s, %d\n", employeeLee.getEmployeeName(), employeeLee.getEmployeeId());
    System.out.printf("%s, %d\n", employeeKim.getEmployeeName(), employeeKim.getEmployeeId());
  }

}