
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestQueue {
    public static void main(String[] args) {
        Ownership.Introduction();

        String menu[] = { "Enqueue", "Dequeue", "Exit" };
        String option = "", status = "";
        Queue q = new Queue(10);
        int data = 0;

        try {
            do {
                status = "\nEmpty\t: " + q.isEmpty() + "\tFull\t: " + q.isFull() +
                        "\nCapacity\t: " + q.getCapacity() + "\tCurrent Size\t: " + q.size() +
                        "\nPeek\t: " + q.peek() + "\tLast\t: " + q.last() +
                        "\nElements\t: " + q.display();

                option = JOptionPane
                        .showInputDialog(null, new JTextArea(status + "\nSelect "), "Menu", 1, null, menu, menu[0])
                        .toString();
                switch (option) {
                    case "Enqueue":
                        if (!q.isFull()) {
                            try {
                                String input = JOptionPane.showInputDialog("Add to queue: ");
                                if (input == null) {
                                    break;
                                }

                                data = Integer.parseInt(input);
                            } catch (NumberFormatException e) {
                                JOptionPane.showMessageDialog(null, "That is not a valid input.");
                                break;
                            }

                            q.enqueue(data);
                            JOptionPane.showMessageDialog(null, data + " is inserted successfully to the queue.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Queue is full.");
                        }
                        break;

                    case "Dequeue":
                        if (!q.isEmpty()) {
                            JOptionPane.showMessageDialog(null,
                                    q.dequeue() + " is removed successfully from the queue.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Queue is empty.");
                        }
                        break;
                }
            } while (!option.equals("Exit"));
        } catch (NullPointerException e) {
            System.exit(0);
        }
    }
}
