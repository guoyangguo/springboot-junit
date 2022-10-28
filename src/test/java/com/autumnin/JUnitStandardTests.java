package com.autumnin;

import org.junit.jupiter.api.*;

public class JUnitStandardTests {
    @BeforeAll
    static void intAll() {
        System.out.println("before all");
    }

    @BeforeEach
    void init() {
        System.out.println("before each");
    }

    @Test
    @RepeatedTest(value = 3)
    void echo() {
        System.out.println("hello world");
    }

    @AfterEach
    void stop() {
        System.out.println("stop each");
    }

    @AfterAll
    static void stopAll() {
        System.out.println("stop all");

    }
}
