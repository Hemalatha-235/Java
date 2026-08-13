
import java.util.Scanner;

class MarksCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks of subject " + i + ": ");
            int marks = sc.nextInt();
            total = total + marks;
        }

        double average = (double) total / 5;

        System.out.println("Total Marks = " + total);
        System.out.println("Average Marks = " + average);
    }
}
