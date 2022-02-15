package ch06;

//아래는 제네릭 타입을 사용하지 않는 경우의 예
public class ThreeDPrinterObj {

  //여러 타입을 대체하기 위해 Object를 사용할 수 있다.
  private Object material;

  public Object getMaterial() {
    return material;
  }

  public void setMaterial(Object material) {
    this.material = material;
  }

}