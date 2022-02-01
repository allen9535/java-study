package ch20.domain;

import ch20.level.BeginnerLevel;
import ch20.level.PlayerLevel;

public class Player {

  private PlayerLevel level;

  public Player() {
    this.level = new BeginnerLevel();
  }

  public PlayerLevel upgradeLevel(PlayerLevel level) {
    this.level = level;

    return this.level;
  }

  public void play(int count) {
    level.go(count);
  }

  public PlayerLevel getLevel() {
    return level;
  }

}