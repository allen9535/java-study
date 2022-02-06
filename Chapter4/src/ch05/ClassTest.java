package ch05;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

  public static void main(String[] args) throws 
  ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, 
  SecurityException, IllegalArgumentException, InvocationTargetException {
    // reflection 프로그래밍
    // Class 클래스를 통해 클래스의 정보(생성자, 변수, 메서드 등)를 알 수 있다.
    // 인스턴스를 생성하고 메서드를 호출하는 방식의 프로그래밍이다.
    // 로컬 메모리에 객체가 없는 경우나 원격 프로그래밍을 할 때, 객체의 타입을 알 수 없는 경우에 사용한다.
    // java.lang.reflect 패키지에 있는 클래스를 활용해 프로그래밍한다.
    // 일반적으로 자료형을 알고 있는 경우 사용하지 않는다.
    // * 로컬 메모리에 객체가 없는 경우: 서로 다른 프로세스에서 작동할 때 등의 상황을 말한다.
    //   쉽게 말해 서로 다른 창을 띄워서 작업하는 등의 상황이다.

    // new를 사용해 인스턴스를 생성하는 것과 같은 결과가 나온다.
    Class c1 = Class.forName("ch05.Person");
    Person p1 = (Person)c1.newInstance();

    // 이미 인스턴스가 생성되어 있다면 getClass() 메서드를 통해 클래스를 가져올 수 있다.
    Class c2 = p1.getClass();
    Person p2 = (Person)c2.newInstance();
    System.out.println(p2);

    // String 클래스 타입을 반환한다.
    Class[] parameterTypes = {String.class};
    // 파라미터 타입으로 해당 클래스가 들어가는 생성자를 반환한다.
    Constructor cons = c1.getConstructor(parameterTypes);
    // 생성자에 넣을 파라미터 값을 Object 배열로 만든다.
    Object[] initargs = {"김모"};
    // 해당 배열을 인스턴스에 넣어준다.
    Person kim = (Person)cons.newInstance(initargs);
    System.out.println(kim);
  }

}