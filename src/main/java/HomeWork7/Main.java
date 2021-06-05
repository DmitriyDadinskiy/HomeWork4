package HomeWork7;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int putFood;
        Plate plate = new Plate(10);
        plate.info();
        Cat[] catArray = new Cat[3]; //    5 Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
        catArray[0] = new Cat("Пушистый", 5, false);
        catArray[1] = new Cat("Пушистый1", 5, false);
        catArray[2] = new Cat("Пушистый2", 5, false);
        for (int i = 0; i < catArray.length; i++) {
            if (catArray[i].isSatiety() == false && catArray[i].getAppetite() <= plate.getFood()) {
                catArray[i].eat(plate);
                //      catArray[i].isSatiety() = true;
                System.out.println("Кот по имени " + catArray[i].getName() + " наелся");
            } else {
                System.out.println("Коту по имени " + catArray[i].getName() + " не хватило еды");
            }
        }
            plate.info();
        System.out.println("Нужно добавить еды");
        putFood = sc.nextInt(); //    6 Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
        plate.addEat(putFood);
        plate.info();}


    }


//    4 Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).

