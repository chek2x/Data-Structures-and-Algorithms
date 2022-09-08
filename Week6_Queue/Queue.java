
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import javax.swing.JOptionPane;

public class Queue {
    private int num[];
    private int front, rear, capacity;

    public Queue() {
        capacity = 5;
        num = new int[capacity];
        front = rear = -1;
    }

    public Queue(int capacity) {
        this.capacity = capacity;
        num = new int[capacity];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return rear <= -1;
    }

    public boolean isFull() {
        return rear >= capacity - 1;
    }

    private void errorMessage(String msg) {
        JOptionPane.showMessageDialog(null, msg, "Full", JOptionPane.ERROR_MESSAGE);
    }

    public void enqueue(int data) {
        if (isFull()) {
            errorMessage("Queue is Full!");
        } else {
            num[++rear] = data;
            front = 0;
        }
    }

    public int dequeue() {
        int val = 0;
        if (isEmpty()) {
            errorMessage("Queue is empty!");
            front = -1;
        } else {
            val = num[front];

            for (int i = 0; i < rear; i++) {
                num[i] = num[i + 1];
            }

            rear--;
        }

        return val;
    }

    public String display() {
        String hold = "";

        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }

        return hold;
    }

    public String display2() {
        String hold = "head<-";

        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }

        return hold + "<-rear";
    }

    public String display3() {
        String hold = "rear->";
        if (!isEmpty()) {
            for (int i = front; i <= rear; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Queue is empty";
        }

        return hold + "->head";
    }
}
