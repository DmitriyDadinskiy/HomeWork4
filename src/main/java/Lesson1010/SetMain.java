package Lesson1010;

import java.util.HashSet;
import java.util.Iterator;
public class SetMain {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("1");
        set.add("6");
        set.add("3");
        set.add("7");
        set.add("4");
        set.add("8");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (String s : set) {
            System.out.println(s);
        }
    }

}
