package ch06;

public class TestMethod {

  int num;

  // 메서드(함수)
  // 메서드 이름은 주소값을 나타낸다.
  // 메서드는 명령어의 집합이고, 프로그램이 로드되면 메서드 영역(코드 영역)에 메서드가 위치하게 된다.
  // 해당하는 메서드가 호출되면, 메서드가 위치한 주소를 찾아 명령어가 실행된다.
  // 이 때, 메서드에서 사용하는 변수들은 스택 메모리에 위치하게 된다.
  // 이로인해 서로 다른 인스턴스라 할지라도 같은 메서드를 호출하는 결과가 나온다.
  // 인스턴스가 생성되면 변수는 힙 메모리에 따로 생성되지만 메서드는 처음 한 번만 로드된다.
  void aaa() {
    System.out.println("aaa() 호출");
  }

  public static void main(String[] args) {
    TestMethod a1 = new TestMethod();
    a1.aaa();

    TestMethod a2 = new TestMethod();
    a2.aaa();
  }

}