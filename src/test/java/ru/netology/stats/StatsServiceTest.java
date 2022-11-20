package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    void shouldCalcSum() {
        StatsService service = new StatsService();

        int expected = 180;
        int actual = service.sum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcAverageSum() {
        StatsService service = new StatsService();

        int expected = 15;
        int actual = service.averageSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMaxSale() {
        StatsService service = new StatsService();

        int expected = 8;
        int actual = service.maxSaleMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcMinSale() {
        StatsService service = new StatsService();

        int expected = 9;
        int actual = service.minSaleMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcBelowAverageSale() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.belowAverageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalcOverAverageSale() {
        StatsService service = new StatsService();

        int expected = 5;
        int actual = service.overAverageSale(sales);

        assertEquals(expected, actual);
    }
}
