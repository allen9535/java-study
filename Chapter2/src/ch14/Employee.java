package ch14;

public class Employee {

  public static int serialNum = 1000;

  private int employeeId;
  private String employeeName;
  private String department;

  // 새 인원이 입사할 때마다 새 사번을 부여해보자.
  // 생성자가 호출될 때마다 serialNum 값을 증가시키고 그 값을 employeeId로 사용하면 된다.
  public Employee() {
    serialNum++;
    employeeId = serialNum;
  }

  public int getEmployeeId() {
    return employeeId;
  }
  public void setEmployeeId(int employeeId) {
    this.employeeId = employeeId;
  }
  public String getEmployeeName() {
    return employeeName;
  }
  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }
  public String getDepartment() {
    return department;
  }
  public void setDepartment(String department) {
    this.department = department;
  }

}