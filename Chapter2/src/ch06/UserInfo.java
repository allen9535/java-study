package ch06;

public class UserInfo {

  int height;
  int weight;
  String name;
  int age;

  public UserInfo() {}

  public UserInfo(int height, int weight, String name, int age) {
    this.height = height;
    this.weight = weight;
    this.name = name;
    this.age = age;
  }

  public String printUserInfo() {
    return "키 " + height + "cm, 몸무게 " + weight + "kg, 이름 " + name + ", 나이 " + age + "살 입니다.";
  }

}