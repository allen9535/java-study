package ch16;

// 싱글톤 패턴: 프로그램에서 인스턴스가 단 한개만 생성되어야 할 경우 사용하는 디자인 패턴
// 예) 날짜(타임존이 다르더라도 년, 월, 일, 시, 분, 초가 동일해야 하므로)
// 예) 회사(사원은 여러 명 있을 수 있지만 그 사원들이 일하는 회사는 하나이므로)
// static 변수, 메서드를 활용해 구현한다.
public class Company {

  // 생성자를 선언해두지 않으면 컴파일러가 기본 생성자를 만들게 되고,
  // 외부에서 접근해 쉽게 새 인스턴스를 만들 수 있게 된다.
  // 이러한 상황을 방지하기 위해 생성자를 private으로 선언한다.
  private Company() {
    // 필요한 코드가 있다면 삽입해도 된다.
  }

  // 현재 클래스의 유일한 인스턴스를 생성한다.
  // 캡슐화를 위해 private으로 선언한다.
  private static Company instance = new Company();

  // 현재 클래스에서 생성된 유일한 인스턴스에 접근할 수 있는 getter를 제공한다.
  public static Company getInstance() {
    // 인스턴스가 생성되지 않았다면 새 인스턴스를 생성하라는 코드
    // 그럴 일은 없겠지만, 만약을 위한 방어적인 코드이다.
    if (instance == null) {
      instance = new Company();
    }

    return instance;
  }

}