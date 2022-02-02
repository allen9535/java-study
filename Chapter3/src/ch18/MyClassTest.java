package ch18;

public class MyClassTest {

  public static void main(String[] args) {
    MyClass mClass = new MyClass();

    X xClass = mClass;
    xClass.x();
    System.out.println("------------------------------");

    Y yClass = mClass;
    yClass.y();
    System.out.println("------------------------------");

    MyClass mmClass = mClass;
    mmClass.x();
    mmClass.y();
    mmClass.myMethod();
  }

}