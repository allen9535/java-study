package ch16;

// 싱글톤 패턴으로 객체 구현
// 싱글톤 패턴: 프로그램에서 인스턴스가 단 한개만 생성되어야 할 경우 사용하는 디자인 패턴
// static 변수, 메서드를 활용해 구현한다.
public class Company {

  // 생성자는 private으로 선언한다.
  private Company() {}

  // 클래스 내부에 유일한 private 인스턴스를 생성한다.
  private static Company instance = new Company();

  // 외부에서 인스턴스를 참조할 수 있는 public 메서드를 제공한다.
  public static Company getInstance() {

    if (instance == null) {
      instance = new Company();
    }

    return instance;

  }

}