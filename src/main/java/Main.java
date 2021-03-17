public class Main {
    public static void main(String[] args) {
//        BonusServiceMocs service = new BonusServiceMocs();
//
//        long bonusBelowLimitForRegistered = service.calculate(1000_60, true);
//        System.out.println(bonusBelowLimitForRegistered);
//
//        long bonusBelowLimitForUnRegistered = service.calculate(1000_60, false);
//        System.out.println(bonusBelowLimitForUnRegistered);
//
//        long bonusUnderLimitForRegistered = service.calculate(1008880_60, true);
//        System.out.println(bonusUnderLimitForRegistered);
//
//        long bonusUnderLimitForUnRegistered = service.calculate(1008880_60, false);
//        System.out.println(bonusUnderLimitForUnRegistered);

        BonusService service = new BonusService();

//        Подготавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

//        Вызываем целевой метод:
        long actual = service.calculate(amount, registered);

//        Производим проверку (сравниваем ожидаемый и фактический):
//        Если true - то PASS;
//        Если false - то FAIL;
        boolean passed = expected == actual;

//        Выводим результат:
        System.out.println(passed);
    }
}
