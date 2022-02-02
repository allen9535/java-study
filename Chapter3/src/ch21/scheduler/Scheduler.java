package ch21.scheduler;

public interface Scheduler {

  void getNextCall();

  default void sendCallToAgent() {
    System.out.println("다음 순서의 상담원에게 배분합니다.");
  }

}