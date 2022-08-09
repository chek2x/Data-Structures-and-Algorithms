
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FlashDrive {
    public static void main(String[] args) {
        Ownership.Introduction();

        JFrame main = new JFrame();
        int drives = Integer.parseInt(JOptionPane.showInputDialog(main, "Enter amount of Flash Drives:"));
        JOptionPane.showMessageDialog(main, flashDriveOutput(drives));
        System.exit(0);
    }

    private static String flashDriveOutput(int flashDrives) {
        int gross = flashDrives / 144;
        int grossLeft = flashDrives % 144;
        int dozen = grossLeft / 12;
        int extra = grossLeft % 12;

        return ("Hi Mr. Lee, you have " + gross + " gross, " + dozen + " dozens, and " + extra
                + " extra flash drives.\n");
    }
}
