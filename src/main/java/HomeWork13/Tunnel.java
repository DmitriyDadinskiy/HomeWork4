package HomeWork13;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {


    public Tunnel() {
        this.length = 80;
        this.description = "Тоннель " + length + " метров";
    }

    @Override
    public void go(Car c) {
        System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
        Semaphore startTunnel = new Semaphore(2);

        try {
            startTunnel.acquire();
            System.out.println(c.getName() + " начал этап: " + description);
            Thread.sleep(length / c.getSpeed() * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            System.out.println(c.getName() + " закончил этап: " + description);
            startTunnel.release();
        }
}
}


