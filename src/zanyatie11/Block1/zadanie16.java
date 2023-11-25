package zanyatie11.Block1;


public class zadanie16 {
    public static double findClockAngle(int hours, int minutes) {

        if (hours < 0 || hours > 12 || minutes < 0 || minutes > 59) {
            throw new IllegalArgumentException("Некорректные данные");
        }


        double hourAngle = (hours * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minuteAngle);
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }

    public static void main(String[] args) {
        int hours = 9;
        int minutes = 45;
        double angle = findClockAngle(hours, minutes);
        System.out.println("Угол  " + angle + " градусов");
    }
}

