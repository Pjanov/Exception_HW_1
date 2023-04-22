package org.example.hw.HW_2;


import java.util.Scanner;

public class Task_1 {

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение. Ввод текста вместо числа не должно приводить к
    // падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

    public static void main(String[] args) {
        System.out.println(promptForFloat());
    }

    public static float promptForFloat() {
        Scanner scanner = new Scanner(System.in);
        boolean inputIsValid = false;
        float result = 0;

        while (!inputIsValid) {
            try {
                System.out.print("Введите дробное число: ");
                result = scanner.nextFloat();
                inputIsValid = true; // Ввод был корректным, закончить цикл
            } catch (Exception e) {
                System.out.println("Ошибка: некорректный ввод. Пожалуйста, повторите попытку.");
                scanner.nextLine(); // Проигнорировать неправильный ввод и запросить новый ввод
            }
        }
        scanner.close();
        return result;
    }
}
