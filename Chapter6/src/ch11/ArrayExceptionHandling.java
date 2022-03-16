package ch11;

public class ArrayExceptionHandling {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    // try-catch문
    // try 블록에는 예외가 발생할 가능성이 있는 코드를,
    // catch 블록에는 예외를 처리하는 코드를 작성한다.
    // try 블록에서 예외가 발생하는 경우 catch 블록이 수행되게 된다.
    try {
      for (int i = 0; i <= 5; i++) {
        System.out.println(arr[i]);
      }
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }

    System.out.println("비정상 종료되지 않았습니다.");
  }

}