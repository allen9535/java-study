package ch08;

// 일반 고객과 VIP 고객 중간 멤버십 만들기
// 고객이 늘었기 때문에 일반 고객보다는 많이 구매하고 VIP 보다는 적게 구매하는 고객에게도 혜택을 주기로 했다.
// GOLD 고객 등급을 만들고 다음과 같은 혜택을 제공한다.
// 1. 제품을 살 때 10%를 할인한다.
// 2. 보너스 포인트는 2%를 적립한다.
public class GoldCustomer extends Customer {

  protected double salesRatio;

  public GoldCustomer(int customerID, String customerName) {
    super(customerID, customerName);

    customerGrade = "GOLD";
    salesRatio = 0.1;
    bonusRatio = 0.02;
  }

  public double getSalesRatio() {
    return salesRatio;
  }

  public void setSalesRatio(double salesRatio) {
    this.salesRatio = salesRatio;
  }

  @Override
  public int calcPrice(int price) {
    bonusPoint += (price * bonusRatio);

    return price - (int)(price * salesRatio);
  }

}