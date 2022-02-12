package ch02;

public class MyIntArrayTest {

  public static void main(String[] args) {
    MyIntArray array = new MyIntArray();
    array.addElement(10);
    array.addElement(20);
    array.addElement(30);
    array.insertElement(1, 50);
    array.printAll();

    System.out.println("--------------- array.removeElement(1) ---------------");
    array.removeElement(1);
    array.printAll();

    System.out.println("--------------- array.addElement(70) ---------------");
    array.addElement(70);
    array.printAll();

    System.out.println("--------------- array.removeElement(1) ---------------");
    array.removeElement(1);
    array.printAll();

    System.out.println("--------------- array.getElement(2) ---------------");
    System.out.println(array.getElement(2));
  }

}