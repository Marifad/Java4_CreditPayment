public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int sum = 1_000_000;
        int period = 1;
        float percent = 9.99F;
        int result = (int) service.calculate(sum, period, percent);
        System.out.println("Месячный платеж при кредите на 1 год = " + result + " руб.");

        int periodSecond = 2;
        int resultSecond = (int) service.calculate(sum, periodSecond, percent);
        System.out.println();
        System.out.println("Месячный платеж при кредите на 2 года = " + resultSecond + " руб.");

        int periodThird = 3;
        int resultThird = (int) service.calculate(sum, periodThird, percent);
        System.out.println();
        System.out.println("Месячный платеж при кредите на 3 года = " + resultThird + " руб.");
    }
}
