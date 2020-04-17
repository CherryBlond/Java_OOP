package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static java.lang.Thread.sleep;

public class TimeoutTest {

    @Timeout(5)
    @Test
    void checkEquals() throws InterruptedException{
        sleep(5100);
        Assertions.assertEquals(2, 1+1, "Проверка не прошла");
    }


}
