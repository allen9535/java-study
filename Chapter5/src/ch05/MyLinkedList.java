package ch05;

public class MyLinkedList {

  private MyNode head;
  int count;

  public MyLinkedList() {
    head = null;
    count = 0;
  }

  public MyNode addElement(String data) {
    MyNode newNode;

    if (head == null) {
      newNode = new MyNode(data);
      head = newNode;
    } else {
      newNode = new MyNode(data);
      MyNode temp = head;

      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
    count++;

    return newNode;
  }

  public MyNode insertElement(int position, String data) {
    MyNode tempNode = head;
    MyNode newNode = new MyNode(data);

    if (position < 0 || position > count) {
      System.out.printf("요소 삽입 중 오류가 발생했습니다. 현재 리스트의 갯수는 %d개 입니다\n", count);

      return null;
    }

    if (position == 0) {
      newNode.next = head;
      head = newNode;
    } else {
      MyNode preNode = null;

      for (int i = 0; i < position; i++) {
        preNode = tempNode;
        tempNode = tempNode.next;
      }

      newNode.next = preNode.next;
      preNode.next = newNode;
    }
    count++;

    return newNode;
  }

  public MyNode removeElement(int position) {
    MyNode tempNode = head;

    if (position >= count) {
      System.out.printf("요소 삭제 중 오류가 발생했습니다. 현재 리스트의 갯수는 %d개 입니다.\n", count);

      return null;
    }

    if (position == 0) {
      head = tempNode.next;
    } else {
      MyNode preNode = null;

      for (int i = 0; i < position; i++) {
        preNode = tempNode;
        tempNode = tempNode.next;
      }
      preNode.next = tempNode.next;
    }
    count--;

    System.out.printf("%d번째 항목 삭제 완료했습니다.\n", position);

    return tempNode;
  }

  public String getElement(int position) {
    MyNode tempNode = head;

    if (position >= count) {
      System.out.printf("검색 중 오류가 발생했습니다. 현재 리스트의 갯수는 %d개 입니다.\n", count);

      return new String("ERROR");
    } else if (position == 0) {
      return head.getData();
    }

    for (int i = 0; i < position; i++) {
      tempNode = tempNode.next;
    }

    return tempNode.getData();
  }

  public MyNode getNode(int position) {
    MyNode tempNode = head;

    if (position >= count) {
      System.out.printf("검색 중 오류가 발생했습니다. 현재 리스트의 갯수는 %d개 입니다.\n", count);

      return null;
    } else if (position == 0) {
      return head;
    }

    for (int i = 0; i < position; i++) {
      tempNode = tempNode.next;
    }

    return tempNode;
  }

  public void removeAll() {
    head = null;
    count = 0;
  }

  public int getSize() {
    return count;
  }

  public void printAll() {
    if (count == 0) {
      System.out.println("출력할 내용이 없습니다. 현재 리스트의 갯수는 0개 입니다.");

      return;
    }

    MyNode temp = head;
    while (temp != null) {
      System.out.print(temp.getData());

      temp = temp.next;
      if (temp != null) {
        System.out.print(" → ");
      }
    }
    System.out.println();
  }

  public boolean isEmpty() {
    if (head == null) {
      return true;
    } else {
      return false;
    }
  }

}