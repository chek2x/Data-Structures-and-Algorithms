/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class TestBinaryTree {
    public static void main(String[] args) {
        Ownership.Introduction();

        BinaryTree tree = new BinaryTree();
        System.out.println("Empty\t: " + tree.isEmpty());

        tree.add(node, 12);
        tree.add(node, 40);
        tree.add(node, 50);

        System.out.println("Empty\t: " + tree.isEmpty());

        Node node = new Node();
        node = tree.getRoot();

        System.out.println("Level Order\t: " + tree.printLevelOrder(node));
    }
}
