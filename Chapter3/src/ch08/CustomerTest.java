package ch08;

import java.util.ArrayList;

public class CustomerTest {

  public static void main(String[] args) {
    ArrayList<Customer> customerList = new ArrayList<>();

    Customer lee = new Customer(10010, "이모");
    Customer shin = new Customer(10020, "신모");
    Customer hong = new GoldCustomer(10030, "홍모");
    Customer jang = new GoldCustomer(10040, "장모");
    Customer kim = new VIPCustomer(10050, "김모");

    customerList.add(lee);
    customerList.add(shin);
    customerList.add(hong);
    customerList.add(jang);
    customerList.add(kim);

    System.out.println("-------------------- 고객 정보 출력 --------------------");

    for (Customer c: customerList) {
      System.out.println(c.showCustomerInfo());
    }

    System.out.println("-------------------- 할인율 및 포인트 출력 --------------------");

    int price = 10000;
    for (Customer c: customerList) {
      System.out.printf("%s님께서 %d원 지불하셨습니다.\n", c.getCustomerName(), c.calcPrice(price));
      System.out.printf("%s님의 현재 포인트는 %d점 입니다.\n", c.getCustomerName(), c.getBonusPoint());
    }
  }

}