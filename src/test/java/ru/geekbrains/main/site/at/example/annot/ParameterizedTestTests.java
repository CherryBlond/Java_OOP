package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

@DisplayName("Параметризованные тесты")
public class ParameterizedTestTests {

    //    простой пример
    @ParameterizedTest
    @ValueSource(strings = {"Курсы", "Вебинары"})
    public void test(String name) {
        Assertions.assertNotNull(name);
    }

    //    пример с передачей одного аргемента
    @ParameterizedTest
    @MethodSource("stringProvider")
    public void test2(String name) {
        Assertions.assertNotNull(name);
    }

    public static Stream<String> stringProvider() {
        return Stream.of("Курсы", "Вебинары");
    }


    //    пример с передачей множества аргементов

    @ParameterizedTest
    @MethodSource("stringProvider2")
    public void test3(String name, int age) {
        Assertions.assertNotNull(name);
    }

    public static Stream<Arguments> stringProvider2() {
        return Stream.of(
            Arguments.of("Курсы", 59),
            Arguments.of("Вебинары", 49)
        );

    }

    //    пример с передачей множества аргементов с названием

    @ParameterizedTest (name = "тему: {0} проходить: {1} года")
    @MethodSource("stringProvider3")
    public void test4(String name, int age) {
        Assertions.assertNotNull(name);
    }

    public static Stream<Arguments> stringProvider3() {
        return Stream.of(
            Arguments.of("Курсы",2),
            Arguments.of("Вебинары",3)
        );

    }



}
