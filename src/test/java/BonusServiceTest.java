import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderlimit() {
        BonusService service = new BonusService();

//        Подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

//        Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

//        Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndOverlimit() {
        BonusService service = new BonusService();

//        Подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = true;
        long expected = 500;

//        Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

//        Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
    void shouldCalculateUnRegisteredAndOverlimit() {
        BonusService service = new BonusService();

//        Подготавливаем данные:
        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

//        Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

//        Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateUnRegisteredAndUnderlimit() {
        BonusService service = new BonusService();

//        Подготавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

//        Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

//        Производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}