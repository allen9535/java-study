package ch06;

public class LocalVariableType {

  public static void main(String[] args) {

    // 자바 10 이상에서, 추론 가능한 지역 변수에 대해 자료형을 선언하지 않을 수 있다.
    var i = 10;
    var j = 10.0;
    var str = "hello";

    System.out.println(i);
    System.out.println(j);
    System.out.println(str);

    str = "test";

    // 한 번 추론이 끝난 변수에 대해 다른 타입의 값을 대입할 수 없다.
    //    str = 3;

  }

}