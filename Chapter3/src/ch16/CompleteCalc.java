package ch16;

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

  // 인터페이스에 있는 디폴트 메서드를 재정의 할 수 있다.
  @Override
  public void description() {
    System.out.println("default method 재정의");
  }

}