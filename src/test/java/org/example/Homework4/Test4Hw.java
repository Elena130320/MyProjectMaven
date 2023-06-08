package org.example.Homework4;

import org.example.HomeWork4.ExampleClass;
import org.example.HomeWork4.MyException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Test4Hw {
    @Test
    void test() throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertThrows(MyException.class, () -> exampleClass.triangleSquare(-3, 4, 5));
        Assertions.assertThrows(MyException.class, () -> exampleClass.triangleSquare(0, 4, 5));

    }

    @ParameterizedTest
    @CsvSource({"30,40,50,600", "3,4,5,6"})
    void testWithCsvSource(int a, int b, int c, int result) throws MyException {
        ExampleClass exampleClass = new ExampleClass();
        Assertions.assertEquals(result, exampleClass.triangleSquare(a, b, c));
    }
}
