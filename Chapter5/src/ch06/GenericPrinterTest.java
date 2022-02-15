package ch06;

public class GenericPrinterTest {

  public static void main(String[] args) {
    // 다이아몬드 연산자(<>)
    // <> 표시를 다이아몬드 연산자라고 한다.
    // 이전에도 사용한 적 있다.(ArrayList list = new ArrayList<>())
    // 위 예와 같이, 다이아몬드 연산자 내부에서 자료형은 생략 가능하다.
    GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
    powderPrinter.setMaterial(new Powder());
    System.out.println(powderPrinter);

    GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
    plasticPrinter.setMaterial(new Plastic());
    System.out.println(plasticPrinter);
  }

}