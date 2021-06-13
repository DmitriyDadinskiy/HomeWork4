package HomeWork9;

public class MyArrayDataException extends Exception {
    public int i;
    public int j;
    public MyArrayDataException (int i, int j){
        this.i = i;
        this.j = j;
    }
//    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
//        int count = 0;
//        if (arr.length != 4) {
//            throw new MyArraySizeException();
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i].length != 4) {
//                throw new MyArraySizeException();
//            }
//            for (int j = 0; j < arr[i].length; j++) {
//                try {
//                    count = count + Integer.parseInt(arr[i][j]);
//                }
//                catch (NumberFormatException e) {
//                    throw new MyArrayDataException(i, j);
//                }
//            }
//
//        }
//        return count;
//    }
}
