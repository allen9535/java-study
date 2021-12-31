package ch09;

public class BitTest {

  public static void main(String[] args) {

    int num1 = 5;
    int num2 = 10;

    // OR: 0|0에서 0을 반환하고 그 외에는 1을 반환한다.
    System.out.println(num1 | num2);
    // AND: 1&1에서 1을 반환하고 그 외에는 0을 반환한다.
    System.out.println(num1 & num2);
    // XOR: 두 개의 비트가 서로 다른 경우 1을 반환한다.
    System.out.println(num1 ^ num2);
    // 비트 반전: 0은 1로, 1은 0으로 바꿔서 반환한다.
    System.out.println(~num1);

    // num1을 왼쪽으로 2비트 이동
    System.out.println(num1 << 2);
    System.out.println(num1);
    // num1을 오른쪽으로 2비트 이동
    System.out.println(num1 >> 2);
    System.out.println(num1);

    // 기타
    // >>>: >>와 동일하지만 이동하고 난 후 채워지는 비트는 부호와 상관없이 0이다.
    // 마스킹: 특정 비트를 가리고 나머지 비트 값만 사용하는 행위
    // - 비트 켜기: 특정 비트들만 1로 설정해서 사용할 때
    // --> 예) &00001111: 하위 4비트 중 1인 비트만 사용
    // - 비트 끄기: 특정 비트들만 0으로 설정해서 사용할 때
    // --> 예) |11110000: 하위 4비트 중 0인 비트만 0으로 만들 때 사용

  }

}