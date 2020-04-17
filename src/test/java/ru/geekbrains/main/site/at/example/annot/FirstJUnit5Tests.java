package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstJUnit5Tests {

    @Test
    void checkEquals() {
        Assertions.assertEquals(2, 1+1, "Проверка не прошла");
    }
}
