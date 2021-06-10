package HomeWork8;

import java.util.Random;

public class Wall {
//клас стена. Задаем высоту стены
    public int maxHeight;

    public Wall() {
        Random random = new Random();
        maxHeight =  1 + random.nextInt(10);
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
