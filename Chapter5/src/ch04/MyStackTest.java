package ch04;

public class MyStackTest {

  public static void main(String[] args) {
    MyStack stack = new MyStack(3);

    System.out.println("--------------- stack.push(\"10 ~ 20\") ---------------");
    stack.push(10);
    stack.push(20);
    stack.push(30);
    stack.printAll();

    System.out.println("--------------- stack.pop() ---------------");
    System.out.printf("현재 stack의 사이즈는 %d 입니다.\n", stack.getSize());
    System.out.printf("top 요소는 %d 입니다. %d\n", stack.pop(), stack.top);
    System.out.printf("top 요소는 %d 입니다. %d\n", stack.pop(), stack.top);
    System.out.printf("top 요소는 %d 입니다. %d\n", stack.pop(), stack.top);

    System.out.println("--------------- stack.getSize() ---------------");
    System.out.printf("현재 stack의 사이즈는 %d 입니다.\n", stack.getSize());
  }

}