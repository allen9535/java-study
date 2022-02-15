package ch06;

// 제네릭(Generic) 프로그래밍
// 클래스에서 사용하는 변수의 자료형이 여러 개일 수 있고, 그 기능은 동일한 경우,
// 클래스의 자료형을 특정하지 않고 추후 해당 클래스를 사용할 때 지정할 수 있도록 선언한다.
// 실제 사용되는 자료형의 변환은 컴파일러에 의해 검증되므로 안정적인 프로그래밍 방식이라 할 수 있다.
// 컬렉션 프레임워크에서 많이 사용되고 있다.

// 아래는 제네릭 타입을 사용하지 않는 경우의 예
public class ThreeDPrinterPowder {

  // 3D 프린터에 들어갈 재료가 Powder인 경우
  private Powder material;

  public void setMaterial(Powder material) {
    this.material = material;
  }

  public Powder getMaterial() {
    return material;
  }

}