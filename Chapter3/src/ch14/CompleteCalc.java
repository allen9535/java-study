package ch14;

// 인터페이스를 구현한 클래스를 상속받은 클래스
public class CompleteCalc extends Calculator {

  @Override
  public int times(int num1, int num2) {
    return num1 * num2;
  }

  @Override
  public int divide(int num1, int num2) {
    if (num2 == 0) {
      return ERROR;
    } else {
      return num1 / num2;
    }
  }

  public void showInfo() {
    System.out.println("구현 완료!");
  }

}