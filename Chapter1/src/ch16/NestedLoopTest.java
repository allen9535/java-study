package ch16;

public class NestedLoopTest {

  public static void main(String[] args) {

    int dan = 2;
    int count = 1;

    // 아래 for문은 단 수만 증가한다.
    for (dan = 2; dan <= 9; dan++) {
      System.out.printf("%d x %d = %d\n", dan, count, dan * count);
    }
    System.out.println();

    // 아래 while문이 제대로 된 구구단을 출력한다.
    dan = 2;
    while (dan <= 9) {
      count = 1;
      while (count <= 9) {
        System.out.printf("%d x %d = %d\n", dan, count, dan * count);
        count++;
      }
      dan++;
      System.out.println();
    }

  }

}