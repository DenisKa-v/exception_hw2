package org.example.task1;

import java.util.Scanner;

/*
        Задача 1: Напишите программу, которая запрашивает у пользователя число и проверяет, является ли оно
        положительным. Если число отрицательное или равно нулю, программа должна выбрасывать исключение
        InvalidNumberException с сообщением "Некорректное число". В противном случае, программа должна
        выводить сообщение "Число корректно".
*/

public class Main {
    public static void main(String[] args) {
        try {
            inputPositiveNumber();
        } catch (InvalidNumberException e) {
            e.printStackTrace();
        }
    }

    // Создаем метод ввода положительного числа с проверкой
    public static void inputPositiveNumber() throws InvalidNumberException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        double num = scanner.nextDouble();
        if (num <= 0) {
            throw new InvalidNumberException("Некорректное число!");
        } else {
            System.out.print("Число корректно!");
        }
    }
}

// Создаем свой класс исключения
class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}