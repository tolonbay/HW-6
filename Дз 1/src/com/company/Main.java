package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Основное задание
        String myFitsLesson = "Excellent";
        final int NUM = 0;
        String word = "Hello";
        System.out.println(myFitsLesson + " "+ NUM +" "+ word);

        if (NUM <= 0){
            System.out.println("Вы сохранили отрицателное число.");
        }

        if (NUM > 0){
            System.out.println("Вы сохранили положителное число.");
        } else {
            System.out.println("Вы сохранили нуль");
        }
        // Дополнителное задание

        Scanner greeting = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String word1 = greeting.nextLine();
        String word2 = "Привет!";
        System.out.println(word2 + word1);
    }
}
