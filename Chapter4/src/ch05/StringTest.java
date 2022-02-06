package ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

  public static void main(String[] args) throws ClassNotFoundException {
    Class c1 = Class.forName("java.lang.String");

    // 클래스 생성자(Constructor)를 반환받는 메서드 getConstructors()
    System.out.println("--------------- getConstructors() ---------------");
    Constructor[] cons = c1.getConstructors();
    for (Constructor c: cons) {
      System.out.println(c);
    }
    System.out.println();

    // 클래스 메서드를 반환받는 메서드 getMethods()
    System.out.println("--------------- getMethods() ---------------");
    Method[] methods = c1.getMethods();
    for (Method m: methods) {
      System.out.println(m);
    }
  }

}