
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import javax.swing.*;
import java.awt.*;

public class LNodeMenu2 {
    public static void main(String[] args) {
        Ownership.Introduction();

        String menu[] = { "Add At First", "Add At Position", "Add In Middle", "Add At Last", "Delete At First",
                "Delete At Position", "Delete In Middle",
                "Delete Value",
                "Delete At Last", "Get First", "Get At Position", "Get Last", "Search", "Edit", "Exit" };
        String option = "", all = "";
        int inputVal, inputPos;
        LNode myNode = new LNode();
        JPanel valueOnly = new JPanel();
        JPanel positionOnly = new JPanel();
        GridBagConstraints a = new GridBagConstraints();
        GridBagConstraints b = new GridBagConstraints();

        a.gridx = 0;
        a.gridy = 0;
        a.weightx = 0;
        b.fill = GridBagConstraints.HORIZONTAL;
        b.gridx = 1;
        b.gridy = 0;
        b.gridwidth = 2;
        b.weightx = 0.5;

        JLabel valtxt = new JLabel("Value: ");
        JLabel postxt = new JLabel("Position: ");
        JTextField value = new JTextField();
        JTextField position = new JTextField();

        valueOnly.setLayout(new GridBagLayout());
        valueOnly.add(valtxt, a);
        valueOnly.add(value, b);

        positionOnly.setLayout(new GridBagLayout());
        positionOnly.add(postxt, a);
        positionOnly.add(position, b);

        try {
            do {
                all = "\nEmpty\t: " + myNode.isEmpty() + "\tCapacity\t: " + myNode.currentSize() + "\nElements\t: "
                        + myNode.traverse();

                option = JOptionPane
                        .showInputDialog(null, new JTextArea(all + "\nSelect"), "Menu", 1, null, menu, menu[0])
                        .toString();
                switch (option) {
                    case "Add At First":
                        try {
                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());
                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (myNode.contains(inputVal)) {
                                JOptionPane.showMessageDialog(null, "Element already exists.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            myNode.addAtFirst(inputVal);
                            JOptionPane.showMessageDialog(null, "Element added to first.", option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        break;

                    case "Add At Position":
                        try {
                            if (myNode.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                        "List is empty. Value will be added to the first position.", option,
                                        JOptionPane.INFORMATION_MESSAGE);
                            }

                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());

                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (myNode.contains(inputVal)) {
                                JOptionPane.showMessageDialog(null, "Element already exists.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            JOptionPane.showConfirmDialog(null, positionOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputPos = Integer.parseInt(position.getText());

                            if (position.getText() == null || position.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (Integer.parseInt(position.getText()) > myNode.currentSize()) {
                                JOptionPane.showMessageDialog(null,
                                        "Position entered is more than current size. Value will be added to the last position.",
                                        option, JOptionPane.INFORMATION_MESSAGE);
                            }

                            myNode.addAtPosition(inputVal, inputPos);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        position.setText("");
                        break;

                    case "Add In Middle":
                        try {
                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());
                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (myNode.contains(inputVal)) {
                                JOptionPane.showMessageDialog(null, "Element already exists.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            myNode.addInMiddle(inputVal);
                            JOptionPane.showMessageDialog(null, "Element added to first.", option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        break;

                    case "Add At Last":
                        try {
                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());

                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (myNode.contains(inputVal)) {
                                JOptionPane.showMessageDialog(null, "Element already exists.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            myNode.addAtLast(inputVal);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        position.setText("");
                        break;

                    case "Delete At First":
                        if (myNode.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "List is empty.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            myNode.deleteAtFirst();
                            JOptionPane.showMessageDialog(null, "First element was removed.", option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Delete At Position":
                        try {
                            if (myNode.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                        "List is empty.", option,
                                        JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }

                            JOptionPane.showConfirmDialog(null, positionOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputPos = Integer.parseInt(position.getText());

                            if (position.getText() == null || position.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (Integer.parseInt(position.getText()) > myNode.currentSize()) {
                                JOptionPane.showMessageDialog(null,
                                        "Invalid position.",
                                        option, JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }

                            myNode.deleteAtPosition(inputPos);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        position.setText("");
                        break;

                    case "Delete In Middle":
                        break;

                    case "Delete At Last":
                        if (myNode.isEmpty()) {
                            JOptionPane.showMessageDialog(null, "List is empty.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            myNode.deleteAtLast();
                            JOptionPane.showMessageDialog(null, "Last element was removed.", option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;

                    case "Get First":
                        JOptionPane.showMessageDialog(null, myNode.getFirst(), option, JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case "Get At Position":
                        try {
                            JOptionPane.showConfirmDialog(null, positionOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputPos = Integer.parseInt(position.getText());

                            if (position.getText() == null || position.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (Integer.parseInt(position.getText()) > myNode.currentSize()) {
                                JOptionPane.showMessageDialog(null,
                                        "Invalid position.",
                                        option, JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }

                            JOptionPane.showMessageDialog(null, myNode.getAtPosition(inputPos), option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        position.setText("");
                        break;

                    case "Get Last":
                        JOptionPane.showMessageDialog(null, myNode.getLast(), option, JOptionPane.INFORMATION_MESSAGE);
                        break;

                    case "Search":
                        try {
                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.INFORMATION_MESSAGE);

                            inputVal = Integer.parseInt(value.getText());

                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            JOptionPane.showMessageDialog(null, myNode.indexAt(inputVal), option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        break;

                    case "Edit":
                        try {
                            if (myNode.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                        "List is empty. Value will be added to the first position.", option,
                                        JOptionPane.INFORMATION_MESSAGE);
                            }

                            JOptionPane.showConfirmDialog(null, positionOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputPos = Integer.parseInt(position.getText());

                            if (position.getText() == null || position.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (Integer.parseInt(position.getText()) > myNode.currentSize()) {
                                JOptionPane.showMessageDialog(null,
                                        "Invalid position.",
                                        option, JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }

                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());

                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (myNode.contains(inputVal)) {
                                JOptionPane.showMessageDialog(null, "Element already exists.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            myNode.deleteAtPosition(inputPos);
                            myNode.addAtPosition(inputVal, inputPos);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        position.setText("");
                        break;

                    case "Delete Value":
                        try {
                            if (myNode.isEmpty()) {
                                JOptionPane.showMessageDialog(null,
                                        "List is empty.", option,
                                        JOptionPane.INFORMATION_MESSAGE);
                                break;
                            }

                            JOptionPane.showConfirmDialog(null, valueOnly, option, JOptionPane.OK_CANCEL_OPTION);

                            inputVal = Integer.parseInt(value.getText());

                            if (value.getText() == null || value.getText() == "") {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            } else if (inputVal <= 0) {
                                JOptionPane.showMessageDialog(null, "Invalid input.", "Error",
                                        JOptionPane.ERROR_MESSAGE);
                                break;
                            }

                            JOptionPane.showMessageDialog(null, myNode.deleteValue(inputVal), option,
                                    JOptionPane.INFORMATION_MESSAGE);
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                        value.setText("");
                        break;

                }
            } while (!option.equals("Exit"));
        } catch (NullPointerException e) {
            System.exit(0);
        }
    }
}
