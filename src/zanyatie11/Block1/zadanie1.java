//Робот может перемещаться в четырех направлениях («11» —
//        север, «12» — запад, «13» — юг, «14» — восток) и принимать три
//        цифровые команды: 0 — продолжать движение, 1 — поворот
//        налево, –1 — поворот направо. Дан число (11, 12, 13 или 14) —
//        исходное направление робота и целое число N (0, 1 или -1) —
//        посланная ему команда. Вывести направление робота после
//        выполнения полученной команды (то есть север, запад, юг или
//        восток).


package zanyatie11.Block1;

public class zadanie1 {

    public static void main(String[] args) {
        int initialDirection = 11; // исходное направление робота
        int command = 1; // команда для робота

        int newDirection = calculateNewDirection(initialDirection, command);
        String directionName = getDirectionName(newDirection);

        System.out.println("Направление робота после выполнения команды: " + directionName);
    }

    public static int calculateNewDirection(int initialDirection, int command) {
        int newDirection = initialDirection;

        if (command == 1) { // поворот налево
            newDirection -= 1;
            if (newDirection < 11) {
                newDirection = 14;
            }
        } else if (command == -1) { // поворот направо
            newDirection += 1;
            if (newDirection > 14) {
                newDirection = 11;
            }
        }

        return newDirection;
    }

    public static String getDirectionName(int direction) {
        String directionName = "";

        switch (direction) {
            case 11:
                directionName = "север";
                break;
            case 12:
                directionName = "запад";
                break;
            case 13:
                directionName = "юг";
                break;
            case 14:
                directionName = "восток";
                break;
        }

        return directionName;
    }
}
