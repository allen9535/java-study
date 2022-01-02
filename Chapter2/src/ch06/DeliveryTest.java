package ch06;

public class DeliveryTest {

  public static void main(String[] args) {

    DeliveryInfo deli = new DeliveryInfo();
    deli.orderNo = 202011020003L;
    deli.phoneNo = 01023450001L;
    deli.address = "서울시 강남구 역삼동 111-333";
    deli.orderDate = 20201102;
    deli.orderTime = 130258;
    deli.price = 35000;
    deli.menuNo = 3;

    System.out.printf("주문 접수 번호: %d\n", deli.orderNo);
    System.out.printf("주문 핸드폰 번호: %d\n", deli.phoneNo);
    System.out.printf("주문 집 주소: %s\n", deli.address);
    System.out.printf("주문 날짜: %d\n", deli.orderDate);
    System.out.printf("주문 시간: %d\n", deli.orderTime);
    System.out.printf("주문 가격: %d\n", deli.price);
    System.out.printf("주문 번호: %04d\n", deli.menuNo);

  }

}