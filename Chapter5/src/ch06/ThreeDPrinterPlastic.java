package ch06;

//아래는 제네릭 타입을 사용하지 않는 경우의 예
public class ThreeDPrinterPlastic {

  //3D 프린터에 들어갈 재료가 Plastic인 경우
  private Plastic material;

  public Plastic getMaterial() {
    return material;
  }

  public void setMaterial(Plastic material) {
    this.material = material;
  }

}