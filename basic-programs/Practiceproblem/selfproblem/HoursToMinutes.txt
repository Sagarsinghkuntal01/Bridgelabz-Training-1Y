import java.util.Scanner;

public class HoursToMinutes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours: ");
        int hours = sc.nextInt();

        int minutes = hours * 60;

        System.out.println("Minutes = " + minutes);
    }
}
