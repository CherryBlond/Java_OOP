package ru.geekbrains.main.site.at.example.annot.base;

import org.junit.jupiter.api.*;

public class BaseTest {

    @BeforeAll
    static void beforeallBaseTest() {
        System.out.println("beforeallBaseTest");
    }

    @BeforeEach
    void setUp1BaseTest() {
        System.out.println("setUp1BaseTest");

    }
    @BeforeEach
    void setUp2BaseTest() {
        System.out.println("setUp2BaseTest");

    }


    @AfterEach
    void tearDown1BaseTest() {
        System.out.println("tearDown1BaseTest");

    }


    @AfterEach
    void tearDown2BaseTest() {
        System.out.println("tearDown2BaseTest");

    }

    @AfterAll
    static void afterallBaseTest() {
        System.out.println("afterallBaseTest");
    }
}

