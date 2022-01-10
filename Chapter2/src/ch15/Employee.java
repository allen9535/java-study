package ch15;

public class Employee {

  private static int serialNum = 1000;

  private int employeeId;
  private String employeeName;
  private String department;

  public static int getSerialNum() {
    return serialNum;
  }
  public static void setSerialNum(int serialNum) {
    int i = 0;

    // 스태틱 메서드 내부에서 외부의 인스턴스 변수를 사용할 수 없다.
    // 오류 발생!
    //    employeeName = "Lee";
    Employee.serialNum = serialNum;
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