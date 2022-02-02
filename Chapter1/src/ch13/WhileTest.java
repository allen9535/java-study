package ch13;

public class WhileTest {
  public static void main(String[] args) {

    int num = 1;
    int sum = 0;

    // 무한 반복이 필요하다면 while(true)를 사용하면 된다.
    while (num <= 10) {
      sum += num;
      num++;
    }

    System.out.println(sum);
    System.out.println(num);

  }
}