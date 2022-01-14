package ch20;

public class TwoDimensionTest {

  // 다차원 배열: 이차원 이상으로 구현된 배열
  // 평면(이차원 배열) 또는 공간(삼차원 배열)을 활용한 프로그램을 구현한다.
  public static void main(String[] args) {
    // 이차원 배열 생성
    // 메모리 상에서는 평면이 아니라 일렬로 잡혀있다.
    // 앞 꺽쇠가 행, 뒤 꺽쇠가 열을 나타낸다.
    int[][] arr = { {1, 2, 3}, {4, 5, 6, 7} };
    int i, j;

    // 행을 기준으로 열을 돌린다.(for문)
    // 행 갯수는 2개이므로, arr.length 값은 2가 된다.
    for (i = 0; i < arr.length; i++) {
      // arr[0]은 1행, 따라서 arr[0].length 값은 3이 된다.
      // arr[1]은 2행, 따라서 arr[1].length 값은 4가 된다.
      for (j = 0; j < arr[i].length; j++) {
        System.out.printf("%d ", arr[i][j]);
      }

      System.out.printf(", \t %d \n", arr[i].length);
      System.out.println();
    }
  }

}