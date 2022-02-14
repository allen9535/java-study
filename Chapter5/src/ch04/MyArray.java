package ch04;

// ch02의 MyArrayList를 복사
public class MyArray {

  public int ARRAY_SIZE;
  public static final int ERROR_NUM = -999999999;

  Object[] arr;
  int count;

  public MyArray() {
    ARRAY_SIZE = 10;
    arr = new Object[ARRAY_SIZE];
    count = 0;
  }

  public MyArray(int size) {
    ARRAY_SIZE = size;
    arr = new Object[size];
    count = 0;
  }

  public void addElement(int num) {
    if (count >= ARRAY_SIZE) {
      System.out.println("메모리가 부족합니다.");

      return;
    }

    arr[count++] = num;
  }

  public void insertElement(int position, int num) {
    if (count >= ARRAY_SIZE) {
      System.out.println("메모리가 부족합니다.");

      return;
    }

    if (position < 0 || position > count) {
      System.out.println("요소를 삽입하던 중 오류가 발생했습니다.");

      return;
    }

    for (int i = count; i >= position; i--) {
      arr[i] = arr[i - 1];
    }

    arr[position] = num;
    count++;
  }

  public Object removeElement(int position) {
    Object ret = ERROR_NUM;

    if (isEmpty()) {
      System.out.println("요소가 존재하지 않습니다.");

      return ret;
    }

    if (position < 0 || position >= count) {
      System.out.println("요소를 제거하던 중 오류가 발생했습니다.");

      return ret;
    }

    ret = arr[position];

    count--;

    return ret;
  }

  public int getSize() {
    return count;
  }

  public boolean isEmpty() {
    if (count == 0) {
      return true;
    } else {
      return false;
    }
  }

  public Object getElement(int position) {
    if (position < 0 || position > count - 1) {
      System.out.printf("검색 위치 오류가 발생했습니다. 현재 리스트 갯수는 %d개 입니다.\n", count);

      return ERROR_NUM;
    }

    return arr[position];
  }

  public void printAll() {
    if (count == 0) {
      System.out.println("출력할 내용이 존재하지 않습니다.");

      return;
    }

    for (int i = 0; i < count; i++) {
      System.out.println(arr[i]);
    }
  }

  public void removeAll() {
    for (int i = 0; i < count; i++) {
      arr[i] = 0;
    }
    count = 0;
  }

}