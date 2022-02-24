package ch13;

// ch12의 파일을 복사

// 아이디를 오름차순 정렬하기 위해 Comparable 인터페이스를 구현한다.
public class Member implements Comparable<Member> {

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

  // 두 개의 정수 또는 문자열을 비교하고 int 값을 반환하는 메서드
  @Override
  public int compareTo(Member m) {
    // 오름차순으로 정렬할 경우
    return (this.memberId - m.memberId);

    // 내림차순으로 정렬할 경우
    // return ((this.memberId - m.memberId) * (-1));
  }

}