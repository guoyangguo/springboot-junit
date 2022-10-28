package com.autumnin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 *
 */
public class JUnitParameterizedTests {
    /**
     * @param value
     */
    @ParameterizedTest
    @ValueSource(strings = {"hello", "world"})
    void testEchoStr(String value) {
        System.out.println(value);
    }

    @ParameterizedTest
    @NullSource
    void testEchoClass(String value) {
       // Assertions.assertTrue(true);
        Object obj = new Object();
        Object obj2 = new Object();
        Assertions.assertSame(obj,obj);
       // Assertions.assertNull(value,"value is  null");
    }

}
