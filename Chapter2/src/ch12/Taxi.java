package ch12;

public class Taxi {

  private String company;
  private int income;

  public String getCompany() {
    return company;
  }
  public void setCompany(String company) {
    this.company = company;
  }
  public int getIncome() {
    return income;
  }

  public void setIncome(int income) {

    if (income == 0) {
      this.income = income;
    }

    this.income += income;

  }

}