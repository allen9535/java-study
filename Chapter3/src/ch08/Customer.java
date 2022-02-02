package ch08;

public class Customer {

  protected int customerID;
  protected String customerName;
  protected String customerGrade;
  protected int bonusPoint;
  protected double bonusRatio;

  public Customer(int customerID, String customerName) {
    this.customerID = customerID;
    this.customerName = customerName;

    customerGrade = "SILVER";
    bonusRatio = 0.01;
  }

  public int getCustomerID() {
    return customerID;
  }

  public void setCustomerID(int customerID) {
    this.customerID = customerID;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public String getCustomerGrade() {
    return customerGrade;
  }

  public void setCustomerGrade(String customerGrade) {
    this.customerGrade = customerGrade;
  }

  public int getBonusPoint() {
    return bonusPoint;
  }

  public void setBonusPoint(int bonusPoint) {
    this.bonusPoint = bonusPoint;
  }

  public double getBonusRatio() {
    return bonusRatio;
  }

  public void setBonusRatio(double bonusRatio) {
    this.bonusRatio = bonusRatio;
  }

  public int calcPrice(int price) {
    bonusPoint += (price * bonusRatio);

    return price;
  }

  public String showCustomerInfo() {
    return customerName + "님의 현재 등급은 " + customerGrade + 
        "이며, 현재 포인트는 " + bonusPoint + "점 입니다.";
  }

}