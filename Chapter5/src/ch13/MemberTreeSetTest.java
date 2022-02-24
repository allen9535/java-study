package ch13;

public class MemberTreeSetTest {

  public static void main(String[] args) {
    MemberTreeSet mTreeSet = new MemberTreeSet();

    Member kim = new Member(1003, "김모");
    Member lee = new Member(1001, "이모");
    Member kang = new Member(1002, "강모");

    mTreeSet.addMember(kim);
    mTreeSet.addMember(lee);
    mTreeSet.addMember(kang);

    mTreeSet.showAllMember();
  }

}