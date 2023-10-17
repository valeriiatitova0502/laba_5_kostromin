package org.example;

import java.util.*;

public class Translator {

    private Map<String, LinkedHashSet<String>> translations;

    public Translator() {
        translations = new LinkedHashMap<>();
    }

    public void addTranslation(String word, String translation) {
        // Получаем набор переводов для данного слова
        LinkedHashSet<String> wordTranslations = translations.getOrDefault(word, new LinkedHashSet<>());

        // Добавляем новый перевод в набор
        if (wordTranslations.add(translation)) { // Эта операция не добавит дубликатов
            // Помещаем обновленный набор обратно в переводчик
            translations.put(word, wordTranslations);
        } else {
            System.out.println("уже есть дубликат этой записи " + translation  + " - " + word );
        }
    }

    public List<String> getTranslations(String word) {
        // Получаем набор переводов для данного слова
        Set<String> wordTranslations = translations.get(word);

        // Возвращаем список переводов
        return (wordTranslations != null) ? new ArrayList<>(wordTranslations) : new ArrayList<>();
    }

    // Словарь переводов
    public void printTranslations() {
        // Выводим словарь переводов в порядке добавления слов
        translations.entrySet();
        System.out.println(translations);//forEach((word, wordTranslations) -> System.out.println( word  + wordTranslations));
    }
}