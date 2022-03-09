package ch04;

// 객체지향 프로그래밍과 람다식 비교
// 문자열 두 개를 연결하여 출력하는 예제를 각 방식으로 구현해보자.
// 아래는 양 방식에서 사용할 인터페이스이다.
public interface StringConcat {

  public void makeString(String s1, String s2);

}