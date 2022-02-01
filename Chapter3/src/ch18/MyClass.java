package ch18;

public class MyClass implements MyInterface {

  @Override
  public void x() {
    System.out.println("인터페이스 X의 메서드 x()");
  }

  @Override
  public void y() {
    System.out.println("인터페이스 Y의 메서드 y()");
  }

  @Override
  public void myMethod() {
    System.out.println("인터페이스 X와 Y를 상속받은 인터페이스 MyInterface의 메서드 mymethod()");
  }

}