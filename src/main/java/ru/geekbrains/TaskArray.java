package ru.geekbrains;

public class TaskArray {
    public static void main(String[] args) {
        //replaceArray();
        //fillArray();
        //changeArray();
        fillDiagonal();
        //findMin(int[] arr);
        //findMax(int[] arr);
    }
    /*
    1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0.
    */
    public static void replaceArray() {
            int[] arr = {1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1) {
                    arr[i] = 0;
                }
                else {
                        arr[i] = 1;
                    }
                        System.out.print(arr[i] + " ");
            }
    }

    /*
    2. Задать пустой целочисленный массив размером 8.
    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    */
    public static void fillArray() {
        int[] arr = new int[8];
        for (int i = 0; i <= arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] + " ");
        }
        }

    /*
    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2
     */
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
                System.out.print(arr[i] + " ");
            }
        }
    }
    /*
    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами.
     */
    public static void fillDiagonal() {
        //int[][] arr = new int[4][4];
           int[][] arr = {
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 1, 0},
                {1, 0, 0, 1},
           };
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr.length; x++) {
                System.out.print(arr[y][x] + " ");
            }
            System.out.println();
        }
    }
    /*
    5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы.
     */
    public static void findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                   min = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
    }



