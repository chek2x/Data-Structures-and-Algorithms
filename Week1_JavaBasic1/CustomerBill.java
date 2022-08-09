import java.util.Scanner;

public class CustomerBill {
    public static void main(String[] args) {
        Ownership.Introduction();

        Scanner input = new Scanner(System.in);

        System.out.print("Phone Model\t: ");
        input.nextLine();
        System.out.print("Phone Color\t: ");
        input.nextLine();
        System.out.print("Price\t\t: ");
        double price = input.nextDouble();
        System.out.print("Quantity\t: ");
        int quantity = input.nextInt();

        double grossTotal = price * quantity;
        double vat = grossTotal * 0.038;
        double netTotal = grossTotal + vat;

        System.out.println("\nGross Total\t: " + grossTotal);
        System.out.println("VAT (3.8%)\t: " + vat);
        System.out.println("Net Total\t: " + netTotal + "\n");

        System.out.print("Payment Received: ");
        double payment = input.nextDouble();
        System.out.println("Change\t\t: " + (payment - netTotal) + "\n");

        input.close();
    }
}
