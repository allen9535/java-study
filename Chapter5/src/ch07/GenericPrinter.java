package ch07;

// <T extends 클래스> 사용
// T 자료형의 범위를 제한할 수 있다.
// 상위 클래스에서 선언하거나 정의하는 메서드를 활용할 수 있다.
// 상속을 받지 않는 경우, T는 Object로 변환되므로 Object 클래스가 기본으로 제공하는 메서드만 사용 가능하다.

// Material 변수의 자료형을 상속받아 GenericPrinter를 구현한다.
// T에 아무 클래스나 들어갈 수 없도록 Material 클래스를 상속받은 클래스로 한정한다.(Plastic, Powder)
public class GenericPrinter<T extends Material> {

  private T material;

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

  public void printing() {
    material.doPrinting();
  }

}