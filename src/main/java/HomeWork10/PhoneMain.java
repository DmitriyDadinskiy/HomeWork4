package HomeWork10;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class PhoneMain {
    public static Scanner sName = new Scanner(System.in);

    public static void main(String[] args) {
        String searchSname;
        //Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
        // В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать
        // номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (несколько
        // номеров у одного человека), тогда при запросе такой фамилии должны выводиться все телефоны.
        // Нет смысла хранить для одного человека несколько одинаковых номеров.

        Human human1 = new Human("Петров");
        Human human2 = new Human("Сидоров");
        Human human3 = new Human("Иванов");
        Human human4 = new Human("Дятлов");
        Human human5 = new Human("Петухов");
        Phone phone1 = new Phone("909 888");
        Phone phone2 = new Phone("909 111");
        Phone phone3 = new Phone("909 222");
        Phone phone4 = new Phone("909 333");
        Phone phone5 = new Phone("909 444");
        Phone phone6 = new Phone("909 555");
        Phone phone7 = new Phone("909 666");
        Phone phone8 = new Phone("909 777");

        HashMap<Human, List<Phone>> map = new HashMap<>();
        map.put(human1, Collections.singletonList(phone1));
        map.put(human2, Collections.singletonList(phone2));
        map.put(human3, Collections.singletonList(phone3));
        map.put(human4, Arrays.asList(phone4, phone5, phone6));
        map.put(human5, Arrays.asList(phone7, phone8));

        //      System.out.println("Введите фамилию абонента");
        //    searchSname = sName.nextLine();

        List<Phone> phone = map.get(human4);
        System.out.println(phone);
        //       System.out.println(map.containsKey("Дятлов"));


    }
}
