package ch04;

// super 키워드
// 하위 클래스에서 사용할 수 있는, 상위 클래스에 대한 참조 값이다.
// super()는 상위 클래스의 기본 생성자를 호출한다.
// 하위 클래스에서 명시적으로 상위 클래스의 생성자를 호출하지 않으면 super()가 호출된다.
// (단, 상위 클래스에 반드시 기본 생성자가 존재해야 한다.)
// 상위 클래스에 기본 생성자가 없는 경우(다른 생성자가 있을 경우),
// 하위 클래스의 생성자에서는 super를 사용해 명시적으로 상위 클래스의 생성자를 호출해야 한다.
// super는 생성된 상위 클래스 인스턴스의 참조 값을 가지므로 super를 통해 상위 클래스의 메서드나 멤버 변수에 접근할 수 있다.
public class VIPCustomer extends Customer {

  private int agentID;
  double salesRatio;

  public VIPCustomer(int customerID, String customerName) {
    // super를 사용해 상위 클래스의 생성자를 명시적으로 호출한다.
    super(customerID, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;

    System.out.println("VIPCustomer(int, String) 생성자 호출!");
  }

  public int getAgentID() {
    return agentID;
  }

}