package HomeWork7.Lesson6;

import java.util.Random;

public class Dog extends Animal {
    private int maxRunLength;
    private double maxJumpHeight;
    private int maxSwimLength;

    public Dog(){
        Random random = new Random();
        maxRunLength = 400 + random.nextInt(201);
        maxJumpHeight = 0.4 + random.nextInt(3)/10.0;
        maxSwimLength = 8 + random.nextInt(5);
    }
    @Override
    public void run(int length) {
        if (length > maxRunLength) {
            System.out.println("Собака не может столько бегать");
        } else {
            System.out.println("Пёс  пробежал дистанцию");
        }
    }

    @Override
    public void jump(double height) {
        if (height > maxJumpHeight) {
            System.out.println("Пёс не может перепрыгнуть");
        } else {
            System.out.println("Пёс перепрыгнул");
        }
    }

    @Override
    public void swim(int length) {
        if (length > maxSwimLength) {
            System.out.println("Пёс не можето проплыть дистанцию");
        } else {
            System.out.println("Пёс проплыл дистанцию");
        }
    }
}
