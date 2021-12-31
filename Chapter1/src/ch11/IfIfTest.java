package ch11;

public class IfIfTest {

  public static void main(String[] args) {

    // if-else if문과 if-if문의 차이점
    // if-else if를 사용할 경우 하나의 조건이 만족되면 나머지 else if는 수행되지 않는다.
    // if-if를 사용할 경우 각각의 조건을 하나하나 검증하고 수행한다.
    int age = 12;
    int charge;

    if (age < 8) {
      charge = 1000;
      System.out.println("미취학 아동입니다.");
    }
    if (age < 14) {
      charge = 2000;
      System.out.println("초등학생입니다.");
    }
    if (age < 20) {
      charge = 2500;
      System.out.println("중고등학생입니다.");
    } else {
      charge = 3000;
      System.out.println("일반인입니다.");
    }

    System.out.printf("입장료는 %d원 입니다.\n", charge);

  }

}