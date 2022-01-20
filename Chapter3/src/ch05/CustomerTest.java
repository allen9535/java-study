package ch05;

class CustomerTest {

  public static void main(String[] args) {
    Customer lee = new Customer(10010, "이모");
    lee.bonusPoint = 1000;
    System.out.println(lee.showCustomerInfo());

    VIPCustomer kim = new VIPCustomer(10020, "김모");
    kim.bonusPoint = 10000;
    System.out.println(kim.showCustomerInfo());

    int priceLee = lee.calcPrice(10000);
    int priceKim = kim.calcPrice(10000);

    System.out.printf("%s 지불 금액은 %d원 입니다.\n", lee.showCustomerInfo(), priceLee);
    System.out.printf("%s 지불 금액은 %d원 입니다.\n", kim.showCustomerInfo(), priceKim);

    // 형 변환
    // no의 변수 타입은 Customer이지만 인스턴스의 타입은 VIPCustomer이다.
    // 자바의 모든 메서드는 가상 메서드(virtual method)이고,
    // 자바에서는 항상 인스턴스의 메서드가 호출된다.(가상 메서드 원리)
    Customer no = new VIPCustomer(10030, "노모");
    no.bonusPoint = 10000;
    int priceNo = no.calcPrice(10000);
    System.out.printf("%s 지불 금액은 %d원 입니다.", no.showCustomerInfo(), priceNo);
  }

}