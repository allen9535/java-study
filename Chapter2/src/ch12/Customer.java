package ch12;

public class Customer {

  private String name;
  private int money;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getMoney() {
    return money;
  }

  public void setMoney(int money) {
    this.money = money;
  }

  public void setMoney(int money, int charge) {
    this.money = money - charge;
  }

}