package HomeWork11;

public class Orange extends Fruit{
    public Orange(float weight) {
        super(weight);
    }

    @Override
    public float getWeight() {
        return 1.5f; //вес апельсин
    }
}

