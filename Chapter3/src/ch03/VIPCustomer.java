package ch03;

// 하위 클래스를 생성하면 상위 클래스가 먼저 생성된다.
// new VIPCustomer()를 호출하면 Customer()가 먼저 호출된다는 뜻이다.
// 클래스가 상속받은 경우, 하위 클래스의 생성자에서 반드시 상위 클래스의 생성자를 호출하게 되어있다.
public class VIPCustomer extends Customer {

  private int agentID;
  double salesRatio;

  public VIPCustomer() {
    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;

    System.out.println("VIPCustomer 생성자 호출!");
  }

  public int getAgentID() {
    return agentID;
  }

}