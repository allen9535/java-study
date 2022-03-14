package ch09;

import java.util.ArrayList;
import ch09.domain.Customer;

public class CustomerTest {

  // 1. 고객의 명단을 출력하라.
  // 2. 여행 총 비용을 계산하라.
  // 3. 고객 중 20세 이상인 사람의 이름을 정렬하여 출력하라.
  public static void main(String[] args) {
    Customer customerLee = new Customer("이모", 40);
    Customer customerKim = new Customer("김모", 20);
    Customer customerHong = new Customer("홍모", 13);

    ArrayList<Customer> customerList = new ArrayList<>();
    customerList.add(customerLee);
    customerList.add(customerKim);
    customerList.add(customerHong);

    System.out.println("고객 명단: ");
    customerList.forEach(c -> System.out.printf("\t%s\n", c.getName()));

    System.out.println("총 비용: ");
    System.out.printf("\t%d만원\n", customerList.stream().mapToInt(c -> c.getCost()).sum());

    System.out.println("20세 이상인 고객: ");
    customerList.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted()
    .forEach(c -> System.out.printf("\t%s\n", c));
  }

}