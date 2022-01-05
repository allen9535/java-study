package ch11.answer.course;

public class Bus {

  int busNumber;
  int passengerCount;
  int money;

  public Bus(int busNumber) {
    this.busNumber = busNumber;
  }

  public void take(int money) {
    this.money += money;
    passengerCount++;
  }

  public void showBusInfo() {
    System.out.printf("%d번 버스의 승객은 %d명 이고, 수입은 %d원 입니다.\n", 
        busNumber, passengerCount, money);
  }

}