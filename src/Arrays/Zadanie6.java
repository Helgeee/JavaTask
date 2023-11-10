package Arrays;
import java.util.Arrays;

public class Zadanie6 {
        public static void main(String[] args) {
            int[] originalArray = {3, 7, 12, 8, 5, 20, 10, 15};

            int evenCount = 0;
            int oddCount = 0;

            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }

            int[] evenArray = new int[evenCount];
            int[] oddArray = new int[oddCount];

            int evenIndex = 0;
            int oddIndex = 0;

            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] % 2 == 0) {
                    evenArray[evenIndex] = originalArray[i];
                    evenIndex++;
                } else {
                    oddArray[oddIndex] = originalArray[i];
                    oddIndex++;
                }
            }

            Arrays.sort(evenArray);
            Arrays.sort(oddArray);

            System.out.println("Отсортированный массив четных чисел: " + Arrays.toString(evenArray));
            System.out.println("Отсортированный массив нечетных чисел: " + Arrays.toString(oddArray));
        }
}

