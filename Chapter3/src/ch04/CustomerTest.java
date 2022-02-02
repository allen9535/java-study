package ch04;

class CustomerTest {

  public static void main(String[] args) {
    Customer lee = new Customer(10010, "이모");
    lee.bonusPoint = 1000;
    System.out.println(lee.showCustomerInfo());

    VIPCustomer kim = new VIPCustomer(10020, "김모");
    kim.bonusPoint = 10000;
    System.out.println(kim.showCustomerInfo());
  }

}