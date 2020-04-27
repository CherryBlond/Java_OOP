package ru.geekbrains.main.site.at.collection.homework;

import java.util.*;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> currentPhoneNumbers = phoneBook.get(surname);
        if (currentPhoneNumbers == null) {
            currentPhoneNumbers = new HashSet<>();
        }

        currentPhoneNumbers.add(phoneNumber);
        phoneBook.put(surname, currentPhoneNumbers);
    }

    public Set<String> get(String surname) {
        return phoneBook.get(surname);
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов", "+7-111-111-22-33");
        phoneBook.add("Иванов", "+7-111-111-22-33");
        phoneBook.add("Иванов", "+7-222-111-22-33");

        phoneBook.add("Петрова", "+7-333-111-22-33");
        phoneBook.add("Петрова", "+7-444-111-22-33");

        phoneBook.add("Сидоров", "+7-444-111-22-33");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петровой: " + phoneBook.get("Петрова"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
    }
}
