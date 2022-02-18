package ch10;

import java.util.ArrayList;

// Member 클래스로 생성된 인스턴스들을 관리하는 클래스를,
// 컬렉션 프레임워크 클래스를 활용해 구현한다.
public class MemberArrayList {

  private ArrayList<Member> list;

  public MemberArrayList() {
    list = new ArrayList<Member>();
  }

  public void addMember(Member m) {
    list.add(m);
  }

  // 멤버 아이디를 매개 변수로 받아 삭제 여부를 반환하는 메서드
  public boolean removeMember(int memberId) {
    for (int i = 0; i < list.size(); i++) {
      Member m = list.get(i);
      int tempId = m.getMemberId();

      if (tempId == memberId) {
        list.remove(i);

        return true;
      }
    }

    System.out.printf("%d가 존재하지 않습니다.\n", memberId);

    return false;
  }

  public void showAllMember() {
    for (Member m: list) {
      System.out.println(m);
    }
    System.out.println();
  }

}