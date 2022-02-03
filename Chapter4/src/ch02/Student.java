package ch02;

public class Student implements Cloneable {

  private int studentId;
  private String studentName;

  public Student(int studentId, String studentName) {
    this.studentId = studentId;
    this.studentName = studentName;
  }

  // equals() 메서드
  // 두 인스턴스의 주소값을 비교하여 true / false를 반환한다.
  // 재정의를 통해 두 인스턴스가 논리적으로 동일한지의 여부를 구현한다.
  // 인스턴스가 다르다 하더라도 논리적으로 동일하다면 true를 반환하도록 재정의할 수 있다.
  // 예) 서로 다른 인스턴스라도 학번이 같으면 동일 학생이다.
  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Student) {
      Student std = (Student)obj;

      if (this.studentId == std.studentId) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }

  // hashCode() 메서드
  // 힙 메모리에서 사용하는 인스턴스 저장 방식을 hash 방식이라 하는데,
  // hashCode() 메서드는 인스턴스가 저장된 주소를 반환한다.
  // * hash: 정보를 저장, 검색하는 자료 구조
  // * index = hash(key)    // 저장위치 = 해시함수(객체정보)
  // 자료의 특정 값(key)에 대한 저장 위치(index)를 반환해주는 해시 함수를 사용

  // 논리적으로 동일한지의 여부를 위해 equals() 메서드를 재정의했다면,
  // hashCode() 메서드도 재정의하여 동일한 hashCode() 값이 반환되도록 해야 한다.
  @Override
  public int hashCode() {
    return studentId;
  }

  // clone() 메서드
  // 객체 원본을 복제하는 메서드
  // 복잡한 생성과정을 반복하지 않으면서 복제가 가능하다.
  // clone() 메서드를 사용하게 되면 객체의 정보(변수 값 등)가 동일한 또 다른 인스턴스가 생성되므로,
  // 객체지향 프로그래밍의 정보 은닉, 객체 보호 관점에는 위배될 수 있다.
  // clone() 메서드를 사용하려는 클래스에서는 이를 허용한다는 의미로 Cloneable 인터페이스를 명시해야 한다.
  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

}