package org.example;
import java.util.*;

public class Main {
        public static void main(String[] args) {
            String[] wordArr = {"Зомби", "Еда", "Клавиатура", "Палочка", "Тетрадь", "Зомби", "Кот", "Клавиатура", "Хлеб", "Сумка", "Портфель", "Лера"};
            HashMap<String, Integer> wordList = new HashMap<String, Integer>();

            for (String a : wordArr){
                wordList.merge(a, 1,(f,g) -> g+f);
            }
            System.out.println(wordList.entrySet());

            Translator translator = new Translator();

            translator.addTranslation("Apple", "Яблоко");
            translator.addTranslation("Apple", "Яблоко");
            translator.addTranslation("Car", "Автомобиль");
            translator.addTranslation("Car", "Машина");
            translator.addTranslation("Car", "Машина");
            // Будет сгенерировано предупреждение

            System.out.println("Словарь переводов:");
            translator.printTranslations();
        }
}