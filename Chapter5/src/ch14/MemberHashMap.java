package ch14;

import java.util.HashMap;
import java.util.Iterator;

// HashMap 활용
// 가장 많이 사용되는 Map 인터페이스 기반 클래스
// key와 value를 쌍으로 관리하는 메서드를 구현한다.
// 검색을 위한 자료 구조로, key를 통해 값을 저장하고, key를 통해 값을 꺼내오는 방식을 사용한다.(hash 알고리즘으로 구현)
// key가 되는 객체는 중복될 수 없고, 객체의 유일성 비교를 위해 equals()와 hashCode() 메서드를 구현해야 한다.

// 번외
// TreeMap 클래스는 Map 인터페이스를 구현한 클래스로, key에 대한 정렬을 구현할 수 있다.
// key가 되는 클래스에 Comparable 또는 Comparator 인터페이스를 구현함으로써,
// key와 value가 쌍으로 관리되는 자료를 key 값 기준으로 정렬하여 관리할 수 있다.
public class MemberHashMap {

  private HashMap<Integer, Member> hashMap;

  public MemberHashMap() {
    hashMap = new HashMap<Integer, Member>();
  }

  public void addMember(Member m) {
    hashMap.put(m.getMemberId(), m);
  }

  public boolean removeMember(int memberId) {
    if (hashMap.containsKey(memberId)) {
      hashMap.remove(memberId);

      return true;
    }

    System.out.printf("%d가 존재하지 않습니다.\n", memberId);

    return false;
  }

  public void showAllMember() {
    Iterator<Integer> iMember = hashMap.keySet().iterator();

    while (iMember.hasNext()) {
      int key = iMember.next();
      Member m = hashMap.get(key);

      System.out.println(m);
    }
    System.out.println();
  }

}