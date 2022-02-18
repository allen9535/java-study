package ch09;

public class AboutCollectionFramework {

  // 컬렉션 프레임워크
  // 프로그램 구현에 필요한 자료 구조(Data Structure)를 구현해놓은 JDK 라이브러리를 말한다.
  // java.util 패키지에 구현되어 있다.
  // 개발에 소요되는 시간을 절약하고, 최적화된 알고리즘을 사용할 수 있다.
  // 여러 구현 클래스와 인터페이스 활용에 대한 이해가 필요하다.

  // Collection 인터페이스
  // 한 개의 객체를 관리하기 위한 메서드가 선언된 인터페이스로, 
  // 하위 인터페이스로 List와 Set 인터페이스가 있다.

  // List 인터페이스
  // 객체를 순서에 따라 저장하고 관리하는데 필요한 메서드가 선언되어 있는 인터페이스로,
  // 자료 구조 리스트(배열, 링크드 리스트) 구현을 위한 인터페이스이다.
  // 중복을 허용한다.
  // ArrayList, Vector, LinkedList, Stack, Queue 등이 있다.

  // Set 인터페이스
  // 순서와 관계없이 중복을 허용하지 않으며 유일한 값을 관리하는데 필요한 메서드가 선언되어 있는 인터페이스로,
  // 아이디, 주민번호, 사번 등의 데이터를 관리하는데 유용하다.
  // 저장된 순서와 출력되는 순서는 다를 수도 있다.
  // HashSet, TreeSet 등이 있다.

  // Map 인터페이스
  // 쌍(pair)으로 이루어진 객체를 관리하는데 사용하는 메서드들이 선언된 인터페이스이다.
  // 객체는 키(key)와 밸류(value)의 한 쌍으로 이루어진다.
  // 키는 중복을 허용하지 않는다.
  // HashTable, HashMap, TreeMap 등이 있다.

}