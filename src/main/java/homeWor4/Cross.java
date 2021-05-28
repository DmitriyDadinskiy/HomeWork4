package homeWor4;


import java.util.Random;
import java.util.Scanner;
//Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку. (не подглядывать не получилось)
public class Cross {

    private static final int SIZE = 5;
    private static final int DOTS_TO_WIN = 4;
    private static final char DOT_EMPTY = '-';
    private static final char DOT_X = 'x';
    private static final char DOT_0 = '0';
    private static char[][] map;
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (isWin(DOT_X)) {
                System.out.println("Вы победили, УРА!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Пбедила дружба ;)");
                break;
            }
            aiTurn();
            printMap();
            if (isWin(DOT_0)) {
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Победила дружба");
                break;
            }
        }
        System.out.println("Игра окончена");

    }


    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координату по вертикали");
            x = sc.nextInt() - 1;
            System.out.println("Введите координату по горизонтали");
            y = sc.nextInt() - 1;
        } while (isCellInvalid(x, y));
        map[y][x] = DOT_X;
    }

    private static boolean isCellInvalid(int x, int y) {
        return (x < 0 || x >= SIZE)
                || (y < 0 || y >= SIZE)
                || map[y][x] != DOT_EMPTY;
    }

    //    Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    // сначала нужно искать повтороения элементов из DOTS_TO_WIN = 3 подряд  в колонке, потом строке, потом потом левая диагональ, правая диагональ или наоборот
    private static boolean isWin(char symb) {
if (diagonal(symb) || vertHoriz(symb)) return true;
return false;
    }

    public static boolean diagonal(char symb) {
        boolean leftDiagonal, rightDiagonal;
        leftDiagonal = true;
        rightDiagonal = true;

        for (int i = 0; i < DOTS_TO_WIN; i++) {
            rightDiagonal &= (map[i][i] == symb);
            leftDiagonal &= (map[DOTS_TO_WIN - i - 1][i] == symb);
        }
            if (leftDiagonal || rightDiagonal) return true;

            return false;
        }

    public static boolean vertHoriz(char symb) {
        boolean vert, horiz;
        vert = true;
        horiz = true;
        for (int i = 0; i < DOTS_TO_WIN; i++) {

            for (int j = 0; j < DOTS_TO_WIN; j++) {

                vert &= (map[i][j] == symb);
                horiz &= (map[j][i] == symb);
            }
            if (vert || horiz) return true;
        }
            return false;
        }


//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;

    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
return true;
    }
    private static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (isCellInvalid(x, y));
        System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
        map[y][x] = DOT_0;
    }
}



