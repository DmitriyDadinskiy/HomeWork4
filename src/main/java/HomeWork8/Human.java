package HomeWork8;

import java.util.Random;

//1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
public class Human {

    protected int runMaxSpeed;
    protected int jumpMax;

    public Human() {
        Random random = new Random();
        runMaxSpeed = 1 + random.nextInt(15);
        jumpMax = 1 + random.nextInt(3);
    }

    public void run() {
        System.out.println("Человек начинает бежать");
         System.out.println("Человек бежит по дорожке");
             }

        public void jump (){
            System.out.println("Человек делает прыжок " + jumpMax);
            System.out.println("И перепрыгивает стену");
    //        if (height >= jumpMax) {
    //            System.out.println("Человек не может перепрыгнуть стену");
     //       } else {
     //           System.out.println("Человек прыгает через стену");
            }

        }




