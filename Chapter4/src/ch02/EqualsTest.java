package ch02;

public class EqualsTest {

  // 두 인스턴스가 같다는 것
  // 두 인스턴스가 힙 메모리에서의 주소값이 같을 때를 말한다.(물리적 주소 X, 논리적 주소 O)
  // --> 두 인스턴스에 대한 equals()의 반환 값이 true일 때
  // --> 동일한 hashCode() 값을 반환할 때
  public static void main(String[] args) throws CloneNotSupportedException {
    Student lee = new Student(100, "이모");
    Student lee2 = lee;
    Student leemo = new Student(100, "이모");

    // 두 객체는 서로 다른 객체이므로 false가 반환된다.
    System.out.println("--------------- lee == leemo ---------------");
    System.out.println(lee == leemo);
    // 두 객체의 주소값이 다르므로 원래는 false가 반환되어야 하나,
    // Student 클래스에서 논리적으로 동일한 경우 true를 반환하도록 equals() 메서드를 재정의 했으므로
    // 현재는 true가 반환된다.
    System.out.println("--------------- lee.equals(leemo) ---------------");
    System.out.println(lee.equals(leemo));

    // 원래는 힙 메모리에서의 주소 값을 반환해야 하나,
    // Student 클래스에서 학번을 반환하도록 hashCode() 메서드를 재정의 했으므로
    // 현재는 학번이 반환된다.
    System.out.println("--------------- lee.hashCode() ---------------");
    System.out.println(lee.hashCode());
    // lee와 leemo는 서로 다른 인스턴스이므로 서로 다른 값이 반환되어야 하지만
    // 현재는 학번이 출력되도록 되어 있으므로 같은 값이 반환된다.
    System.out.println("--------------- leemo.hashCode() ---------------");
    System.out.println(leemo.hashCode());

    Integer i1 = new Integer(100);
    Integer i2 = new Integer(100);

    // Integer가 hashCode() 메서드를 사용할 경우 해당 값이 위치한 주소 값을 반환하는 것이 아니라
    // 입력한 정수 값이 반환된다.
    // 따라서 서로 다른 인스턴스라 하더라도 같은 정수 값을 가졌다면
    // equals의 결과도 true로 나오고 hashCode의 결과도 같게 나온다.
    System.out.println("--------------- i1.equals(i2) ---------------");
    System.out.println(i1.equals(i2));
    System.out.println("--------------- i1.hashCode() ---------------");
    System.out.println(i1.hashCode());
    System.out.println("--------------- i2.hashCode() ---------------");
    System.out.println(i2.hashCode());

    // identityHashCode() 함수
    // System 클래스의 스태틱 함수인데,
    // hashCode() 함수와 달리 실제 주소 값을 반환한다.
    System.out.println("--------------- System.identityHashCode(i1) ---------------");
    System.out.println(System.identityHashCode(i1));
    System.out.println("--------------- System.identityHashCode(i2) ---------------");
    System.out.println(System.identityHashCode(i2));

    // clone() 함수를 통해 객체의 내용을 그대로 복사했다 하더라도 서로 다른 인스턴스이다.
    Student lee3 = (Student)lee.clone();
    System.out.println("--------------- System.identityHashCode(lee) ---------------");
    System.out.println(System.identityHashCode(lee));
    System.out.println("--------------- System.identityHashCode(lee3) ---------------");
    System.out.println(System.identityHashCode(lee3));
  }

}