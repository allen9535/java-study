package ch19;

// Shelf 클래스를 상속 받아 Queue를 구현한다.
public class BookShelf extends Shelf implements Queue {

  // Queue에 데이터를 넣어준다.
  @Override
  public void enQueue(String title) {
    shelf.add(title);
  }

  // Queue에서 데이터를 제거한다.
  // Queue 자료 구조에서는 먼저 들어간 데이터가 먼저 꺼내지므로,(First In First Out, 선입선출)
  // 첫 번째 데이터를 삭제하도록(0번째 데이터를 삭제하도록) 만들면 된다.
  @Override
  public String deQueue() {
    return shelf.remove(0);
  }

  @Override
  public int getSize() {
    return getCount();
  }

}