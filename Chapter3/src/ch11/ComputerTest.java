package ch11;

public class ComputerTest {

  public static void main(String[] args) {
    // 에러! abstract 클래스이기 때문이다.
    //    Computer computer = new Computer();
    Computer computer = new Desktop();
    computer.turnOn();
    computer.display();
    computer.typing();
    computer.turnOff();

    System.out.println("------------------------------");

    Notebook nb = new MyNotebook();
    nb.turnOn();
    nb.display();
    nb.typing();
    nb.turnOff();
  }

}