package ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

  public static void main(String[] args) throws ClassNotFoundException {
    Class c1 = Class.forName("java.lang.String");

    // reflection 프로그래밍
    // Class 클래스를 통해 클래스의 정보(생성자, 변수, 메서드 등)를 알 수 있다.
    // 인스턴스를 생성하고 메서드를 호출하는 방식의 프로그래밍이다.
    // 로컬 메모리에 객체가 없을 경우나 원격 프로그래밍을 할 때, 객체의 타입을 알 수 없는 경우 사용한다.
    // java.lang.reflect 패키지에 있는 클래스를 활용해 프로그래밍한다.
    // 일반적으로 자료형을 알고 있는 경우 사용하지 않는다.
    Constructor<String>[] cons = c1.getConstructors();
    for (Constructor c: cons) {
      System.out.println(c);
    }
    System.out.println();

    Method[] methods = c1.getMethods();
    for (Method m: methods) {
      System.out.println(m);
    }
  }

}