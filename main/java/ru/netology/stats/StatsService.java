package ru.netology.stats;


public class StatsService {

    public long sumMonth(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;

    }

    public long averageMonth(long[] sales) {
        long average = sumMonth(sales)/ sales.length;
        //long sum =0;
        //for (long sale : sales) {
        //    sum = sum + sale;
        //}
        //average = sum / sales.length;
        return average;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        int arr[];
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        int arr[];
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public long belowAverage(long[] sales){
        long belowActual = averageMonth(sales);
        long below = 0;
        for (long sale : sales){
            if (belowActual <= sale);
            else below = below+1;
            
        }
        return below;
    }
    public long aboveAverage(long[] sales){
        long belowActual = averageMonth(sales);
        long below = 0;
        for (long sale : sales){
            if (belowActual >= sale);
            else below = below+1;

        }
        return below;
    }


}
