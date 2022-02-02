package ch21;

import java.io.IOException;
import ch21.scheduler.LeastJob;
import ch21.scheduler.PriorityAllocation;
import ch21.scheduler.RoundRobin;
import ch21.scheduler.Scheduler;

public class SchedulerTest {

  public static void main(String[] args) throws IOException {
    System.out.println("전화 상담원 할당 방식을 선택해주세요.");
    System.out.println("R: 한 명 씩 차례대로");
    System.out.println("L: 대기가 적은 상담원 우선");
    System.out.println("P: 고객의 등급에 따라 숙련도가 우수한 상담원 우선");
    System.out.print(">> ");

    int ch = System.in.read();
    Scheduler scheduler = null;

    if (ch == 'R' || ch == 'r') {
      scheduler = new RoundRobin();
    } else if (ch == 'L' || ch == 'l') {
      scheduler = new LeastJob();
    } else if (ch == 'P' || ch == 'p') {
      scheduler = new PriorityAllocation();
    } else {
      System.out.println("지원되지 않는 기능입니다.");

      return;
    }

    scheduler.getNextCall();
    scheduler.sendCallToAgent();
  }

}