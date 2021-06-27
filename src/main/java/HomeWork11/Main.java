package HomeWork11;



import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);


        String[] test = {"1","2","3","4","5"};
        System.out.println(Arrays.toString(test));
        change(test,0,4);
        System.out.println(Arrays.toString(test));

   List<String> listTest = changeArr(test);
        System.out.println(listTest);
        }
        public static <I> void change (I [] array, int index1, int index2){
        I temp1 = array[index1];
        array[index1] = array[index2];
        array[index2] = temp1;


        }
        //Написать метод, который преобразует массив в ArrayList;
    public static <E> List<E> changeArr(E [] array){  //Е - типизация задали Е и принимаем массив с такой же типизацией Е
        return Arrays.asList(array);

    }
    }


