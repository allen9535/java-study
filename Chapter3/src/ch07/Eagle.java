package ch07;

public class Eagle extends Animal {

  @Override
  public void move() {
    System.out.println("독수리가 하늘을 난다.");
  }

  public void flying() {
    System.out.println("독수리가 날개를 사용해 하늘을 난다.");
  }

}