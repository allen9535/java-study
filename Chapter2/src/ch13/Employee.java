package ch13;

public class Employee {

  // 스태틱 변수
  // 인스턴스가 생성될 때가 아니라, 맨 처음 프로그램이 메모리에 로딩될 때 메모리에 할당된다.
  // 클래스 변수, 정적 변수라고도 한다.
  // 인스턴스 생성과 무관하게 사용할 수 있으므로 클래스 이름으로 직접 참조한다.
  public static int serialNum = 1000;

  private int employeeId;
  private String employeeName;
  private String department;

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