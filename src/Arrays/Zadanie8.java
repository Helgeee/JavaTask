package Arrays;

public class Zadanie8 {
    public static void main(String[] args) {
        int[] M = new int[100];
        int count = 0;


        for (int i = 0; i < M.length; i++) {
            M[i] = (int) (Math.random() * 200);
        }


        for (int i = 0; i < M.length; i++) {
            if (M[i] > 0 && M[i] < 125) {
                count++;
            }
        }

        System.out.println("Количество элементов, удовлетворяющих условию 0 < M[i] <125: " + count);
    }
}
