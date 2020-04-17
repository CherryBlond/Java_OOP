package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatTests {

    @RepeatedTest(value = 7)
    void checkEquals() {
        Assertions.assertEquals(2, 1+1, "Проверка не прошла");
    }


}
