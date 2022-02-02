package ch11.answer.course;

public class Subway {

  int lineNumber;
  int passengerCount;
  int money;

  public Subway(int lineNumber) {
    this.lineNumber = lineNumber;
  }

  public void take(int money) {
    this.money += money;
    passengerCount++;
  }

  public void showSubwayInfo() {
    System.out.printf("%d번 지하철의 승객은 %d명 이고, 수입은 %d원 입니다.", 
        lineNumber, passengerCount, money);
  }

}