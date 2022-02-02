package ch05;

public class UserInfo {

  public String userId;
  public String userPassWord;
  public String userName;
  public String userAddress;
  public String phoneNumber;

  // 필요에 의해 여러가지 생성자를 구현할 수 있다.
  // 이 경우 생성자를 호출하는 코드에 따라 다른 생성자를 호출할 수 있게 된다.
  // 구분하는 방법은 매개변수의 종류, 갯수 등이다.
  public UserInfo(){}

  // 이와같이, 같은 이름을 갖는 서로 다른 생성자를 생성하는 것을 생성자 오버로딩(overloading)이라 한다.
  public UserInfo(String userId, String userPassWord, String userName) {
    this.userId = userId;
    this.userPassWord = userPassWord;
    this.userName = userName;
  }

  public String showUserInfo() {
    return "고객님의 아이디는 " + userId + "이고, 등록된 이름은 " + userName + "입니다."; 
  }

}