package ch21.scheduler;

public class RoundRobin implements Scheduler {

  @Override
  public void getNextCall() {
    System.out.println("상담 전화를 한 명 씩 차례대로 대기열에서 가져옵니다.");
  }

}