package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 5, 12, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 11, 5, 8, 4, 5, 3, 8, 6, 11, };
        long expected = 11;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMax3() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = { 1, 2, 1, 2, 1, 2, 1 , 1, 3,};
        long expected = 3;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}