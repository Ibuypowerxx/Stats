package ru.netology.stats.stats.services;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public long avgSales(long[] sales) {
        long sum = sumSales(sales);
        return sum / sales.length;
    }

    public int lessThanAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                count++;
            }
        }
        return count;
    }

    public int moreThanAvgSales(long[] sales) {
        long avg = avgSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales(sales)) {
                count++;
            }
        }
        return count;
    }
}