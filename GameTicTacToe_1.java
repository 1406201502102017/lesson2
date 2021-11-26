package ru.geekbrains;

import java.util.Scanner;
import java.util.Random;

public class GameTicTacToe_1 {
    /*
    1. Полностью разобраться с кодом, попробовать переписать с нуля,
    стараясь не подглядывать в методичку.
    2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
    например, с использованием циклов.
    3. Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4;
    Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
     */

    public static char[][] map;
    public static final int SIZE = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    private static int roundCount;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();

        roundCount += 1;
        System.out.println("fight №" + roundCount);

        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Human w o n!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("!!!Peace!!!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Machine w o n!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("!!!Peace!!!");
                break;
            }
        }
        System.out.println("Game over");
    }

        public static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        public static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print((i + 1) + " ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Enter coordinates by type X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

//    public static boolean checkWin(char symb) {
//        if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }

    public static char checkWin() {
        char win = ' ';
        // Проверка по горизонтали
        for (int i = 0; i < 3; i++) {
            if (map[i][0] == map[i][1] && map[i][1] == map[i][2] && map[i][0] != '+') {
                win = map[i][0];
                break;
            }
        }
        // Проверка по вертикали
        if (win == ' ') {
            for (int i = 0; i < 3; i++) {
                if (map[0][i] == map[1][i] && map[1][i] == map[2][i] && map[0][i] != '+') {
                    win = map[0][i];
                    break;
                }
            }
        }
        // Проверка по диагонали
        if (win == ' ') {
            if (map[0][0] == map[1][1] && map[1][1] == map[2][2] && map[0][0] != '+') {
                win = map[0][0];
            }
        }
        return win;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("the Machine was like a point   " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }
}
