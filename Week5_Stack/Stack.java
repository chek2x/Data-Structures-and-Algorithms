/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class Stack {
    private int num[], top, capacity;
    private String found;

    public Stack() {
        top = -1;
        setCapacity(5);
        found = "";
    }

    public Stack(int capacity) {
        top = -1;
        setCapacity(capacity);
        found = "";
    }

    public void setCapacity(int capacity) {
        top = -1;
        this.capacity = capacity;
        num = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int top() {
        return top;
    }

    public int atTop() {
        return num[top];
    }

    public int size() {
        return top + 1;
    }

    public int count() {
        return top + 1;
    }

    public boolean isEmpty() {
        return (top <= -1);
    }

    public boolean isFull() {
        return (top >= (capacity - 1));
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        } else {
            return num[top];
        }
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        } else {
            return num[0];
        }
    }

    public void push(int data) {
        top++;
        num[top] = data;
    }

    public int pop() {
        int val = num[top];
        top--;
        return val;
    }

    public String display() {
        String hold = "";
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Stack is empty";
        }

        return hold;
    }

    public String elements() {
        String hold = "";
        if (!isEmpty()) {
            for (int i = 0; i <= top; i++) {
                hold += num[i] + " ";
            }
        } else {
            hold = "Stack is empty";
        }

        return hold;
    }

    public int last() {
        if (isEmpty()) {
            return -1;
        } else {
            return num[top];
        }
    }

    public boolean contains(int data) {
        for (int i = 0; i <= top; i++) {
            if (data == num[i]) {
                return true;
            }
        }
        return false;
    }

    public boolean search(int data) {
        for (int i = 0; i <= top; i++) {
            if (data == num[i]) {
                found = data + " is at position " + (i + 1) + ".";
                return true;
            }
        }
        found = data + " not found.";
        return false;
    }

    public String clear() {
        top = -1;
        num = new int[capacity];
        return "Stack is now empty.";
    }

    public String empty() {
        if (isEmpty()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String full() {
        if (isFull()) {
            return "Yes";
        } else {
            return "No";
        }
    }

    public String getFound() {
        return found;
    }
}
