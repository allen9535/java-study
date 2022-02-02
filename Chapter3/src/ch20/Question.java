package ch20;

public class Question {

  // Player가 있고, Player는 GameLevel 속성을 가진다.
  // 각 GameLevel 단계 마다 run(), jump(), turn() 세 가지 기능이 업그레이드 된다.
  // 초보자 레벨 : 천천히 달린다. run() 만 가능
  // 중급자 레벨 : 빠르게 달리고, 점프할 수 있다. run(), jump() 가능
  // 고급자 레벨 : 매우 빠르게 달리고, 높게 점프하며, 회전할 수 있다. run(), jump(), turn() 가능
  // Player는 한번에 하나의 레벨 상태만 가질 수 있다.
  // Player가 play() 도중 레벨에 있는 go(int count) 라는 메서드를 호출하면 run() 하고,
  // count 횟수 만큼 jump()한 다음 turn()을 한다.
  // 다음을 참고하여 각 레벨에서 go()가 호출 될 때 출력 예와 같이 출력 되도록 할 것.

  // Player: level / getLevel() / upgradeLevel(PlayerLevel) / play()
  // PlayerLevel: run() / jump() / turn() / showLevelMessage() / go(int)
  // BeginnerLevel: run() / jump() / turn() / showLevelMessage()
  // AdvancedLevel: run() / jump() / turn() / showLevelMessage()
  // SuperLevel: run() / jump() / turn() / showLevelMessage()
  // * 주의사항: Player는 한 개의 level 변수를 가지며, 이는 PlayerLevel 형이다.

  // 출력 예)
  // ********** 초급자 레벨입니다. **********
  // 천천히 달립니다.
  // jump는 불가.
  // turn은 불가.
  // ********** 중급자 레벨입니다. **********
  // 빠르게 달립니다.
  // jump 합니다.
  // jump 합니다.
  // turn은 불가.
  // ********** 고급자 레벨입니다. **********
  // 매우 빠르게 달립니다.
  // 높게 jump 합니다.
  // 높게 jump 합니다.
  // 높게 jump 합니다.
  // 높게 jump 합니다.
  // turn 합니다.

  // * 참고 사항: 클래스 다이어그램에서 실선은 상속 관계를 말한다.

}