package ch08;

//제네릭 메서드
//자료형 매개 변수를 메서드의 매개 변수나 반환 값으로 가지는 메서드는
//자료형 매개 변수가 하나 이상인 경우가 있다.
//제네릭 클래스가 아니라 하더라도 내부에 제네릭 메서드를 구현해 사용할 수 있다.
//public <자료형 매개 변수> 반환형 메서드명(자료형 매개 변수...) {}

public class GenericMethod {

  //제네릭 메서드 활용
  //두 점(top, bottom)을 기준으로 사각형을 만들 때 사각형의 너비를 구하는 메서드를 만든다.
  //두 점은 정수일 수 있고, 실수일 수 있으므로 제네릭 타입을 사용해 구현한다.
  public static <T, V> double makeRectangle(Point<T, V> p1, Point<T, V> p2) {
    double left = ((Number)p1.getX()).doubleValue();
    double right = ((Number)p2.getX()).doubleValue();
    double top = ((Number)p1.getY()).doubleValue();
    double bottom = ((Number)p2.getY()).doubleValue();

    return ((right - left) * (bottom - top));
  }

  public static void main(String[] args) {
    Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
    Point<Integer, Double> p2 = new Point<Integer, Double>(10, 10.0);

    double rect = GenericMethod.<Integer, Double>makeRectangle(p1, p2);

    System.out.printf("두 점으로 만들어진 사각형의 넓이는 %.1f 입니다.\n", rect);
  }

}