package ch09.domain;

public class Customer {

  private String name;
  private int age;
  private int cost;

  public Customer(String name, int age) {
    this.name = name;
    this.age = age;
    setCost(age);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getCost() {
    return cost;
  }

  public void setCost(int age) {
    if (age >= 15) {
      this.cost = 100;
    } else {
      this.cost = 50;
    }
  }

}