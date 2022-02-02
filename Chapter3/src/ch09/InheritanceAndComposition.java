package ch09;

public class InheritanceAndComposition {

  // IS-A 관계(is-a realationship)
  // 상속 관계
  // 일반적인(general) 개념과 구체적인(specific) 개념의 관계
  // 상위 클래스는 하위 클래스보다 일반적인 개념이고,    (예. Employee...)
  // 하위 클래스는 상위 클래스보다 구체적인 개념이다.    (예. Engineer, Manager...)
  // 상속은 클래스간의 결합도가 높은 설계이다.
  // 상위 클래스를 수정하게 되면, 많은 하위 클래스에 영향이 미치게 된다.
  // 계층구조가 복잡하거나 hierarchy가 높을 경우 좋지 않다.

  // HAS-A 관계(composition)
  // 클래스가 다른 클래스를 포함하는 관계
  // 한 클래스에서 다른 클래스를 변수로 선언하는 방식이다.
  // 예를 들어, Student의 변수에서 Subject를 선언해 사용하지만 상속은 하지 않는 것과 동일하다.
  // 코드 재사용의 가장 일반적인 방식이다.
  // Library를 구현할 때 ArrayList를 생성해 사용한다.
  // 상속하지 않는다.

}