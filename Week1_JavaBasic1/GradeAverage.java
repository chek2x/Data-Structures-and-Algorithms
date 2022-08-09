import java.util.Scanner;

public class GradeAverage {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);

        System.out.print("English\t: ");
        double english = input.nextInt();
        System.out.print("Math\t: ");
        double math = input.nextInt();
        System.out.print("Science\t: ");
        double science = input.nextInt();
        input.close();

        double average = ((english + math + science) / 3);
        System.out.println("Average\t: " + average + "\n");
    }
}
