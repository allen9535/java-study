package ch10;

public class Person {

  String name;
  int age;

  public Person() {
    // this의 역할: 생성자에서 또 다른 생성자를 호출한다.
    // 이 경우, 인스턴스 생성이 완전히 가능한 상태가 아니므로,
    // this 구문 이전에 다른 코드를 작성할 수 없다. 
    this("이름 없음", 1);
  }

  public Person(String name, int age) {
    // this의 역할: 인스턴스 자신의 메모리를 가리킨다.
    this.name = name;
    this.age = age;
  }

  public void showPerson() {
    System.out.printf("%s, %d\n", name, age);
  }

  public Person getPerson() {
    // this의 역할: 자신의 주소(참조값)을 반환한다.
    return this;
  }

  public static void main(String[] args) {
    Person p = new Person();
    p.showPerson();
    p.name = "James";
    p.age = 37;
    System.out.println(p);

    Person p2 = p.getPerson();
    System.out.println(p2);
  }

}