/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class Node {
    private Node left, right;
    private int data;

    public Node() {
        left = right = null;
        data = 0;
    }

    public Node(int data) {
        left = right = null;
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }
}
