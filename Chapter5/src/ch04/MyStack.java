package ch04;

// Stack의 특징
// 맨 마지막 위치(top)에서만 자료를 추가, 삭제, 꺼내올 수 있다.(중간의 자료는 꺼낼 수 없다.)
// 후입선출(Last In First Out) 구조이다.
// 가장 최근의 자료를 찾아오거나, 게임 등에서 히스토리를 유지하고 원래대로 되돌릴 때 사용할 수 있다.
// 함수의 메모리는 호출 순서에 따른 stack 구조이다.
// jdk 클래스: Stack

// 배열을 활용한 Stack 구현
public class MyStack {

  MyArray stack;
  int top;

  public MyStack() {
    stack = new MyArray();
    top = 0;
  }

  public MyStack(int size) {
    stack = new MyArray(size);
    top = 0;
  }

  public void push(int data) {
    if (isFull()) {
      System.out.println("스택이 꽉 찼습니다.");

      return;
    }

    stack.addElement(data);

    top++;
  }

  public Object pop() {
    if (top == 0) {
      System.out.println("스택이 비어 있습니다.");

      return MyArray.ERROR_NUM;
    }

    return stack.removeElement(--top);
  }

  public Object peek() {
    if (top == 0) {
      System.out.println("스택이 비어 있습니다.");

      return MyArray.ERROR_NUM;
    }

    return stack.getElement(top - 1);
  }

  public int getSize() {
    return top;
  }

  public boolean isFull() {
    if (top == stack.ARRAY_SIZE) {
      return true;
    }

    return false;
  }

  public boolean isEmpty() {
    if (top == 0) {
      return true;
    }

    return false;
  }

  public void printAll() {
    stack.printAll();
  }

}