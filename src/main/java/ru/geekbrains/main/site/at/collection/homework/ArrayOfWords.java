package ru.geekbrains.main.site.at.collection.homework;

import java.util.HashMap;
import java.util.Map;

public class ArrayOfWords {
    public static void main(String[] args) {
        String[] words = {
            "кот", "собака", "лошадь", "кот", "попугай", "кот", "хомяк", "собака", "собака", "корова", "петух", "кролик", "хомяк"
        };

        Map<String, Integer> myWords = new HashMap<>();
        for (String word : words) {
            Integer count = myWords.get(word);
            myWords.put(word, count == null ? 1 : count + 1);
        }
        System.out.println(myWords);
    }
}
