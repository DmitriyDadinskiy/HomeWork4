package HomeWork13;

import java.util.SortedMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class Car implements Runnable{
    private static int CARS_COUNT;
    private  CyclicBarrier start;
    public final static AtomicBoolean finishWinner = new AtomicBoolean();
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
    public Car(Race race, int speed, CyclicBarrier start, CountDownLatch winner) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
        this.start = start;
        this.winner = winner;

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

        if (!finishWinner.getAndSet(true)){
            System.out.println(this.name + " >>> ПОБЕДИЛ в гонке! >>> ");
        } else {
            System.out.println(this.name + " Проиграл в гонке! ");
        }
        winner.countDown();
}
}
