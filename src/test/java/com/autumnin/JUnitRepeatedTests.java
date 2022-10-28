package com.autumnin;

import org.junit.jupiter.api.RepeatedTest;

public class JUnitRepeatedTests {
    @RepeatedTest(value = 3)
    void echo() {
        System.out.println("hello world");
    }
}
