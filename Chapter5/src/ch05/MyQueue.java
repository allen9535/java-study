package ch05;

// Queue의 특징
// 맨 앞(front)에서 자료를 꺼내거나 삭제하고, 맨 뒤(rear)에서 자료를 추가한다.
// 선입선출(First In First Out) 구조이다.
// 순차적으로 입력된 자료를 순서대로 처리하는 데 사용되는 자료 구조이다.
// 콜 센터에 들어온 문의 전화, 메시지 큐 등에 활용된다.
// jdk 클래스: ArrayList

// Queue 구현
public class MyQueue extends MyLinkedList implements QueueInterface {

  MyNode front;
  MyNode rear;

  public MyQueue() {
    front = null;
    rear = null;
  }

  @Override
  public void enQueue(String data) {
    MyNode newNode;

    if (isEmpty()) {
      newNode = addElement(data);
      front = newNode;
      rear = newNode;
    } else {
      newNode = addElement(data);
      rear = newNode;
    }

    System.out.printf("%s 추가됨\n", newNode.getData());
  }

  @Override
  public String deQueue() {
    if (isEmpty()) {
      System.out.println("큐가 비어 있습니다.");

      return null;
    }

    String data = front.getData();
    front = front.next;

    if (front == null) {
      rear = null;
    }

    return data;
  }

  @Override
  public void printAll() {
    if (isEmpty()) {
      System.out.println("큐가 비어 있습니다.");

      return;
    }

    MyNode temp = front;
    while (temp != null) {
      System.out.printf("%s, ", temp.getData());

      temp = temp.next;
    }
    System.out.println();
  }

}