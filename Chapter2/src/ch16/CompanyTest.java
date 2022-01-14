package ch16;

import java.util.Calendar;

public class CompanyTest {

  public static void main(String[] args) {
    Company company1 = Company.getInstance();
    Company company2 = Company.getInstance();

    System.out.println(company1);
    System.out.println(company2);

    // 자바에서 제공하는 Calendar 클래스
    // 싱글톤 패턴이 적용되어 있다.
    Calendar calendar = Calendar.getInstance();
  }

}