package ch03;

public class MyLambdaTest {

  public static void main(String[] args) {
    // 인터페이스 MyLambda 자료형인 변수 lambda에 람다식을 대입한다.
    MyLambda lambda = (x, y) -> (x >= y)? x:y;

    System.out.println(lambda.getMax(10, 20));
  }

}