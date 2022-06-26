package DataTypesExercises;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// program that prints the current time in GMT
public class Exercise5 {
    public static void main(String[] args) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

        Scanner input = new Scanner(System.in);
        System.out.println("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = ((totalHours + timeZoneChange) % 24);

        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
