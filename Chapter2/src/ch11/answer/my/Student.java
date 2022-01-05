package ch11.answer.my;

public class Student {

  private String name;
  private int principal;
  private int balance;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getPrincipal() {
    return principal;
  }
  public void setPrincipal(int principal) {
    this.principal = principal;
  }
  public int getBalance() {
    return balance;
  }
  public void setBalance(int charge) {
    this.balance = principal - charge;
  }

}