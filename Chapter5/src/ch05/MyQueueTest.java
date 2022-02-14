package ch05;

public class MyQueueTest {

  public static void main(String[] args) {
    MyQueue queue = new MyQueue();

    System.out.println("--------------- queue.enQueue(\"A ~ E\") ---------------");
    queue.enQueue("A");
    queue.enQueue("B");
    queue.enQueue("C");
    queue.enQueue("D");
    queue.enQueue("E");
    queue.printAll();

    System.out.println("--------------- queue.deQueue() ---------------");
    System.out.println(queue.deQueue());
    queue.printAll();
  }

}