package ch17;

public class CustomerTest {

  public static void main(String[] args) {
    Customer customer = new Customer();
    customer.buy();
    customer.sell();
    customer.greetings();

    Buy buyer = customer;
    buyer.buy();

    Sell seller = customer;
    seller.sell();

    buyer.order();
    seller.order();
    customer.order();
  }
}