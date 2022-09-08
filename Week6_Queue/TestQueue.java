/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class TestQueue {
    public static void main(String[] args) {

        Queue q = new Queue(7);
        System.out.println("Empty\t: " + q.isEmpty());
        System.out.println("Full\t: " + q.isFull());

        q.enqueue(4);
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(20);

        System.out.println("Waiting on Queue\t: ");
        System.out.println(q.display2());

        System.out.print("Now serving\t: " + q.dequeue());

        System.out.println("Waiting on Queue\t: ");
        System.out.println(q.display2());

        System.out.println("Empty\t: " + q.isEmpty());
        System.out.println("Full\t: " + q.isFull());
    }
}
