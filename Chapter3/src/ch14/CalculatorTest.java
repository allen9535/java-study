package ch14;

public class CalculatorTest {

  public static void main(String[] args) {
    Calc calc = new CompleteCalc();
    int num1 = 10;
    int num2 = 2;

    // 에러! 인터페이스에 선언된 모든 변수는 상수이기 때문
    //    calc.ERROR = 0;

    System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
    System.out.printf("%d - %d = %d\n", num1, num2, calc.substract(num1, num2));
    System.out.printf("%d * %d = %d\n", num1, num2, calc.times(num1, num2));
    System.out.printf("%d / %d = %d\n", num1, num2, calc.divide(num1, num2));
  }

}