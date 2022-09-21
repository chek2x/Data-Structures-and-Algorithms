public class TestLNode {
    public static void main(String args[]) {
        LNode node = new LNode();

        node.addAtFirst(12);
        node.addAtFirst(45);
        node.addAtFirst(7);
        // node.addAtFirst(90);
        // node.addAtLast(5); //good
        node.addInMiddle(2);
        System.out.println(node.indexAt(45));
        // node.deleteAtLast();//good
        // node.deleteAtPosition(1);//goood

        // System.out.println(node.getFirst()); //good
        // System.out.println(node.getLast()); //good
        // System.out.println(node.getAtPosition(2)); //good
        System.out.println(node.traverse());
    }
}