package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("regress")

public class TagTest {

    @Disabled ("функционал не реализован")
    @Tag("smoke")

    @Test
    void checkEquals1() {
        Assertions.assertEquals(2, 1+1, "Проверка не прошла");
    }

    @Tag("regress")
    @Test
    void checkEquals2() {
        Assertions.assertEquals(6, 1+1, "Проверка не прошла");
    }

}
