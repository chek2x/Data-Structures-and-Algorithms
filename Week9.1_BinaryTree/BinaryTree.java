
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public Node getRoot() {
        return root;
    }

    public void addNode(int data) {
        root = add(root, data);
    }

    private Node add(Node node, int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                node = q.peek();
                q.remove();
                if (node.getLeft() == null) {
                    node.setLeft(new Node(data));
                    break;
                } else {
                    q.add(node.getLeft());
                }

                if (node.getRight() == null) {
                    node.setRight(new Node(data));
                    break;
                } else {
                    q.add(node.getRight());
                }
            }
        }
        return root;
    }

    public String printLevelOrder() {
        return printLevelOrder(root);
    }

    private String printLevelOrder(Node node) {
        String hold = "";
        if (isEmpty()) {
            hold = "Tree is empty";
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                Node newNode = q.poll();
                hold += newNode.getData() + " ";
                if (newNode.getLeft() != null) {
                    q.add(newNode.getLeft());
                }
                if (newNode.getRight() != null) {
                    q.add(newNode.getRight());
                }
            }
        }
        return hold;
    }

    public int count() {
        return count(root);
    }

    private int count(Node node) {
        if (node == null) {
            return 0;
        } else {
            int ctr = 1;
            ctr += count(node.getLeft());
            ctr += count(node.getRight());
            return ctr;
        }
    }
}
