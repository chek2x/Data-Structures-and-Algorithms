
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class DevelopmentalTask {
    public static void main(String[] args) {
        Ownership.Introduction();

        JFrame main = new JFrame();
        int age = Integer.parseInt(JOptionPane.showInputDialog(main, "Enter age:", "Developmental Task", 1));
        JOptionPane.showMessageDialog(main, developmentalTaskOutput(age), "Developmental Task", 1);
        System.exit(0);
    }

    private static String developmentalTaskOutput(int age) {
        if (0 <= age && age <= 5) {
            return "Infancy and Early Childhood";
        } else if (6 <= age && age <= 12) {
            return "Middle Childhood";
        } else if (13 <= age && age <= 17) {
            return "Adolescence";
        } else if (18 <= age && age <= 35) {
            return "Early Adulthood";
        } else if (36 <= age && age <= 60) {
            return "Middle Age";
        } else if (age > 60) {
            return "Later Maturity";
        } else {
            return "Error. Invalid Number.";
        }
    } // End of developmentaltalTask()
}