package ch06;

// 제네릭 클래스 정의
// 자료형 매개변수 T(Type parameter): 이 클래스를 사용하는 시점에 실제 사용할 자료형을 지정한다.
//                                    static 변수는 사용할 수 없다.
// GenericPrinter: 제네릭 자료형
// E(Element), K(Key), V(Value) 등 여러 알파벳을 의미에 따라 사용할 수 있다.

// 아래는 제네릭 타입을 사용한 예
public class GenericPrinter<T> {

  // T 자료형으로 변수 선언
  private T material;

  // T 자료형을 반환하는 제네릭 메서드
  public T getMaterial() {
    return material;
  }

  public void setMaterial(T material) {
    this.material = material;
  }

  @Override
  public String toString() {
    return material.toString();
  }

}