package ch11.answer.my;

public class Situation {

  public static void main(String[] args) {

    Student james = new Student();
    james.setName("James");
    james.setPrincipal(5000);

    Student tomas = new Student();
    tomas.setName("Tomas");
    tomas.setPrincipal(10000);

    Bus bus = new Bus();
    bus.setBusNo(100);
    bus.setCharge(1000);

    Subway subway = new Subway();
    subway.setColor("green");
    subway.setCharge(1200);

    james.setBalance(bus.getCharge());
    tomas.setBalance(subway.getCharge());

    System.out.printf("%s는 %d원을 가지고 있었고, %d번 버스를 타면서 %d원을 지불합니다. 잔액은 %d원입니다.\n", 
        james.getName(), james.getPrincipal(), bus.getBusNo(), bus.getCharge(), james.getBalance());
    System.out.printf("%s는 %d원을 가지고 있었고, %s색 지하철을 타면서 %d원을 지불합니다. 잔액은 %d원입니다.\n", 
        tomas.getName(), tomas.getPrincipal(), subway.getColor(), subway.getCharge(), tomas.getBalance());

  }

}