package ch03;

//LinkedList 특징
//동일한 데이터 타입을 순서에 따라 관리하는 자료 구조이다.
//자료를 저장하는 노드에는 자료와 다음 요소를 가리키는 링크(포인터)가 있다.
//자료가 추가될 때 노드 만큼의 메모리를 할당 받고 이전 노드의 링크로 연결한다.(정해진 크기가 없다.)
//연결 리스트의 i번째 요소를 찾는 데 걸리는 시간은 요소의 갯수에 비례한다.

// LinkedList 구현
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
      // 맨 처음 위치에 요소를 삽입
      newNode = new MyNode(data);
      head = newNode;
    } else {
      newNode = new MyNode(data);
      MyNode temp = head;

      // 가장 마지막 노드로 가서 요소를 삽입
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