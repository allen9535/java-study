package ch12;

public class Answer {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.setName("Edward");
    customer.setMoney(20000);

    Taxi taxi = new Taxi();
    taxi.setCompany("잘나간다 운수");

    customer.setMoney(20000, 10000);
    taxi.setIncome(10000);

    System.out.printf("%s님의 남은 돈은 %d원 입니다.\n", customer.getName(), customer.getMoney());
    System.out.printf("%s택시의 수입은 %d원 입니다.\n", taxi.getCompany(), taxi.getIncome());
  }

}