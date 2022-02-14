package ch05;

public class MyNode {

  private String data;
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