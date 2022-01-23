package ch07;

public class Tiger extends Animal {

  @Override
  public void move() {
    System.out.println("호랑이가 네 발로 뛴다.");
  }

  public void hunting() {
    System.out.println("호랑이가 사냥을 한다.");
  }

}