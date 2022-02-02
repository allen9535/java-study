package ch14;

import java.util.Scanner;

public class DoWhileTest {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int input;
    int sum = 0;

    // do-while문의 경우 do 블록의 내용을 무조건 한 번은 실행한 다음
    // while의 조건에 따라 반복을 결정한다.
    do {
      input = scanner.nextInt();
      sum += input;
    } while (input != 0);

    System.out.println(sum);

  }

}