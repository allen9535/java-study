package ch02;

// ArrayList의 특징
// 동일한 데이터 타입을 순서에 따라 관리하는 자료 구조이다.
// 정해진 크기가 있으며, 요소의 추가와 제거 시 다른 요소들의 이동을 필요로 한다.
// 배열의 i번째 요소를 찾는 인덱스 연산이 빠르다.
// jdk 클래스: ArrayList, Vector

// ArrayList 구현
public class MyArrayList {

  public int ARRAY_SIZE;
  public static final int ERROR_NUM = -999999999;

  // Array로 만들 Object 배열(모든 클래스의 최상위 클래스가 Object이므로)
  Object[] arr;
  // 갯수
  int count;

  public MyArrayList() {
    count = 0;
    ARRAY_SIZE = 10;
    arr = new Object[ARRAY_SIZE];
  }

  public MyArrayList(int size) {
    count = 0;
    ARRAY_SIZE = size;
    arr = new Object[size];
  }

  public void addElement(int num) {
    if (count >= ARRAY_SIZE) {
      System.out.println("메모리가 부족합니다.");

      return;
    }

    arr[count++] = num;
  }

  public void insertElement(int position, int num) {
    int i;

    // 정해진 크기를 다 채운 경우
    if (count >= ARRAY_SIZE) {
      System.out.println("메모리가 부족합니다.");

      return;
    }

    // 잘못된 인덱스 값을 받았을 때
    if (position < 0 || position > count) {
      System.out.println("요소를 삽입하던 중 오류가 발생했습니다.");

      return;
    }

    // 배열을 한 개 씩 이동한다.
    for (i = count; i >= position; i--) {
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
    if (position > 0 && position < count) {
      for (int i = position; i < count; i++) {
        arr[i] = arr[i + 1];
      }
    } else if (position == 0) {
      for (int i = 0; i < count; i++) {
        arr[i] = arr[i + 1];
      }
    }
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