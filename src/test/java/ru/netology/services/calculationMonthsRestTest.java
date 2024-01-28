package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class calculationMonthsRestTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/testData.csv")
    public void testCalcMonthsRest(int income, int expenses, int threshold, int expected) {
        calculationMonthsRest service = new calculationMonthsRest();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
