package ch12;

public class SwitchCaseUpTest {

  public static void main(String[] args) {

    // 자바 14부터는 Switch Expression이 지원된다.
    int month = 3;

    // 식으로 표현하여 리턴 받을 수 있다.
    // 리턴 값이 없는 경우 오류가 발생한다.
    int day = switch (month) {
      // 간단하게 쉼표로 조건을 구분할 수 있다.
      case 1, 3, 5, 7, 8, 10, 12 -> {
        System.out.println("한 달은 31일입니다.");
        // yield를 사용하여 리턴할 값을 지정할 수 있다.
        yield 31;
      }
      case 4, 6, 9, 11 -> {
        System.out.println("한 달은 30일입니다.");
        yield 30;
      }
      case 2 -> {
        System.out.println("한 달은 28일입니다.");
        yield 28;
      }
      default -> {
        System.out.println("존재하지 않는 달입니다.");
        yield 0;
      }
    };

    System.out.printf("%d월은 %d일입니다.", month, day);

  }

}