package ch10;

import java.util.ArrayList;

public class Downcasting {

  // 다운 캐스팅(downcasting)
  // 업 캐스팅된 클래스를 다시 원래의 타입으로 형 변환한다.
  // 하위 클래스로의 형 변환은 명시적이어야 한다.
  // 예) Customer vc = new VIPCustomer();    // 업 캐스팅, 묵시적 형 변환
  // 예) VIPCustomer nvc = (VIPCustomer)vc;  // 다운 캐스팅, 명시적 형 변환

  // instanceof를 이용한 인스턴스의 형 체크
  // 원래 인스턴스의 형이 맞는지의 여부를 체크하는 키워드이다.
  // 맞다면 true를, 아니라면 false를 반환한다.
  public void testDownCasting(ArrayList<Animal> list) {
    for (int i = 0; i < list.size(); i++) {
      Animal a = list.get(i);

      if (a instanceof Human) {
        Human h = (Human)a;

        h.read();
      } else if (a instanceof Tiger) {
        Tiger t = (Tiger)a;

        t.hunting();
      } else if (a instanceof Eagle) {
        Eagle e = (Eagle)a;

        e.flying();
      } else {
        System.out.println("에러가 발생했습니다!");
      }
    }
  }

  public static void main(String[] args) {
    Human h = new Human();
    Tiger t = new Tiger();
    Eagle e = new Eagle();
    Downcasting d = new Downcasting();

    ArrayList<Animal> list = new ArrayList<>();
    list.add(h);
    list.add(t);
    list.add(e);

    d.testDownCasting(list);
  }

}