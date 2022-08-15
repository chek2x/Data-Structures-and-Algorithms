import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestWaterTank {
    public static void main(String[] args) {
        String menu[] = { "Add Water", "Remove Water", "Clear tank", "Setup Tank", "End" };
        String choice = "", name = "", color = "", brand = "";
        double amount = 0.00, capacity = 0.00;
        JOptionPane j = new JOptionPane();
        WaterTank tank = new WaterTank("Sadie Sink", 1000);
        String hold = "";
        do {
            hold = "Name\t: " + tank.getName() + "\tBrand\t: " + tank.getBrand() + "\nColor\t: " + tank.getColor()
                    + "\tCapacity\t: " + tank.getCapacity() + "\nRemaining\t: " + tank.remainingCapacity()
                    + "\tWater Level\t: " + tank.getCurrentWater() + "\nEmpty\t: " + tank.isEmpty() + "\tFull\t: "
                    + tank.isFull() + "\nSelect";
            choice = j.showInputDialog(null, new JTextArea(hold), "Menu", 1, null, menu, menu[0]).toString();
            switch (choice) {
                case "Add Water":
                    if (tank.isFull()) {
                        j.showMessageDialog(null, "Tank is full", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        amount = Double.parseDouble(j.showInputDialog("Amount (L:"));
                        tank.addWater(amount);
                        j.showMessageDialog(null, amount + "L is added to tank.");
                    }
                    break;
                case "Remove Water":
                    if (tank.isEmpty()) {
                        j.showMessageDialog(null, "Tank is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        amount = Double.parseDouble(j.showInputDialog("Amount (L):"));
                        tank.removeWater(amount);
                        j.showMessageDialog(null, amount + "L is removed from the tank.");
                    }
                    break;
                case "Clear tank":
                    j.showMessageDialog(null, "Tank is empty. Wastage\t: " + tank.clearWater());
                    break;
                case "Setup Tank":
                    name = j.showInputDialog("Name: ");
                    brand = j.showInputDialog("Brand: ");
                    color = j.showInputDialog("Color: ");
                    capacity = Double.parseDouble(j.showInputDialog("Change Capacity:"));

                    tank.setName(name);
                    tank.setBrand(brand);
                    tank.setColor(color);
                    tank.setCapacity(capacity);
                    j.showMessageDialog(null, "Tank has been updated.");

                    break;
                case "End":
            } // end of switch
        } while (!choice.equals("End"));
    }// end of main
}// end of class
