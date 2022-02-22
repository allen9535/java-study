package ch11;

// ch10의 파일을 복사
public class MemberArrayListTest {

  public static void main(String[] args) {
    MemberArrayList memberList = new MemberArrayList();

    Member lee = new Member(1001, "이모");
    Member kim = new Member(1002, "김모");
    Member kang = new Member(1003, "강모");
    Member hong = new Member(1004, "홍모");

    memberList.addMember(lee);
    memberList.addMember(kim);
    memberList.addMember(kang);
    memberList.addMember(hong);
    memberList.showAllMember();

    memberList.removeMember(hong.getMemberId());
    memberList.showAllMember();
  }

}