package HomeWork11;


import java.util.ArrayList;
import java.util.Arrays;

public class Box<D extends Fruit> {

    private final ArrayList<D> box = new ArrayList<>(); // Хранение фруктов
    public Box(){}

    public float getWeight() { //вес фруктов посчитать
        if (box.isEmpty()) {// если коробка пустая, то равно (возвращаем)= 0
            return 0;
        } else {
            return box.size() * box.get(0).getWeight(); // умножаем размер коробки на кол-во фруктов
        }
    }

    public boolean compare(Box<? extends Fruit>  box){ //сравниваем коробки по весу
        return this.getWeight() == box.getWeight();// если равны то ок, если нет то фалсе
    }
    public void replaceAllIn(Box <D> tBox){ // перекладываем коробки с фркутами
        tBox.box.addAll(box); // берем коробку и пересыпаем в  коробку
        box.clear();//очищаем коробку из которой пересыпали
    }
     public void addFruits(D... addFruits){//передаем на вход несколько фруктов ... - позволяют добавлять в коробку больше одного фрукта
        box.addAll(Arrays.asList(addFruits)); // добавляем фрукты
         }
         public void addFruits (D fruit, int summ){
             for (int i = 0; i < summ; i++) {
                 box.add(fruit);
             }
         }
     }

