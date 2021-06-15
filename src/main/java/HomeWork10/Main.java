package HomeWork10;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). (используй сет)
        String[] arr = new String[] {"Яблоко", "груша", "груша", "черемуха", "игрушка", "стол", "стул", "табурет", "табурет", "test", "смола", "Яблоко", "груша", "черемуха", "игрушка", "стол", "стул", "табурет", "смола" };
        System.out.println("Слов получилось " + arr.length);

        HashSet<String> set = new HashSet<>(Arrays.asList(arr));
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("Размер сета " + set.size()); // Показыает сколько уникальных слов в сете
  //   2.  Посчитать, сколько раз встречается каждое слово. (используй мап)
        Map<String, Long> quantityMap = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e,Collectors.counting()));
        // Arrays.stream(arr) - стрим из масиива берт данные и преообразует в поток, но collect преобразует данные в МАП
        //Collectors.groupingBy - метод позволяющия делать группировку объектов в данному случае одинаковые слова
        //e -> e, - возращает значения (лямбда выражение) Collectors.counting() - метод позовляющий вычислить кол-во элементов в каждой группе
        System.out.println(quantityMap);


    }
}
