package ru.geekbrains.main.site.at.example.hamcrest;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {
    @Test
    void testGreaterThan() {
        int number = 10;
        assertThat(number, greaterThan(9));
    }

    @Test
    void testGreaterThanOrEqualTo() {
        int number = 10;
        assertThat(number, greaterThanOrEqualTo(9));
    }

    @Test
    void testLessThanOrEqualTo() {
        int number = 10;
        assertThat(number, lessThanOrEqualTo(19));
    }

    @Test
    void checkString() {
        String name = "Бармаглот";
        assertThat(name, equalToIgnoringCase("БармАГлот"));
        assertThat(name, containsString("Барм"));
        assertThat(name, endsWith("лот"));

    }

    @Test
    void checkString2() {
        String name = "   Бармаглот";
        assertThat(name, equalToCompressingWhiteSpace("Бармаглот"));

    }

    @Test
    void objectCheck() {
        Dog dog1 = new Dog("Лорд");
        Dog dog2= new Dog("Лорд");
        Dog dog3= new Dog("Том");

//        проверить пометоду ToString
        assertThat(dog1, hasToString("Dog{name='Лорд'}"));

//        класс является подтипом
        assertThat(Dog.class, typeCompatibleWith(Animal.class));

//        объект является подтипом
        assertThat(dog2, instanceOf(Animal.class));

//        проверка проперти
        assertThat(dog2, hasProperty("name"));
        assertThat(dog2, hasProperty("name", equalTo("Лорд")));

//        проверка объектов по значениям
        assertThat(dog1, samePropertyValuesAs(dog2));
        assertThat(dog3, samePropertyValuesAs(dog2));

    }

//      allof() - все проверки должны быть успешными
//      anyof() любая из проверок должна быть успешная
//      not()  все проверки должны быть неуспешными

    @Test
    void objectCheck2() {
        Dog dog1 = new Dog("Лорд");
        Dog dog2 = new Dog("Лорд");
        Dog dog3 = new Dog("Том");


        assertThat(dog2,
            allOf(instanceOf(Animal.class),
                hasProperty("name"),
                hasProperty("name", equalTo("Лорд"))
        ));


        assertThat(dog2,
            anyOf(instanceOf(Animal.class),
                hasProperty("name"),
                hasProperty("name", equalTo("Лорд"))
            ));

        assertThat(dog1,
            not(allOf(instanceOf(Cat.class),
                hasProperty("name", equalTo("Том")))
            ));

    }
    }
