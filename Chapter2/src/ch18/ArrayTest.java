package ch18;

public class ArrayTest {

  // 배열
  // 동일한 자료형으로 이루어진 순차적 자료 구조
  // 인덱스 연산자([])를 통해 빠른 참조가 가능하다.
  // 물리적 위치와 논리적 위치가 동일하며,
  // 배열의 순서는 0부터 시작한다.
  // 자바에서는 객체 배열을 구현한 ArrayList를 많이 활용한다.
  public static void main(String[] args) {

    // 배열 선언
    // 4바이트 자료형을 10개 모았으므로 총 40바이트를 사용한다.
    int[] arr1 = new int[10];
    int arr2[] = new int[10];

    // 배열 초기화
    // 배열은 선언과 동시에 자료형에 따른 초기화가 이루어진다.(정수는 0, 실수는 0.0, 객체는 null로)
    // 필요에 따라 초기값을 지정할 수 있다.
    int[] numbers1 = new int[] {10, 20, 30}; // 인덱스 연산자([]) 안에 갯수 입력을 생략한다.
    int[] numbers2 = {10, 20, 30}; // new int[]를 생략 가능하다.
    // 선언을 한 다음 나중에 배열을 생성하는 경우 new int[]를 생략할 수 없다.
    int[] ids;
    ids = new int[] {10, 20, 30};

    // 배열 사용
    // 인덱스 연산자를 활용하면 배열 요소가 저장된 메모리의 위치를 연산해 찾아준다.
    // 배열을 이용해 합을 구할 수 있다.
    int[] arr = new int[10];
    int total = 0;

    for (int i = 0, num = 1; i < arr.length; i++, num++) {

      arr[i] += num;

    }

    for (int i = 0; i < arr.length; i++) {

      total += arr[i];

    }

    System.out.println(total);

    // 배열의 길이와 요소의 갯수는 일치하지 않을 수 있다.
    // 배열을 선언하면 해당하는 갯수만큼 메모리를 할당하지만, 실제 데이터는 존재하지 않을 수 있다.
    // 배열의 length 속성의 배열의 갯수를 반환하므로 실제 요소의 갯수와는 차이가 있을 수 있다.
    double[] dArr = new double[5];

    dArr[0] = 1.1;
    dArr[1] = 2.2;
    dArr[2] = 3.3;

    double mtotal = 1;
    // length 속성으로 인해 i는 dArr[4]까지 진행되었지만,
    // dArr[3]과 dArr[4]는 데이터를 입력하지 않았으므로 0.0으로 초기화되어 있을 것이다.
    // 어떤 수에든 0을 곱하면 0이 나오므로, 아래 for문의 결과는 무조건 0이다.
    for (int i = 0; i < dArr.length; i++) {

      mtotal *= dArr[i];

    }

    System.out.println(mtotal);

    // 위와 같은 상황을 해결하기 위해 요소의 갯수에 대한 변수인 count를 따로 유지한다.
    dArr = new double[5];
    int count = 0;

    dArr[0] = 1.1;
    count++;
    dArr[1] = 2.2;
    count++;
    dArr[2] = 3.3;
    count++;

    mtotal = 1;
    for (int i = 0; i < count; i++) {

      mtotal *= dArr[i];

    }

    System.out.println(mtotal);

  }

}