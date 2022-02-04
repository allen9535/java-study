package ch04;

public class StringTextBlock {

  public static void main(String[] args) {
    // 자바 13부터는 텍스트 블록(text block)을 사용할 수 있다.
    // 문자열을 """ """ 사이에 이어서 만들 수 있다.
    // html, json 문자열을 만드는데 유용하게 사용할 수 있다.
    // 현재 자바 버전은 11이므로, 아래 구문은 오류가 발생한다.
    //    String strBlock = """This is text block test.""";
  }

  //  public static String getBlockOfHtml() {
  //    return """<html><body><span>example text</span></body></html>"""
  //  }

}