package ch05;

public class AboutClass {

  public static void main(String[] args) throws 
  ClassNotFoundException, InstantiationException, IllegalAccessException {
    // Class 클래스
    // 자바의 모든 클래스와 인터페이스는 컴파일 후 class 파일이 생성된다.
    // Class 클래스는 컴파일 된 class 파일을 로드하여 객체를 동적 로드하고,
    // 정보를 가져오는 메서드가 제공된다.
    // Class.forName("클래스 이름") 메서드로 클래스를 동적 로드한다.
    Class c1 = Class.forName("java.lang.String");
    // 클래스 이름으로 직접 Class 클래스 가져오기
    Class c2 = String.class;
    // 인스턴스를 생성하고 Class 클래스 가져오기
    String s = new String();
    // Object 메서드
    Class c3 = s.getClass();

    // new 키워드를 사용하지 않고 Class의 newInstance() 메서드를 통해 인스턴스를 생성할 수 있다.
    Class c4 = (Class)c3.newInstance();

    // 동적 로딩
    // 컴파일 시 데이터 타입이 바인딩(binding) 되는 것이 아니라,
    // 실행(runtime) 중 데이터 타입을 바인딩하는 방식이다.
    // 프로그래밍 할 때에는 문자열 변수로 처리하고, 
    // 실행 할 때에는 원하는 클래스를 로딩하고 바인딩할 수 있다는 장점이 있다.
    // 컴파일 할 때 타입이 정해지는 것이 아니므로 동적 로딩시 오류가 발생하게 되면
    // 프로그램에 심각한 장애가 발생할 수 있다는 단점이 있다.
  }

}