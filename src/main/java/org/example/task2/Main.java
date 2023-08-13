package org.example.task2;

import java.util.Scanner;
/*
Задача 2: Напишите программу, которая запрашивает у пользователя два числа и выполняет их деление. Если второе число
равно нулю, программа должна выбрасывать исключение DivisionByZeroException с сообщением "Деление на ноль недопустимо".
В противном случае, программа должна выводить результат деления.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите число b: ");
        int num2 = scanner.nextInt();

        try {
            int result = divide(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (
                DivisionByZeroException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
        // Создаем метод деления с проверкой
        public static int divide ( int a, int b) throws DivisionByZeroException {
            if (b == 0) {
                throw new DivisionByZeroException("Деление на ноль недопустимо!");
            }
            return a / b;
        }
}

// Создаем свой класс исключения
class DivisionByZeroException extends Exception {
public DivisionByZeroException(String message) {
            super(message);
    }
}
