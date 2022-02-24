package ch13;

import java.util.Iterator;
import java.util.TreeSet;

// TreeSet 클래스 활용
// TreeSet은 객체 정렬에 사용하는 클래스이다.
// Set 인터페이스를 구현함으로써 중복을 허용하지 않으면서,
// 오름차순이나 내림차순 정렬이 가능하게 만든다.
// 내부적으로는 이진 검색 트리(binary search tree)로 구현된다.
// 이진 검색 트리에 저장하기 위해서는 각 객체를 비교해야 하는데,
// 비교 대상이 될 객체에 Comparable이나 Comparator 인터페이스를 구현해야 TreeSet에 추가할 수 있게 된다.
// String, Integer 등 JDK의 많은 클래스들에서 Comparable이 구현되어 있다.

// String의 경우 이미 Comparable 인터페이스가 구현되어 있으므로, 오름차순 정렬된 상태로 출력된다.
public class MemberTreeSet {

  private TreeSet<Member> mTree;

  public MemberTreeSet() {
    mTree = new TreeSet<Member>();
  }

  public void addMember(Member m) {
    mTree.add(m);
  }

  public boolean removeMember(int memberId) {
    Iterator<Member> iMember = mTree.iterator();

    while (iMember.hasNext()) {
      Member m = iMember.next();
      int tempId = m.getMemberId();

      if (tempId == memberId) {
        mTree.remove(m);

        return true;
      }
    }

    System.out.printf("%d가 존재하지 않습니다.\n", memberId);

    return false;
  }

  public void showAllMember() {
    for (Member m: mTree) {
      System.out.println(m);
    }
    System.out.println();
  }

}