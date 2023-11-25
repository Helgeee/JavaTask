package zanyatie11.Block2;

public class zadanie1 {
    public static void main(String[] args) {
        double exchangeRate = 74.5; // Курс доллара
        double candyPricePerKg = 20; // 1 кг

        System.out.println("1$ - " + exchangeRate + " р - " + (exchangeRate / candyPricePerKg) + " кг");

        for (int i = 2; i <= 100; i++) {
            double dollars = i;
            double rubles = dollars * exchangeRate;
            double kgOfCandy = rubles / candyPricePerKg;

            System.out.println(i + "$ - " + rubles + " р - " + kgOfCandy + " кг");
        }
    }
}
