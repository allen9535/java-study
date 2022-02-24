package ch14;

public class MemberHashMapTest {

  public static void main(String[] args) {
    MemberHashMap mHashMap = new MemberHashMap();

    Member lee = new Member(1001, "이모");
    Member kim = new Member(1002, "김모");
    Member kang = new Member(1003, "강모");
    Member hong = new Member(1004, "홍모");

    mHashMap.addMember(lee);
    mHashMap.addMember(kim);
    mHashMap.addMember(kang);
    mHashMap.addMember(hong);
    mHashMap.showAllMember();

    mHashMap.removeMember(1004);
    mHashMap.showAllMember();
  }

}