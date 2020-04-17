package ru.geekbrains.main.site.at.example.assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class CheckAssertTest {

    @Test
    void assertEquals() {
        Assertions.assertEquals(2, 1+1, "Числа не равны");
    }


    @Test
    void assertTrue() {
        Assertions.assertTrue(2>= 1+1, "Числа не равны");
    }

    @Test
    void assertFalse() {
        Assertions.assertFalse(2> 1+1, "Числа не равны");
    }

    @Test
    void assertNull() {
        String name = null;
        Assertions.assertNull(name);
    }

    @Test
    void assertNotNull() {
        String name = "null";
        Assertions.assertNotNull(name);
    }

    @Test
    void assertEquals2() {
        RuntimeException runtimeException = new RuntimeException("123");
        Assertions.assertEquals("123", runtimeException.getMessage());
    }

    @Test
    void assertAll() {
        String name = "Кот";
        Assertions.assertAll(
            "Проверк числа",
            ()->Assertions.assertEquals("Собака", name),
            ()->Assertions.assertEquals("Кот", name),
            ()->Assertions.assertEquals("Енот", name)
            );
    }
    @Test
    void assertTimeout() {
        Assertions.assertTimeout(Duration.ofSeconds(2), ()-> {
            sleep(3000);
        });

    }

    }
