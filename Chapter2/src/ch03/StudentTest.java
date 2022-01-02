package ch03;

public class StudentTest {

  public static void main(String[] args) {

    // new 키워드를 사용해 인스턴스를 생성한다.
    // 생성된 인스턴스는 힙(heap) 메모리에 할당된다.
    // 아래의 경우, studentLee는 메모리에 생성된 인스턴스를 가리키는 참조 변수이다.
    Student studentLee = new Student();
    studentLee.studentName = "이00";
    studentLee.address = "서울";

    studentLee.showStudentInfo();

    // 아래의 경우, studentKim은 메모리에 생성된 인스턴스를 가리키는 참조 변수이다.
    Student studentKim = new Student();
    studentKim.studentName = "김00";
    studentKim.address = "경주";

    studentKim.showStudentInfo();

    System.out.println(studentLee);
    System.out.println(studentKim);

  }

}
