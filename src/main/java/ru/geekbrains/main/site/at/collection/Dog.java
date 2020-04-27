package ru.geekbrains.main.site.at.collection;

import java.util.Objects;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private int dog;
    private boolean gender;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog1 = (Dog) o;
        return age == dog1.age &&
            weight == dog1.weight &&
            dog == dog1.dog &&
            gender == dog1.gender &&
            Objects.equals(name, dog1.name) &&
            Objects.equals(breed, dog1.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, breed, age, weight, dog, gender);

    }

    @Override
    public String toString() {
        return "Dog{" +
            "name='" + name + '\'' +
            ", breed='" + breed + '\'' +
            ", age=" + age +
            ", weight=" + weight +
            ", dog=" + dog +
            ", gender=" + gender +
            '}';
    }

    public Dog(String name) {
        this.name = name;







//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }



//
//    }
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if(getClass() != obj.getClass()) {
//            return false;
//        }
//
//
//        Dog dog = (Dog) obj;
//        return this.name == dog.name;
    }
}