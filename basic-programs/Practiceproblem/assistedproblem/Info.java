import java.util.Scanner;

public class info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollno = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        char result = 'P';

        System.out.println("\nStudent Information");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Percentage: " + percentage);
        System.out.println("Result: " + result);

        sc.close();
    }
}