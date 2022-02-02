package ch07;

public class TypeConversion {

  public static void main(String[] args) {

    double dNum = 1.2;
    float fNum = 0.9f;

    // 아래 두 방식은 서로 다른 방식이다. 값이 달라지는 것에 주의.
    int iNum1 = (int)dNum + (int)fNum;
    int iNum2 = (int)(dNum + fNum);

    System.out.println(iNum1);
    System.out.println(iNum2);

  }

}