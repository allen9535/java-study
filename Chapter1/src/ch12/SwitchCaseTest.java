package ch12;

public class SwitchCaseTest {

  public static void main(String[] args) {

    int month = 10;
    int day;

    switch (month) {
      // 같은 내용을 가진 케이스를 한꺼번에 묶어서 다음과 같이 정리할 수 있다.
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        day = 31;
        // break를 해주지 않으면 다른 조건에 해당하는 내용도 실행하게 될 수 있다.
        break;
      case 4: case 6: case 9: case 11:
        day = 30;
        break;
        // 위 조건 중 만족하는 것이 없을 경우 default의 내용을 실행한다.
      default:
        day = 0;
        System.out.println("존재하지 않는 달입니다.");
    }

    System.out.printf("%d월은 %d일입니다.", month, day);

  }

}