package ch12;

public class MemberHashSetTest {

  public static void main(String[] args) {
    MemberHashSet mHashSet = new MemberHashSet();

    Member lee = new Member(1001, "이모");
    Member kim = new Member(1002, "김모");
    Member kang = new Member(1003, "강모");

    mHashSet.addMember(lee);
    mHashSet.addMember(kim);
    mHashSet.addMember(kang);
    mHashSet.showAllMember();

    // memberId가 중복되는 새 회원 삽입
    Member hong = new Member(1003, "홍모");
    mHashSet.addMember(hong);
    mHashSet.showAllMember();
  }

}