package ch20.level;

public abstract class PlayerLevel {

  public abstract void showLevelMessage();
  public abstract void run();
  public abstract void jump();
  public abstract void turn();

  public void go(int count) {
    showLevelMessage();
    run();

    for (int i = 0; i < count; i++) {
      jump();
    }

    turn();
  }

}