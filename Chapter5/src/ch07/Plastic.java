package ch07;

public class Plastic extends Material {

  @Override
  public void doPrinting() {
    System.out.println("Plastic을 사용해 출력합니다.");
  }

  @Override
  public String toString() {
    return "재료는 Plastic 입니다.";
  }

}