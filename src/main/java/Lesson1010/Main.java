package Lesson1010;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        String[] carsArray = new String[5];
        for (int i = 0; i < carsArray.length; i++){
            carsArray[i] = "Машина " + (i +1);
        }
        ArrayList<String> carsList = new  ArrayList<>();
        for (int i = 0; i < carsArray.length; i++){
            carsList.add(carsArray[i]);

        }
        carsList.add(2," Cars 6");//добавить элемент в массив
        carsList.remove("Машина 5");//удалить элемент
        carsList.set(0, "BMW");//заменить элемент
        for (int i = 0; i < carsList.size(); i++) {
            System.out.println(" Put cars " + carsList.get(i));

        }

    }

}
