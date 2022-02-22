package ch11;

import java.util.ArrayList;
import java.util.Iterator;

// ch10의 파일을 복사

// 요소를 순회한다는 것?
// 컬렉션 프레임워크에 저장된 요소들을 한개씩 차례대로 참조하는 것을 말한다.
// 순서가 있는 List 인터페이스의 경우 Iterator를 사용하지 않고 get(i) 메서드를 활용할 수 있다.
// Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용해 객체를 순회할 수 있다.
public class MemberArrayList {

  private ArrayList<Member> list;

  public MemberArrayList() {
    list = new ArrayList<Member>();
  }

  public void addMember(Member m) {
    list.add(m);
  }

  // Iterator 사용
  // boolean hasNext(): 이후 요소가 있는지를 체크하는 메서드로, 요소가 있다면 true를 반환한다.
  // E next(): 이후 요소를 반환한다.
  public boolean removeMember(int memberId) {
    Iterator<Member> iMember = list.iterator();

    while (iMember.hasNext()) {
      Member m = iMember.next();
      int tempId = m.getMemberId();

      if (tempId == memberId) {
        list.remove(m);

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