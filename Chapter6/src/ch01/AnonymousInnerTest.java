package ch01;

class Outer2 {

  Runnable getRunnable(int i) {
    int num = 100;

    return new Runnable() {
      @Override
      public void run() {
        // 오류 발생!
        // num = 200;
        // 오류 발생!
        // i = 10;
        System.out.println(i);
        System.out.println(num);
      }
    };
  }

  // 익명 내부 클래스
  // 이름이 없는 클래스이다.
  // 클래스 이름을 생략하며, 주로 한 개의 인터페이스나 한 개의 추상 클래스를 구현하여 반환한다.
  // 인터페이스나 추상 클래스 자료형의 변수에 직접 대입해서 클래스를 생성하거나,
  // 지역 내부 클래스의 메서드 내부에서 생성해 반환할 수 있다.
  // widget 이벤트 핸들러 등에 활용된다.
  // 예) button1.setOnClickListener(new View.OnClickListener() {
  //        public boolean onClick(View v) {
  //            Toast.makeText(getBaseContext(), "hello", Toast.LENGTH_LONG).show();
  //
  //            return true;
  //        }
  //    });
  Runnable runner = new Runnable() {
    @Override
    public void run() {
      System.out.println("Runnable이 구현된 익명 클래스 변수");
    }
  };

}

public class AnonymousInnerTest {

  public static void main(String[] args) {
    Outer2 out = new Outer2();
    Runnable runner = out.getRunnable(10);

    runner.run();

    out.runner.run();
  }

}