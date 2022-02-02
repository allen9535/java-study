package ch17;

public interface Buy {

  void buy();

  // Sell 인터페이스에 같은 이름으로 존재하는 디폴트 메서드.
  // 인터페이스를 구현하는 클래스에서 반드시 재정의 해야 한다.
  default void order() {
    System.out.println("구매 주문");
  }

}