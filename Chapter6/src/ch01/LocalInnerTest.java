package ch01;

class Outer {

  int outNum = 100;
  static int sNum = 200;

  // 지역 내부 클래스
  // 지역 변수와 같이 메서드 내부에서 정의해 사용하는 클래스를 말한다.
  // 메서드 호출이 끝나면 그 메서드에서 사용된 지역 변수는 사라진다.
  // 메서드 호출 이후에도 사용해야 하는 경우도 있을 수 있으므로,
  // 지역 내부 클래스에서 사용하는 메서드의 지역 변수나 매개 변수는 모두 final로 선언된다.
  Runnable getRunnable(int i) {
    int num = 100;

    class MyRunnable implements Runnable {
      int localNum = 10;

      @Override
      public void run() {
        // 오류 발생! 지역 변수는 상수로 바뀐다.
        // num = 200;
        // 오류 발생! 매개 변수 또한 상수로 바뀌게 된다.
        // i = 100;
        System.out.printf("i = %d\n", i);
        System.out.printf("num = %d\n", num);
        System.out.printf("localNum = %d\n", localNum);

        System.out.printf("outNum = %d(외부 클래스 인스턴스 변수)\n", outNum);
        System.out.printf("Outter.sNum = %d(외부 클래스 정적 변수)\n", Outer.sNum);
      }
    }

    return new MyRunnable();
  }

}

public class LocalInnerTest {

  public static void main(String[] args) {
    Outer out = new Outer();
    // MyRunnable 클래스를 사용하려면 직접 생성하는 것이 아니라 getRunnable() 메서드를 호출해
    // 생성된 객체를 반환 받는 식으로 사용해야 한다.
    Runnable runner = out.getRunnable(10);
    runner.run();
  }

}