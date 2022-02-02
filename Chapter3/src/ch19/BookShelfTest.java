package ch19;

public class BookShelfTest {

  public static void main(String[] args) {
    Queue bookQueue = new BookShelf();
    bookQueue.enQueue("태백산맥 1권");
    bookQueue.enQueue("태백산맥 2권");
    bookQueue.enQueue("태백산맥 3권");
    bookQueue.enQueue("태백산맥 4권");

    System.out.printf("현재 남아있는 책: %d권\n", bookQueue.getSize());

    System.out.println(bookQueue.deQueue());
    System.out.println(bookQueue.deQueue());
    System.out.println(bookQueue.deQueue());
    System.out.println(bookQueue.deQueue());

    // deQueue 메서드를 호출할 때마다 데이터가 하나씩 사라진다.
    System.out.printf("현재 남아있는 책: %d권\n", bookQueue.getSize());
  }

}