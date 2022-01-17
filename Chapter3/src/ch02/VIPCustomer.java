package ch02;

public class VIPCustomer extends Customer {

  // 우수 고객: 제품 구매시 10%를 할인하며, 포인트는 제품 가격의 5%를 적립한다. 담당 상담원이 배정된다.
  // Customer 클래스에 추가해서 구현하는 것은 좋지 않다.
  // VIPCustomer 클래스를 따로 구현하되, 이미 Customer에 구현된 내용이 중복되므로 Customer 클래스를
  // 확장하여 구현한다.(상속)
  private int agentID;
  double salesRatio;

  public VIPCustomer() {
    customerGrade = "VIP";
    bonusRatio = 0.05;
    salesRatio = 0.1;
  }

  public int getAgentID() {
    return agentID;
  }

}