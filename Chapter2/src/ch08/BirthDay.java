package ch08;

public class BirthDay {

  // 접근 제어 지시자: 클래스 외부에서 클래스의 멤버 변수, 메서드, 생성자를 사용할 수 있는지 여부를
  // 지정하는 키워드
  // private: 같은 클래스 내부에서만 접근 가능(외부 클래스, 상속 관계 클래스도 불가)
  // default: 같은 패키지 내부에서만 접근 가능(상속 관계더라도 패키지가 다르면 접근 불가)
  // protected: 같은 패키지나 상속관계의 클래스에서 접근 가능하고 그 외에는 접근 불가
  // public: 클래스 외부 어디에서든 접근 가능
  private int day;
  private int month;
  private int year;

  private boolean isValid;

  public int getDay() {
    return day;
  }
  public void setDay(int day) {
    this.day = day;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(int month) {
    if (month < 1 || month > 12) {
      isValid = false;
    } else {
      isValid = true;
      this.month = month;
    }
  }
  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }

  public void showDate() {
    if (isValid) {
      System.out.printf("%d년 %d월 %d일 입니다.\n", year, month, day);
    } else {
      System.out.println("유효하지 않은 날짜입니다.");
    }
  }

}