package ch20;

import ch20.domain.Player;
import ch20.level.AdvancedLevel;
import ch20.level.SuperLevel;

public class MainBoardPlay {

  public static void main(String[] args) {
    // 초급자 레벨
    Player p1 = new Player();
    p1.play(1);

    // 중급자 레벨로 업그레이드
    AdvancedLevel p2 = new AdvancedLevel();
    p1.upgradeLevel(p2);
    p1.play(2);

    // 고급자 레벨로 업그레이드
    SuperLevel p3 = new SuperLevel();
    p1.upgradeLevel(p3);
    p1.play(3);
  }

}