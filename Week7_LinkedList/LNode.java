/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

public class LNode {
    private Object data;
    private LNode head, next;
    String hold = "";

    public LNode() {
        head = next = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtFirst(Object data) {
        LNode newNode = new LNode();
        if (isEmpty()) {
            newNode.data = data;
            newNode.next = null;
            head = newNode;
        } else {
            newNode.data = data;
            newNode.next = head;
            head = newNode;
        }
    }

    public String traverse() {
        String hold = " ";
        LNode link = head;
        if (isEmpty()) {
            hold = "List is Empty.";
        } else {
            while (link != null) {
                hold += link.data + "->";
                link = link.next;
            }
        }
        return "head-> " + hold + " " + link;
    }

    public void addAtLast(Object data) {
        if (isEmpty()) {
            addAtFirst(data);
        } else {
            LNode visit = head;
            while (visit.next != null) {
                visit = visit.next;
            }
            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = null;
            visit.next = newNode;
        }
    }

    public void addAtPosition(Object data, int position) {
        if (isEmpty()) {
            addAtFirst(data);
        } else if (position == 1) {
            addAtFirst(data);
        } else if (position > currentSize()) {
            addAtLast(data);
        } else if (position <= 0 || position > currentSize()) {
            System.out.println("Position is NOT valid.");
        } else {
            LNode visit, link;
            visit = link = head;
            int ctr = 1;
            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public void addInMiddle(Object data) {
        int position = 0;

        if (currentSize() % 2 == 0) {
            position = (currentSize() / 2) + 1;
        } else if (currentSize() % 2 == 1) {
            position = (currentSize() / 2) + 2;
        }

        if (isEmpty()) {
            addAtFirst(data);
        } else if (position == 1) {
            addAtFirst(data);
        } else if (position > currentSize()) {
            addAtLast(data);
        } else if (position <= 0 || position > currentSize()) {
            System.out.println("Position is NOT valid.");
        } else {
            LNode visit, link;
            visit = link = head;
            int ctr = 1;
            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            LNode newNode = new LNode();
            newNode.data = data;
            newNode.next = visit;
            link.next = newNode;
        }
    }

    public int currentSize() {
        int counter = 1;
        if (isEmpty()) {
            counter = 0;
        } else {
            LNode visit = head;
            while (visit.next != null) {
                visit = visit.next;
                counter++;
            }
        }
        return counter;
    }

    public String deleteAtFirst() {
        if (isEmpty()) {
            return ("List is empty.");
        } else {
            LNode link = head;
            head = link.next;
            return ("First node was deleted successfully.");
        }
    }

    public String deleteAtLast() {
        if (isEmpty()) {
            return ("List is empty.");
        } else {
            LNode link, visit;
            link = visit = head;

            while (visit.next != null) {
                visit = visit.next;
            }

            while (link.next != visit) {
                link = link.next;
            }

            link.next = null;
            return ("Last node was deleted successfully.");
        }
    }

    public void deleteAtPosition(int position) {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (position == 1) {
            deleteAtFirst();
        } else if (position <= 0 || position > currentSize() + 1) {
            System.out.println(position + " is NOT valid.");
        } else {
            LNode visit, link, pointer;
            visit = link = pointer = head;

            int ctr = 1;

            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            ctr = 1;
            while (ctr != position + 1) {
                pointer = pointer.next;
                ctr++;
            }

            link.next = pointer;
        }
    }

    public void deleteInMiddle() {
        int position = 0;
        if (currentSize() % 2 == 0) {
            position = (currentSize() / 2);
        } else if (currentSize() % 2 == 1) {
            position = (currentSize() / 2) + 1;
        }

        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (position == 1) {
            deleteAtFirst();
        } else if (position <= 0 || position > currentSize() + 1) {
            System.out.println(position + " is NOT valid.");
        } else {
            LNode visit, link, pointer;
            visit = link = pointer = head;

            int ctr = 1;

            while (ctr != position) {
                visit = visit.next;
                ctr++;
            }

            while (link.next != visit) {
                link = link.next;
            }

            ctr = 1;
            while (ctr != position + 1) {
                pointer = pointer.next;
                ctr++;
            }

            link.next = pointer;
        }
    }

    public boolean contains(Object data) {
        boolean found = false;
        if (!isEmpty()) {
            LNode link = head;

            while (link != null) {
                if (link.data == data) {
                    found = true;
                    break;
                } else {
                    link = link.next;
                }
            }
        }

        return found;
    }

    public String indexAt(Object data) {
        int ctr = 1;
        if (isEmpty()) {
            return "List is empty.";
        } else {
            LNode link = head;

            while (link != null) {
                if (link.data.equals(data)) {
                    return data + " is found in position " + ctr + ".";
                } else {
                    link = link.next;
                    ctr++;
                }
            }

            return data + " is not found.";
        }
    }

    public String getFirst() {
        if (isEmpty()) {
            return "List is empty";
        } else {
            return "The first element is " + (Object) head.data + ".";
        }
    }

    public String getLast() {
        if (isEmpty()) {
            return "List is empty";
        }
        LNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return "The last element is " + (Object) temp.data + ".";
    }

    public String getAtPosition(int position) {
        if (isEmpty()) {
            return ("List is empty.");
        } else if (position <= 0 || position > currentSize()) {
            return ("Invalid position.");
        } else {
            LNode temp = head;
            int ctr = 1;
            while (ctr != position) {
                temp = temp.next;
                ctr++;
            }
            return "Position " + position + " contains " + (Object) temp.data + ".";
        }
    }

    public String deleteValue(Object data) {
        int pos = 1;
        LNode link = head;

        if (isEmpty()) {
            return "List is empty.";
        } else {
            while (link != null) {
                if (link.data.equals(data)) {
                    deleteAtPosition(pos);
                    return data + " successfully deleted.";
                } else {
                    link = link.next;
                    pos++;
                }
            }
            return data + " is not found.";
        }
    }
}
