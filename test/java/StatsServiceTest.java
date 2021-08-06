import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import ru.netology.stats.StatsService;


class StatsServiceTest {
    @org.junit.jupiter.api.Test

    public void shouldSumMonth() {
        StatsService serves = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 180;
        long actual = serves.sumMonth(sales);
        assertEquals(espected, actual);
    }

    @Test

    public void shouldAverageMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 15;
        long actual = service.averageMonth(sales);
        assertEquals(espected, actual);
    }

    @Test

    public void shouldMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 9;
        long actual = service.minSales(sales);
        assertEquals(espected, actual);
    }
    @Test

    public void shouldMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 8;
        long actual = service.maxSales(sales);
        assertEquals(espected, actual);
    }
    @Test

    public void belowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 5;
        long actual = service.belowAverage(sales);
        assertEquals(espected,actual);
    }
    @Test

    public void aboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long espected = 5;
        long actual = service.aboveAverage(sales);
        assertEquals(espected,actual);
    }

}
