package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Проверка чисел")

public class DisplayNameTests {

    @DisplayName("Проверка равенства")
    @Test
        void checkEquals() {
            Assertions.assertEquals(2, 1+1, "Проверка не прошла");
        }
    }

