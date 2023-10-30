package AQAston.Lesson_3;

import java.sql.SQLOutput;

public class Lesson_3 {
    public static void main(String[] args) {
    }


    public static boolean Sum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }


    public static void PositiveOrNegative(int number) {
        if (number >= 0) {
            System.out.println("Положительное");
        }
        else System.out.println("Отрицательное");
    }


    public static boolean NegativeOrPositive(int number) {
        return number >= 0;
    }


    public static void PrintString(String string, int count) {
        for (int i = 0; i <= count; i++) {
            System.out.println(string);
        }
    }


    public static boolean LeapYearChecker(int year) {
        if (year % 400 == 0) {
            return true;
        }
        else if (year % 100 == 0) {
            return false;
        }
        else if (year % 4 == 0) {
            return true;
        }
        else return false;
    }


    public static void ArrayReplacer() {
        int[] array = {0, 1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }
            else if (array[i] == 1) {
                array[i] = 0;
            }
        }
        // вывод массива после замены
        for (int i : array) {
            System.out.println(array[i]);
        }
    }


    public static void ArrayFiller() {
        int[] array = new int[100];
        for (int i = 1; i <= 100; i++) {
            array[i] = i;
        }
        // вывод массива после замены
        for (int i : array) {
            System.out.println(array[i]);
        }
    }

    public static void Array() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        // вывод массива после замены
        for (int i : array) {
            System.out.println(array[i]);
        }
    }

    public static void TwoDimensionalArray() {
        int size = 6;
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            array[i][i] = 1;
            array[i][size - 1 - i] = 1;
        }

        // вывод двумерного массива
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static int[] ArrayReturn(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}
