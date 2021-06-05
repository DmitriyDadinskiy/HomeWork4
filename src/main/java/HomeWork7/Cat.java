package HomeWork7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety; ////    3 Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true.

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public String getName() {
        return name;
    }
}


