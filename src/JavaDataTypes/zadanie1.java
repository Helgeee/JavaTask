package JavaDataTypes;

public class zadanie1 {
    public static void main(String[] args) {
        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;
        System.out.println("x += y - x++ * z = " + x);

        z = --x - y * 5;
        System.out.println("z = --x - y * 5 = " + z);

        y /= x + 5 % z;
        System.out.println("y /= x + 5 % z = " + y);

        z = x++ + y * 5;
        System.out.println("z = x++ + y * 5 = " + z);

        x = y - x++ * z;
        System.out.println("x = y - x++ * z = " + x);
    }
}


