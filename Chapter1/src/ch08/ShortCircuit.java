package ch08;

public class ShortCircuit {

  public static void main(String[] args) {

    int num1 = 10;
    int i = 2;

    // 논리 곱(&&)의 경우 두 항의 결과가 모두 true일 때에만 true이므로,
    // 앞 항의 결과가 false이면 뒷 항의 결과를 평가하지 않는다.
    boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
    System.out.println(value);
    System.out.println(num1);
    System.out.println(i);

    // 논리 합(||)의 경우 두 항의 결과가 모두 false일 때에만 false이므로,
    // 앞 항의 결과가 true이면 뒷 항의 결과를 평가하지 않는다.
    value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);
    System.out.println(value);
    System.out.println(num1);
    System.out.println(i);

  }

}