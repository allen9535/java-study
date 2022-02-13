package ch03;

// LinkedList 특징
// 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조이다.
// 자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있다.
// 자료가 추가될 때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결한다.(정해진 크기가 없다.)
// 연결 리스트의 i번째 요소를 찾는 데 걸리는 시간은 요소의 갯수에 비례한다.

// Node 구현
public class MyNode {

  // 자료가 들어갈 변수
  private String data;
  // 다음 노드를 가리키게 할 링크
  public MyNode next;

  public MyNode() {
    data = null;
    next = null;
  }

  public MyNode(String data) {
    this.data = data;
    this.next = null;
  }

  public MyNode(String data, MyNode link) {
    this.data = data;
    this.next = link;
  }

  public String getData() {
    return data;
  }

}