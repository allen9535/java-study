package ch09;

public class MakeReportTest {

  public static void main(String[] args) {

    MakeReport builder = new MakeReport();

    String report = builder.getReport();

    System.out.println(report);

  }

}