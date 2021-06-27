package HomeWork11;

public abstract class Fruit {

  float weight;


    public Fruit(float weight) {
        this.weight = weight;
    }

    abstract float getWeight();
}
//упер класс фрукты, от него наследуем яблоки и пр.