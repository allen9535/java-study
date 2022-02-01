package ch16;

public class CalculatorTest {

  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 2;

    CompleteCalc calc = new CompleteCalc();
    System.out.printf("%d + %d = %d\n", num1, num2, calc.add(num1, num2));
    System.out.println("------------------------------");
    System.out.printf("%d - %d = %d\n", num1, num2, calc.substract(num1, num2));
    System.out.println("------------------------------");
    System.out.printf("%d * %d = %d\n", num1, num2, calc.times(num1, num2));
    System.out.println("------------------------------");
    System.out.printf("%d / %d = %d\n", num1, num2, calc.divide(num1, num2));
    System.out.println("------------------------------");

    calc.description();
    System.out.println("------------------------------");

    int[] arr = {1, 2, 3, 4, 5};
    // 인터페이스에서 정적 메서드로 선언했기 때문에 다음과 같이 사용할 수 있다.
    System.out.printf("1 ~ 5의 합: %d\n", Calc.total(arr));
  }

}