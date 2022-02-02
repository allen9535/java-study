package ch05;

public class VIPCustomer extends Customer {

  private int agentID;
  double salesRatio;

  public VIPCustomer(int customerID, String customerName) {
    super(customerID, customerName);

    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;

    System.out.println("VIPCustomer(int, String) 생성자 호출!");
  }

  public int getAgentID() {
    return agentID;
  }

  // 오버라이딩(Overriding)
  // 상위 클래스에 정의된 메서드에서 구현된 내용이, 하위 클래스에서 구현할 내용과 맞지 않을 경우
  // 동일한 이름의 메서드를 하위 클래스에서 재정의할 수 있다.

  // 애노테이션(Annotation)
  // 컴파일러에게 특별한 정보를 제공하는 역할을 한다.
  // 예) @Override(재정의된 메서드) @FunctionalInterface(함수형 인터페이스)
  // 예) @Deprecated(이후 버전에서 사용되지 않을 수 있는 변수 또는 메서드)
  // 예) @SuppressWarnings(특정 경고가 나타나지 않게 한다.
  //     @SupressWarnings("deprecation")과 같이 사용한다.

  // 오버라이딩 애노테이션을 사용할 때 선언부는 기존의 메서드와 같아야 한다.
  // 그렇지 않으면 오류가 발생한다.
  @Override
  public int calcPrice(int price) {
    bonusPoint += price * bonusRatio;

    return price - (int)(price * salesRatio);
  }

}