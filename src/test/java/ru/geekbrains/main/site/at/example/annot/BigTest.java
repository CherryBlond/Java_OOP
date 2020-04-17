package ru.geekbrains.main.site.at.example.annot;

import org.junit.jupiter.api.*;
import ru.geekbrains.main.site.at.example.annot.base.BaseTest;

public class BigTest extends BaseTest {


    @BeforeAll
    static void beforeall() {
        System.out.println("beforeall");
    }

    @BeforeEach
    void setUp1() {
        System.out.println("setUp1");

    }
    @BeforeEach
    void setUp2() {
        System.out.println("setUp2");

    }


    @Test
        void checkEquals1() {
            System.out.println("checkEquals1");
            Assertions.assertEquals(2, 1+1, "Проверка не прошла");
        }



        @Test
        void checkEquals2() {
            System.out.println("checkEquals2");
            Assertions.assertEquals(2, 1+1, "Проверка не прошла");
        }

    @AfterEach
    void tearDown1() {
        System.out.println("tearDown1");

    }


    @AfterEach
    void tearDown2() {
        System.out.println("tearDown2");

    }

    @AfterAll
    static void afterall() {
        System.out.println("afterall");
    }
}

