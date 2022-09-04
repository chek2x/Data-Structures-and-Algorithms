/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class Stack {
    private int num[], top, capacity;
    public String found;

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
        if (!isEmpty()) {
            System.err.println("Stack has values at current");
        } else {
            top = -1;
            this.capacity = capacity;
            num = new int[capacity];
        }
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

    public boolean isEmpty() {
        return (top <= -1);
    }

    public boolean isFull() {
        return (top >= (capacity - 1));
    }

    public int peek() {
        if (isEmpty()) {
            System.err.print("Stack is empty");
            return -1;
        } else {
            return num[top];
        }
    }

    public int first() {
        if (isEmpty()) {
            System.err.println("Stack is empty");
            return -1;
        } else {
            return num[0];
        }
    }

    public void push(int data) {
        if (isFull()) {
            System.err.println("Stack is full");
        } else {
            top++;
            num[top] = data;
        }
    }

    public int pop() {
        int val = 0;

        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            val = num[top];
            top--;
        }
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

    public int last() {
        if (isEmpty()) {
            System.err.print("Stack is empty");
            return -1;
        } else {
            return num[top];
        }
    }

    public boolean search(int data) {
        for (int i = 0; i <= top + 1; i++) {
            if (data == num[i]) {
                found = data + " is at position " + (i + 1);
                return true;
            }
        }
        return false;
    }

    public void clear() {
        top = -1;
        num = new int[capacity];
        System.out.println("Stack is now empty");
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
}
