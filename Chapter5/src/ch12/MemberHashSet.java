package ch12;

import java.util.HashSet;
import java.util.Iterator;

// 중복되지 않게 자료를 관리하는 HashSet 클래스 활용
public class MemberHashSet {

  private HashSet<Member> hashSet;

  public MemberHashSet() {
    hashSet = new HashSet<Member>();
  }

  public void addMember(Member m) {
    hashSet.add(m);
  }

  public boolean removeMember(int memberId) {
    Iterator<Member> iMember = hashSet.iterator();

    while (iMember.hasNext()) {
      Member m = iMember.next();
      int tempId = m.getMemberId();

      if (tempId == memberId) {
        hashSet.remove(m);

        return true;
      }
    }

    System.out.printf("%d가 존재하지 않습니다.\n", memberId);

    return false;
  }

  public void showAllMember() {
    for (Member m: hashSet) {
      System.out.println(m);
    }
    System.out.println();
  }

}