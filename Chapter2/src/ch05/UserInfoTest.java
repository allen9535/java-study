package ch05;

public class UserInfoTest {

  public static void main(String[] args) {

    // public UserInfo(){} 생성자 호출 후 사용
    UserInfo userLee = new UserInfo();
    userLee.userId = "a12345";
    userLee.userPassWord = "zxcvbn12345";
    userLee.userName = "Lee";
    userLee.phoneNumber = "01034556699";
    userLee.userAddress = "Seoul, Korea";

    System.out.println(userLee.showUserInfo());

    // public UserInfo(String userId, String userPassWord, String userName) {} 생성자 호출 후 사용
    UserInfo userKim = new UserInfo("b12345", "09876mnbvc", "Kim");

    System.out.println(userKim.showUserInfo());

  }

}