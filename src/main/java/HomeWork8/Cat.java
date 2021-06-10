package HomeWork8;

import java.util.Random;


public class Cat {
protected int runMaxSpeed;
protected int jumpMax;
    public Cat(){
        Random random = new Random();
        runMaxSpeed = 1 + random.nextInt(25);
        jumpMax = 1 + random.nextInt(6);
    }
    public void run(){
        System.out.println("Кот начинает бежать");
   //     if (speed >= runMaxSpeed) {
   //         System.out.println("Кот не может бежать с такой скоростью");
   //     } else {
            System.out.println("Кот бежит по дорожке");
        }
   // }
    public void jump(){
        System.out.println("Кот делает прыжок " + jumpMax);
            System.out.println("Кот перепрыгнул через стену");
        }
    }

