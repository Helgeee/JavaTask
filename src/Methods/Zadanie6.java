package Methods;

public class Zadanie6 {
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;

        int[][] array = createArray(rows, columns);
        fillArray(array);
        printArray(array);
    }

    public static int[][] createArray(int rows, int columns) {
        return new int[rows][columns];
    }

    public static void fillArray(int[][] array) {
        int value = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = value;
                value++;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
