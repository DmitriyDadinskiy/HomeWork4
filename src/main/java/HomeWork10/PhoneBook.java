package HomeWork10;

import java.util.*;

public class PhoneBook {


    private HashMap<String, List<Long>> map; // создали мапу

    public PhoneBook() {

        this.map = new HashMap<String, List<Long>>();
    }



    public void add(String s, Long p){
        List<Long> number = new ArrayList<>(); //лист для хранение справочника, где  s - ФАМИЛИЯ, p - телфон
        if (this.map.containsKey(s)){ // если ключ мапы уже есть в мап, то
            number = map.get(s);// вытаскиваем этот ключ
            number.add(p); // приклеиваем номер телефона уже к существующему ключу
        //    this.map.put(s, number); // складыавем в МАПу необязательно делать уже впрошлом методе сделали и все добавляется
        } else {
            number.add(p); // в противном сулучае
            this.map.put(s,number);// складываем в МАПУ и новый ключ - это фамилия, и новый телефон.

        }
    }
    public String get(String s){
        String res = ""; //выводим строку

        if(this.map.containsKey(s)){ // если строка содержит s, т.е. фамилию
            res = "Телефон " + s + "-" + this.map.get(s).toString() // то выводим в строку res фамилию (ключ) и номера телефонов из мапы
                    .replace("[","") // убрать квадратные скобочки путем замены на пустое значение
                    .replace("]", "")// убрать квадратные скобочки путем замены на пустое значение
                    .replace(",", ";"); // убрпать запятую между телефонам, путем замены на ;
   //                 .trim(); // возвращает копию строки с пропущенными начальными и конечными пробелами, другими словами метод позволяет в Java удалить пробелы в начале и конце строки.
        } else {
            res = " Телефона нет "; // значение пустое, то выводим телефона нет в строку
        }
        return res; //возвращаемся в  res
    }

}
