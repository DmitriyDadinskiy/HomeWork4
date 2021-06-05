package HomeWork6;

import java.util.Scanner;

//2Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
// В качестве параметра каждому методу передается величина, означающая или длину препятствия (для бега и плавания), или высоту (для прыжков).
//3У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.; плавание: кот не умеет плавать, собака 10 м.).
// При попытке животного выполнить одно из этих действий оно должно сообщить результат в консоль. (Например, dog1.run(150); -> результат: run: true).
// 4.* Добавить животным разброс в ограничениях. То есть у одной собаки ограничение на бег может быть 400 м., у другой 600 м
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int catMaxRun = 200;
        int dogMaxRun = 500;
        int dogMaxSail = 10;
        int catMaxJump = 5;
        double dogMaxJump = 0.5;

        Dog dog = new Dog("Пёс Бобик", "черный", 3);
        Cat cat = new Cat("Кот Тимоша", "серый", 2);
        dog.info();
        cat.info();
        System.out.println();
        System.out.println("Введите расстония в метрах которое должны пробежать животные");
        int runningDistance = sc.nextInt();
        if ( runningDistance <= catMaxRun) {
            System.out.println(cat.getName() + " Пробежал " + runningDistance + " метров и лениво улегся на бок");

        }
        if (runningDistance > catMaxRun) {
            System.out.println(cat.getName() + " Пробежал " + catMaxRun + " и устал, потому что больше чем " + catMaxRun + " метров он не может");
        }
        if (runningDistance <= dogMaxRun) {
            System.out.println(dog.getName() + " Пробежал " + runningDistance + " метров и радостно ждет следующей команды");
        }
        if (runningDistance > dogMaxRun) {
            System.out.println(cat.getName() + " Пробежал " + dogMaxRun + " и устал, потому больше чем " + dogMaxRun + " метров он не может");
        }
        System.out.println();
        System.out.println("Введите расстония в метрах которое должны проплыть животные");

        int swimDistance = sc.nextInt();
            System.out.println(cat.getName() + " лениво улегся на бок, ведь коты не умеют плавать");
        if (swimDistance <= dogMaxSail) {
            System.out.println(dog.getName() + " Проплыл " + swimDistance + " метров и радостно ждет следующей команды");
        }
        if (swimDistance > dogMaxSail) {
            System.out.println(dog.getName() + " Проплыл " + swimDistance + " и устал, потому что больше чем " + dogMaxSail + " метров он не может");
        }
        System.out.println();
        System.out.println("животные должны перепрыгнуть препятствие, введите высоту в метрах");
        double jumpHigh = sc.nextDouble();
        if (jumpHigh <= catMaxJump) {
            System.out.println(cat.getName() + " Прыгнул на " + jumpHigh + " метров и перепрыгнул препятсвие");
        }
        if (jumpHigh > catMaxJump) {
            System.out.println(cat.getName() + " Прыгнул на " + jumpHigh + " метров и не смог перепрыгнуть, потому что больше чем " + catMaxJump + " он не может ");
        }
        if (jumpHigh <= dogMaxJump) {
            System.out.println( dog.getName() + " прыгнул на " + jumpHigh + " метров и перепрыгнул препятствие");
        }
        if (jumpHigh > dogMaxJump) {
            System.out.println(dog.getName() + " прыгнул на " + jumpHigh + " метров и не смогу перепрыгнуть, потому что больше чем " + dogMaxJump + " он не может");
        }
    }
    // Логика: задать максимальные возможности для животного; представть живтоных, попросить пользователей ввести длину бега,
    // проверить и выдать результат по каждому животному, пото плавание, потом бег.

}

