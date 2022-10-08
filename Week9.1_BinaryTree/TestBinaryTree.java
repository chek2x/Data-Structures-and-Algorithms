/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class TestBinaryTree {
    public static void main(String[] args) {
        Ownership.Introduction();

        BinaryTree tree = new BinaryTree();
        System.out.println("---Before Adding Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());

        tree.addNode(12);
        tree.addNode(40);
        tree.addNode(50);
        System.out.println("---After Adding 3 Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());

        tree.addNode(25);
        tree.addNode(30);
        tree.addNode(10);
        System.out.println("---After Adding a few more Nodes---");
        System.out.println("Empty\t\t: " + tree.isEmpty());
        System.out.println("Number of Nodes\t: " + tree.count());
        System.out.println("Level Order\t: " + tree.printLevelOrder());
    }
}
