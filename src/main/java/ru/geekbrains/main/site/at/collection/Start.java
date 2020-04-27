package ru.geekbrains.main.site.at.collection;

import org.apache.commons.collections4.ListUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Start {

    public static void main(String[] args) {

        Dog dog = new Dog("Джек");

        List<Dog> dogs = new ArrayList<>();

//        добавление
        dogs.add(new Dog("Лорд"));
        dogs.add(new Dog("Джек"));
        dogs.add(new Dog("Барбос"));
        dogs.add(new Dog("Барбос"));
        dogs.add(new Dog("Барбос"));
        dogs.add(new Dog("Барбос"));
        dogs.add(new Dog("Барбос"));

        System.out.println("проверить, что массив не пустой");
        System.out.println(dogs.isEmpty());

        System.out.println(dogs);


       System.out.println("получение");
        System.out.println(dogs.get(2));


        System.out.println("найти по индексу");
        System.out.println(dogs.indexOf(dog));

        System.out.println("проверка на вхождение в коллекцию");
        System.out.println(dogs.contains(dog));


        System.out.println("удаление");
        System.out.println(dogs.remove(2));
        System.out.println(dogs.remove(dog));
        System.out.println(dogs);

        System.out.println("заменить");
        dogs.set(0, new Dog("Барбос"));
        System.out.println(dogs);

        System.out.println("очистить массив");
        dogs.clear();
        System.out.println(dogs);

        System.out.println("проверить, что массив пустой");
        System.out.println(dogs.isEmpty());


        System.out.println("Сортировка");
        List<String> listString = new ArrayList<>();
        listString.add("Лорд");
        listString.add("Джек");
        listString.add("Барбос");
        listString.add("Барбос");
        listString.add("Барбос");
        listString.add("Барбос");
        Collections.sort(listString);
        System.out.println(listString);



        System.out.println("Проверяем, сколько раз одинаковый объект добавлен в лист");
       int frequency = Collections.frequency(listString, "Барбос");
        System.out.println(frequency);

        System.out.println("объединение");

        List<String> listString1 = new ArrayList<>();
        listString1.add("Лорд");
        listString1.add("Джек");


        List<String> listString2 = new ArrayList<>();
        listString2.add("Лорд");
        listString2.add("Барбос");
        List<String> union = ListUtils.union(listString1,listString2);

        System.out.println(union);



//        System.out.println("конвертируем в обычный массив");
//        System.out.println(dog.toArray());




//        ensureCapacity() - фиксированный размер массива
//            trimToSize() - удаляет пустые ячейки


//        List<String> listString = new ArrayList<>();
//        listString.add("Лорд");
//        listString.add("Джек");
//        listString.add("Барбос");
//        System.out.println(listString);
//        Collections.sort(listString);
//        System.out.println(listString);


    }
}