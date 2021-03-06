package ch03;

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