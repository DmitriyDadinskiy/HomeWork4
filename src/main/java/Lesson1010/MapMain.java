package Lesson1010;

import java.util.*;

public class MapMain {

    public static void main(String[] args) {
Human human1 = new Human("Дима");
Human human2 = new Human ("Петя");
Human human3 = new Human("Игорь");
Car car1 = new Car("BMW");
Car car2 = new Car("X5");
HashMap<Human, List<Car>> map = new HashMap<>();// обычные приметивы нельзя использовать толькое через Integer
        System.out.println(human3 == human1);
        map.put(human1, Collections.singletonList(car1));//положиле первому человеку машину 2
        map.put(human2, Arrays.asList(car1, car2));
   //     map.put(human1, car1);
     List <Car> cars = map.get(human2);// вернуть машину  человекf
        System.out.println(cars);
     //   System.out.println(car.getName() + " " + human1.getName()); //печать в консоль машину которую получили
    }
}

