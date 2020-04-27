package ru.geekbrains.main.site.at.collection.map;

import ru.geekbrains.main.site.at.collection.Dog;
import ru.geekbrains.main.site.at.collection.Human;

import java.util.HashMap;

public class GetExample {

    public static void main(String[] args) {
        HashMap<Human, Dog> mapDogs = new HashMap<>();
        mapDogs.put(new Human("Иван"), new Dog("Шарик"));

        System.out.println(mapDogs.get(new Human("Иван")));

    }
}
