package ru.netology.stats;
public class StatsService {
    public long sumSales(long[] sales) {
        long totaSale = 0;
        for (long sale : sales) {
          totaSale += sale;
        }
        return totaSale;
    }
    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }
    public int calcMonthMaximumSale(long[] sales) {
        int montMaximum = 0;
        for (int i = 0; i < sales.length; i++ ) {
            if (sales[i] >= sales[montMaximum]) {
                montMaximum = i;
            }
        }
        return montMaximum + 1;
    }
    public int calcMonthMinimumSale(long[] sales) {
        int montMinimum = 0;
        for (int i = 0; i < sales.length; i++ ) {
            if (sales[i] <= sales[montMinimum]) {
                montMinimum = i;
            }
        }
        return montMinimum + 1;
    }
    public int calcMonthsBellowAverage(long[] sales) {
        int counter = 0;
        long average = averageSale(sales);
        for (long sale : sales) {
            if (sale < average) {
                counter++;
            }
        }
        return counter;
    }