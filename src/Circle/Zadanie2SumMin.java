package Circle;

public class Zadanie2SumMin {
    public static void main(String[] args) {
        int A = 3;
        int B = 8;

        int sum = 0;
        int min = A % 2 != 0 ? A : A + 1;

        for (int i = min; i < B; i += 2) {
            sum += i;
        }

        System.out.println("Сумма всех чисел между A и B: " + sum);

        System.out.println("Все нечетные значения между A и B:");
        for (int i = A % 2 != 0 ? A : A + 1; i < B; i += 2) {
            System.out.println(i);
        }
    }
}
