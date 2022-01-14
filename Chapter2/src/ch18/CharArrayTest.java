package ch18;

public class CharArrayTest {

  // 문자 배열을 만들고 A-Z를 저장한 다음 다시 출력하기
  public static void main(String[] args) {
    char[] alphabets = new char[26];
    char ch = 'A';

    for (int i = 0; i < alphabets.length; i++) {
      alphabets[i] = ch++;
    }

    for (int i = 0; i < alphabets.length; i++) {
      System.out.printf("%c, %d\n", alphabets[i], (int)alphabets[i]);
    }

    // for문을 다음과 같이 간단하게 돌릴 수 있다.
    for (char alphabet: alphabets) {
      System.out.printf("%c, %d\n", alphabet, (int)alphabet);
    }
  }

}