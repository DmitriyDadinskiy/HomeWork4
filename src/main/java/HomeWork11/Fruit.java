package HomeWork11;

abstract class Fruit {

    private float weight;


    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }
}
//упер класс фрукты, от него наследуем яблоки и пр.