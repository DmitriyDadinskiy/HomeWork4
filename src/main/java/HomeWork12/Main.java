package HomeWork12;

public class Main {

    static final int SIZE = 10000000;
    static final int half = SIZE/2;
    private static Object Runnable;


    public static void main(String[] args) {

//        1) Создают одномерный длинный массив
        //       2) Заполняют этот массив единицами.
        long a = System.currentTimeMillis();
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
   //         System.out.println(arr[i]);
        }
       System.out.println(System.currentTimeMillis() - a + " мсекунд работает расчет массива в один поток");
        System.out.println("или " + (System.currentTimeMillis() - a) / 1000f + " сек");
//3) Засекают время выполнения: long a = System.currentTimeMillis().

        flow();
    }
    //второй метод. Тоже самое только в два потока.

    public static void flow(){
        long allMethods = System.currentTimeMillis();

        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;

        }
        long a1 = System.currentTimeMillis();
        float[] arr1 = new float[half];
        float[] arr2 = new float[half];
        System.arraycopy(arr, 0, arr1, 0, half);
            System.arraycopy(arr, half, arr2, 0, half);
        System.out.println(System.currentTimeMillis() - a1 + " мсекунд работает разбивка массива");

        long a2 = System.currentTimeMillis();
        for (int i = 0; i < arr1.length; i++){
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a2 + " мсекунд работает расчет первой части массива");

        long a3 = System.currentTimeMillis();
        Thread thread  = new Thread((java.lang.Runnable) Runnable);{
            for (int i = 0; i < arr2.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
        }
        thread.start();
        System.out.println(System.currentTimeMillis() - a3 + " мсекунд работает расчет парралельного потока второй части массива");

        try { // блок ожидания выполнения всех потоков
            thread.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        long arrNew = System.currentTimeMillis();
        System.arraycopy(arr1, 0, arr, 0, half);
        System.arraycopy(arr2, 0, arr, half, half);
        System.out.println(System.currentTimeMillis() - arrNew + " мсекунд работает склейка массива");
        System.out.println("");
        System.out.println((System.currentTimeMillis() - allMethods)/1000f + " сек. работает расчет с двумя потоками");




    }

}
