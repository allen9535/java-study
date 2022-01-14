package ch09;

public class MakeReport {

  StringBuffer buffer = new StringBuffer();

  private String line = "============================================================\n";
  private String title = "이름\t주소\t\t전화번호\n";

  private void makeHeader() {
    buffer.append(line);
    buffer.append(title);
    buffer.append(line);
  }

  private void generateBody() {
    buffer.append("James\t");
    buffer.append("Seoul Korea\t");
    buffer.append("010-2222-3333\n");

    buffer.append("Thomas\t");
    buffer.append("NewYork US\t");
    buffer.append("010-4444-5555\n");
  }

  private void makeFooter() {
    buffer.append(line);
  }

  // 캡슐화: 꼭 필요한 정보와 기능만 외부에 공개한다.
  // 대체로 변수나 메서드 등은 감추고 인터페이스를 제공해 일관된 기능을 구현한다.
  // 변수나 메서드 등에 접근함으로써 발생할 수 있는 오류들을 줄인다.
  public String getReport() {
    makeHeader();
    generateBody();
    makeFooter();

    return buffer.toString();
  }

}