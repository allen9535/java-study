package ch02;

// 일반 고객: 물품 구매시 1%의 보너스 포인트를 적립한다.
// 일반 고객의 속성: 고객 아이디, 이름, 등급, 보너스 포인트, 보너스 포인트 적립 비율
public class Customer {

  // protected 접근 제어자: private으로 선언할 경우 하위 클래스에서 접근할 수 없게 된다.
  // protected의 경우 외부 클래스에서는 접근할 수 없지만, 하위 클래스에서는 접근할 수 있게 된다.
  protected int customerID;
  protected String customerName;
  protected String customerGrade;
  int bonusPoint;
  double bonusRatio;

  public Customer() {
    customerGrade = "SILVER";
    bonusRatio = 0.01;
  }

  // getter / setter
  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerGrade() {
    return customerGrade;
  }

  public void setCustomerGrade(String customerGrade) {
    this.customerGrade = customerGrade;
  }

  public int calcPrice(int price) {
    bonusPoint += (price * bonusRatio);

    return price;
  }

  public String showCustomerInfo() {
    return customerName + "님의 현재 등급은 " + customerGrade + 
        "이며, 현재 포인트는 " + bonusPoint + "입니다.";
  }

}