package ru.netology.stats;

public class StatsService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public int averageSum(int[] sales) {
        int sum = sum(sales);
        return sum / sales.length;
    }

    public int maxSaleMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSaleMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverageSale(int[] sales) {
        int belowAverageSale = 0;
        for (int i : sales) {
            if (i < averageSum(sales)) {
                belowAverageSale++;
            }
        }
        return belowAverageSale;
    }

    public int overAverageSale(int[] sales) {
        int overAverageSale = 0;
        for (int i : sales) {
            if (i > averageSum(sales)) {
                overAverageSale++;
            }
        }
        return overAverageSale;
    }
}