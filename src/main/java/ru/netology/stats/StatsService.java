package ru.netology.stats;
public class StatsService {
    public long sumAllSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public double averageSumSales(long[] sales) {
        double averageSum = 0;
        for (int i = 0; i < sales.length; i++) {
            averageSum = (averageSum + sales[i]);
        }
        return averageSum / sales.length;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int belowAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSum)
                belowAverageMonth += 1;
        }
        return belowAverageMonth;
    }

    public int salesAboveAverage(long[] sales) {
        int aboveAverageMonth = 0;
        double averageSum = averageSumSales(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSum)
                aboveAverageMonth += 1;
        }
        return aboveAverageMonth;
    }
}
