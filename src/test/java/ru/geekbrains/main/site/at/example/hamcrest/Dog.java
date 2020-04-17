package ru.geekbrains.main.site.at.example.hamcrest;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);

    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + name + '\'' +
            '}';
    }
}
