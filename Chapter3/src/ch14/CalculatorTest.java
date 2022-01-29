package ch14;

public class CalculatorTest {

  public static void main(String[] args) {
    // Calc는 인터페이스, Calculator는 추상 클래스이므로 구현할 수 있는 클래스는 CompleteCalc 뿐이다.
    Calc calc = new CompleteCalc();
    CompleteCalc cCalc = new CompleteCalc();
    int num1 = 10;
    int num2 = 2;

    // 에러! 인터페이스에 선언된 모든 변수는 상수이기 때문
    //    calc.ERROR = 0;

    System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
    System.out.printf("%d - %d = %d\n", num1, num2, calc.substract(num1, num2));
    System.out.printf("%d * %d = %d\n", num1, num2, calc.times(num1, num2));
    System.out.printf("%d / %d = %d\n", num1, num2, calc.divide(num1, num2));

    // calc의 경우 Calc 타입으로 선언되었기 때문에, showInfo() 메서드는 사용할 수 없다.
    // CompleteCalc 타입으로 선언해야 showInfo() 메서드를 사용할 수 있다.
    // 즉, 어떤 타입이냐에 따라 사용할 수 있는 메서드가 다르다.
    cCalc.showInfo();
  }

}