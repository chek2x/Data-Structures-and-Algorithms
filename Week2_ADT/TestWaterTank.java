import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestWaterTank {
    public static void main(String[] args) {
        String menu[] = { "Add Water", "Remove Water", "Clear tank", "Setup Tank", "End" };
        String choice = "", name = "", color = "", brand = "";
        double amount = 0.00, capacity = 0.00;
        WaterTank tank = new WaterTank("Sadie Sink", 1000);
        String hold = "";

        do {
            hold = "Name\t: " + tank.getName() + "\tBrand\t: " + tank.getBrand() + "\nColor\t: " + tank.getColor()
                    + "\tCapacity\t: " + tank.getCapacity() + "\nRemaining\t: " + tank.remainingCapacity()
                    + "\tWater Level\t: " + tank.getCurrentWater() + "\nEmpty\t: " + tank.isEmpty() + "\tFull\t: "
                    + tank.isFull() + "\nSelect";
            choice = JOptionPane.showInputDialog(null, new JTextArea(hold), "Menu", 1, null, menu, menu[0]).toString();

            switch (choice) {
                case "Add Water":
                    if (tank.isFull()) {
                        JOptionPane.showMessageDialog(null, "Tank is full", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Amount (L:"));
                        if (amount < 0) {
                            JOptionPane.showMessageDialog(null, "Cannot accept negative value", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        } else if (amount > tank.remainingCapacity()) {
                            int result = JOptionPane.showConfirmDialog(null,
                                    "Value to be added is more than space remaining. Continue?", "Confirm",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            switch (result) {
                                case 0:
                                    JOptionPane.showMessageDialog(null,
                                            tank.remainingCapacity() + " was added to the tank. "
                                                    + (amount - tank.remainingCapacity()) + " was spilt.",
                                            "Add Water", JOptionPane.INFORMATION_MESSAGE);
                                    tank.addWater(tank.remainingCapacity());
                                case 1:
                                    break;
                            }
                        } else {
                            tank.addWater(amount);
                            JOptionPane.showMessageDialog(null, amount + "L is added to tank.");
                        }
                    }
                    break;

                case "Remove Water":
                    if (tank.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Tank is empty", "Error", JOptionPane.ERROR_MESSAGE);
                    } else {
                        amount = Double.parseDouble(JOptionPane.showInputDialog("Amount (L):"));
                        if (amount < 0) {
                            JOptionPane.showMessageDialog(null, "Cannot accept negative value", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                            break;
                        } else if (amount > tank.getCurrentWater()) {
                            int result = JOptionPane.showConfirmDialog(null,
                                    "Value to be removed is more than current water in tank. Continue?", "Confirm",
                                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                            switch (result) {
                                case 0:
                                    JOptionPane.showMessageDialog(null,
                                            tank.clearWater() + " was removed from the tank.",
                                            "Remove Water", JOptionPane.INFORMATION_MESSAGE);
                                case 1:
                                    break;
                            }
                        } else {
                            tank.removeWater(amount);
                            JOptionPane.showMessageDialog(null, amount + "L is removed from the tank.");
                        }
                    }
                    break;

                case "Clear tank":
                    JOptionPane.showMessageDialog(null, "Tank is empty. Wastage\t: " + tank.clearWater());
                    break;

                case "Setup Tank":
                    if (!tank.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Tank not empty. Cannot change capacity.", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    } else {
                        name = JOptionPane.showInputDialog("Name: ");
                        brand = JOptionPane.showInputDialog("Brand: ");
                        color = JOptionPane.showInputDialog("Color: ");
                        capacity = Double.parseDouble(JOptionPane.showInputDialog("Change Capacity:"));

                        tank.setName(name);
                        tank.setBrand(brand);
                        tank.setColor(color);
                        tank.setCapacity(capacity);
                        JOptionPane.showMessageDialog(null, "Tank has been updated.");
                    }
                    break;

                case "End":
            } // end of switch
        } while (!choice.equals("End"));
    }// end of main
}
// end of class
