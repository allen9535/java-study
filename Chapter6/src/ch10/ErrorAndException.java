package ch10;

public class ErrorAndException {

  // 오류와 예외 클래스
  // 시스템 오류(Error): 가상 머신에서 발생하는 오류로, 프로그래머가 처리할 수 없다.
  // 예) 동적 메모리가 없는 경우, 스택 메모리에 오버 플로우가 발생한 경우 등
  // 예외(Exception): 프로그램에서 제어할 수 있는 오류이다.
  // 예) 읽어들일 파일이 없는 경우, 네트워크나 DB 연결이 불가능한 경우 등
  // 자바는 안전성이 중요한 언어이므로, 대부분의 프로그램에서 발생하는 오류에 대한 예외 처리가 필요하다.

  // 예외 클래스
  // 모든 예외 클래스의 최상위 클래스는 Exception 클래스이다.
  // 그 자식 클래스로 IOException(입출력 예외), RuntimeException(실행 오류 예외) 클래스가 있고,
  // 또 IOException의 자식 클래스로
  // FileNotFoundException(참조하는 파일이 존재하지 않음)과 SocketException(소켓 관련 오류) 클래스가,
  // RuntimeException의 자식 클래스로
  // ArithmeticException(정수를 0으로 나눔)과 IndexOutofBoundsException(인덱스 범위를 벗어남) 클래스가 있다.
  // 그 외에도 NullPointerException(초기화 되지 않은 Object 사용),
  // ArrayIndexOutOfBoundsException(배열의 크기를 넘은 위치 참조), ClassNotFoundException(클래스가 로드되지 않음),
  // InterruptedException(
  // Thread.sleep(), Thread.join(), Object.wait() 등에서 non-runnable 스레드를 runnable하게 만들 수 있음)
  // 등이 있다.

}