package HomeWork8;

import java.util.Random;

public class Robot {
protected int runMaxSpeed;
protected int jumpMax;
public Robot(){
    Random random = new Random();
    runMaxSpeed = 1 + random.nextInt(11);
    jumpMax = 1 + random.nextInt(15);
}
    public void run() {
        System.out.println("Робот начинает бежать");
//        if (speed >= runMaxSpeed) {
//            System.out.println("Робот не может бежать с такой скоростью");
//        } else {
            System.out.println("Робот бежит по дорожке");
        }
 //   }
    public void jump(){
        System.out.println("Робот делает прыжок на " + jumpMax);
            System.out.println("Робот прыгает через стену");
        }
    }


