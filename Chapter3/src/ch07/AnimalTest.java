package ch07;

import java.util.ArrayList;

public class AnimalTest {

  public static void main(String[] args) {
    Animal human = new Human();
    Animal tiger = new Tiger();
    Animal eagle = new Eagle();

    AnimalTest test = new AnimalTest();
    test.moveAnimal(human);
    test.moveAnimal(tiger);
    test.moveAnimal(eagle);

    ArrayList<Animal> animalList = new ArrayList<>();
    animalList.add(human);
    animalList.add(tiger);
    animalList.add(eagle);

    for (Animal a: animalList) {
      a.move();
    }
  }

  public void moveAnimal(Animal animal) {
    animal.move();
  }

}