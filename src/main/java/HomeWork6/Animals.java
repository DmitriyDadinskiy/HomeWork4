package HomeWork6;

public class Animals {
    //1Создать классы Собака и Кот с наследованием от класса Животное.
    //2Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
    // В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
    //3У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
    // При попытке животного выполнить одно из этих действий оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true).
    // 4.* Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м
    protected String name;
    protected String color;
    protected int age;

    public Animals(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }



    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
    public void info() {
        System.out.println(this);
    }
}


