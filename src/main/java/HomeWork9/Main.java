package HomeWork9;

public class Main {
    public static void main(String[] args) {


//    1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
//    При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//    2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
//    Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
//    должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.


        String[][] arr = new String[][]
                    {{"1","2","2","2"},
                    {"1","4","2","2"},
 //                   {"1","k","2","2"}, // Раскоментить для проверки рабоыт исключения
                    {"0","2","2","2"},
                    {"0","2","2","2"}};

        try {
            chek(arr);
            System.out.println("С массивом все ок");
        } catch (MyArraySizeException e){
            e.printStackTrace();
        }
        System.out.println("Массив превышен 4х4");


    }

    public static void chek(String[][] arr) throws MyArraySizeException {
        int sum = 0;
       if (arr.length != 4) {
            throw new MyArraySizeException(" Массив не ок");
        }
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr.length; i++){
            sum = sum + Integer.parseInt(arr[i][j]);
                System.out.println(sum);
        }


    }

}
//                м{
//                    for (int j = 0; j < arr.length; j++)
//                    if (arr[i].length != 4 && arr[j].length != 4){
//                      throw new MyArraySizeException("массив за переделами 4х4");
//                    };
//                }








