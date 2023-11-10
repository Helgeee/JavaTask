package Arrays;

//Задан массив действительных чисел размерности 10х10. Найти суммы элементов
//        каждой строки, произведения элементов каждого столбца, и максимальный элемент
//        главной диагонали (подсказка: все элементы, для которых номер строки совпадает с
//        номером столбца).
public class Zadanie4 {
    public static void main(String[] args) {
        double[][] array = new double[10][10];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = Math.random() * 100;
            }
        }


        for (int i = 0; i < 10; i++) {
            double sumRow = 0;
            for (int j = 0; j < 10; j++) {
                sumRow += array[i][j];
            }
            System.out.println("Сумма элементов в " + (i + 1) + " строке: " + sumRow);
        }


        for (int i = 0; i < 10; i++) {
            double productColumn = 1;
            for (int j = 0; j < 10; j++) {
                productColumn *= array[j][i];
            }
            System.out.println("Произведение элементов в " + (i + 1) + " столбце: " + productColumn);
        }


        double maxDiagonalElement = array[0][0];
        for (int i = 0; i < 10; i++) {
            if (array[i][i] > maxDiagonalElement) {
                maxDiagonalElement = array[i][i];
            }
        }
        System.out.println("Максимальный элемент на главной диагонали: " + maxDiagonalElement);
    }
}
