package ch01;

// toString() 메서드
// 객체의 정보를 String으로 바꿔서 사용할 때 유용하다.
// String이나 Integer 클래스는 이미 재정의되어 있다.
public class Book {

  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // Object 클래스의 toString() 메서드를 재정의한다.
  @Override
  public String toString() {
    return title + "," + author;
  }

}