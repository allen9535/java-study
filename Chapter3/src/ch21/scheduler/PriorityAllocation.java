package ch21.scheduler;

public class PriorityAllocation implements Scheduler {

  @Override
  public void getNextCall() {
    System.out.println("상담 전화를 고객의 등급에 따라 숙련도가 우수한 상담원 우선으로 가져옵니다.");
  }

}