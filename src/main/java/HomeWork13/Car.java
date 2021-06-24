package HomeWork13;

import java.util.SortedMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable{
    private static int CARS_COUNT;
    private  CyclicBarrier start;
    private  AtomicInteger finishWinner;
    private CountDownLatch winner;
    private
    Race race;
    private int speed;
    private String name;

    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed, CyclicBarrier start, CountDownLatch winner, AtomicInteger finishWinner) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.start = start;
        this.winner = winner;
        this.finishWinner = finishWinner;
    }
    @Override
    public void run() {

                try {
                    System.out.println(this.name + " готовится");
                    Thread.sleep(500 + (int) (Math.random() * 800));
                    System.out.println(this.name + " готов");
                    start.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }

        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
        winner.countDown();
        int finishWinner = 0;
        if (finishWinner == 1){
            System.out.println(this.name + " Победил в гонке! ");
        }else {
            System.out.println(this.name + " Проиграл в гонке! ");
        }
    }
}
