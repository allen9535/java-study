package ch01;

// 내부 클래스(Inner Class)
// 클래스 내부에 선언한 클래스로 이 클래스를 감싸고 있는 외부 클래스와 밀접한 연관을 가지는 경우가 많다.
// 다른 외부 클래스에서 사용할 일이 거의 없을 경우 내부 클래스로 선언해 사용한다.
// 중첩 클래스라고도 한다.
// 내부 클래스 종류: 인스턴스 내부 클래스, 정적 내부 클래스, 지역 내부 클래스, 익명 내부 클래스
class OutClass {

  private int num = 10;
  private static int sNum = 20;
  private InClass inClass;

  public OutClass() {
    // 내부 클래스 생성
    inClass = new InClass();
  }

  // 인스턴스 내부 클래스(Instance Inner Class)
  // 내부적으로 사용할 클래스를 선언한다.(private으로 선언하는 것을 권장한다.)
  // 외부 클래스가 생성된 다음 생성된다.(정적 내부 클래스와는 다르다.)
  // private이 아닌 내부 클래스는 다른 외부 클래스에서 생성 가능하다.
  class InClass {
    int inNum = 10;
    // 오류 발생!
    // static int sInNum = 200;

    void inTest() {
      System.out.printf("OutClass num = %d(외부 클래스 인스턴스 변수)\n", num);
      System.out.printf("OutClass sNum = %d(외부 클래스 스태틱 변수)\n", sNum);
      System.out.printf("OutClass inNum = %d(내부 클래스 인스턴스 변수)\n", inNum);
    }

    // 오류 발생!
    //    static void sTest() {
    //
    //    }
  }

  public void usingClass() {
    // 내부 클래스 변수를 통해 메서드 호출
    inClass.inTest();
  }

  static class InStaticClass {
    int inNum = 100;
    static int sInNum = 200;

    void inTest() {
      // 에러 발생!
      // 외부 클래스의 인스턴스 변수는 사용 불가능하다.
      //      num += 10;
      System.out.printf("InStaticClass inNum = %d(내부 클래스 인스턴스 변수)\n", inNum);
      System.out.printf("InStaticClass sInNum = %d(내부 클래스 스태틱 변수)\n", sInNum);
      System.out.printf("OutClass sNum = %d(외부 클래스 스태틱 변수)\n", sNum);
    }

    // 정적 클래스의 스태틱 메서드
    static void sTest() {
      // 외부 클래스의 인스턴스 변수는 사용 불가능하다.
      //      num += 10;
      //      inNum += 10;
      System.out.printf("OutClass sNum = %d(외부 클래스 스태틱 변수)\n", sNum);
      System.out.printf("InStaticClass sInNum = %d(내부 클래스 스태틱 변수)\n", sInNum);
    }
  }

}

public class InnerTest {

  public static void main(String[] args) {
    OutClass outClass = new OutClass();
    System.out.println("외부 클래스를 통해 내부 클래스 기능 호출");
    // 내부 클래스 기능 호출
    outClass.usingClass();
    System.out.println();

    // 외부 클래스를 통해 내부 클래스 생성
    OutClass.InClass inClass = outClass.new InClass();
    System.out.println("외부 클래스 변수를 통해 내부 클래스 생성");
    inClass.inTest();

    // 외부 클래스를 통하지 않고 바로 정적 내부 클래스 생성
    OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
    System.out.println("정적 내부 클래스의 일반 메서드 호출");
    sInClass.inTest();
    System.out.println();

    System.out.println("정적 내부 클래스의 스태틱 메서드 호출");
    OutClass.InStaticClass.sTest();
  }

}