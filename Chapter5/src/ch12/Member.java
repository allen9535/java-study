package ch12;

// ch11의 파일을 복사
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

  // 아이디가 동일한 경우 같은 회원이므로,
  // hashCode()와 equals()를 재정의한다.
  @Override
  public int hashCode() {
    return memberId;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof Member) {
      Member m = (Member)obj;

      if (this.memberId == m.memberId) {
        return true;
      } else {
        return false;
      }
    }

    return false;
  }

}