package org.example.seminar_1;

import java.util.Arrays;


// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух
// входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то
// оповестить пользователя.


public class HW_1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 1, 1};
        int[] arr2 = {4, 5, 6};

        System.out.println(Arrays.toString(subtractArrays(arr1, arr2)));
    }


    /**
     * Вычитание массивов
     *
     * @param arr1 первый массив
     * @param arr2 второй массив
     * @return новый массив, каждый элемент которого равен разности элементов двух
     * входящих массивов в той же ячейке
     * @throws IllegalArgumentException В данном методе будет выброшено исключение,
     *                                  если длины входных массивов не совпадают.
     */
    public static int[] subtractArrays(int[] arr1, int[] arr2) throws IllegalArgumentException {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Массивы должны быть одинаковой длины");
        }
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }
        return result;
    }
}
