package ch10;

// 아이디와 이름을 멤버 변수로 가지는 Member 클래스를 만든다.
public class Member {

  private int memberId;
  private String memberName;

  public Member(int memberId, String memberName) {
    this.memberId = memberId;
    this.memberName = memberName;
  }

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
    this.memberId = memberId;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  @Override
  public String toString() {
    return memberName + "님의 아이디는 " + memberId + "입니다.";
  }

}