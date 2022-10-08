
/**
 * @author Lorenzo, Zazheska D.
 * @param CCIS - CS 2nd Year
 * @param A221 - Data Structures and Algorithms (Paired)
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
    private Node root;
    private String hold;

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
        return levelOrder(root);
    }

    private String levelOrder(Node node) {
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

    public String printInOrder() {
        return inOrder(root);
    }

    private String inOrder(Node node) {
        String hold = "";
        if (node == null) {
            return "Tree is empty";
        } else {
            Stack<Node> s = new Stack<Node>();
            Node newNode = node;
            while (!s.empty() || newNode != null) {
                if (newNode != null) {
                    s.push(newNode);
                    newNode = newNode.getLeft();
                } else {
                    Node value = s.pop();
                    hold += value.getData() + " ";
                    newNode = value.getRight();
                }
            }
        }
        return hold;
    }

    public String printPreOrder() {
        hold = "";
        return preOrder(root);
    }

    private String preOrder(Node node) {
        if (node == null) {
            return "Tree is empty";
        } else {
            hold += node.getData() + " ";
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
        return hold;
    }

    public String printPostOrder() {
        hold = "";
        return postOrder(root);
    }

    private String postOrder(Node node) {
        if (node == null) {
            return "Tree is empty";
        } else {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            hold += node.getData() + " ";
        }
        return hold;
    }

    public boolean search(int val) {
        if (isEmpty()) {
            return false;
        } else {
            return search(root, val);
        }
    }

    private boolean search(Node node, int val) {
        if (node.getData() == val) {
            return true;
        }
        if (node.getLeft() != null) {
            if (search(node.getLeft(), val)) {
                return true;
            }
        }
        if (node.getRight() != null) {
            if (search(node.getRight(), val)) {
                return true;
            }
        }
        return false;
    }

    public int getLastNode() {
        return getLastNode(root);
    }

    private int getLastNode(Node node) {
        int last = 0;
        if (isEmpty()) {
            return last;
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(node);

            while (!q.isEmpty()) {
                Node newNode = q.poll();
                last = newNode.getData();
                if (newNode.getLeft() != null) {
                    q.add(newNode.getLeft());
                }
                if (newNode.getRight() != null) {
                    q.add(newNode.getRight());
                }
            }
        }
        return last;
    }

    public void deleteLast() {
        deleteGiven(root, getLastNode());
    }

    private void deleteGiven(Node node, int data) {
        if (node == null)
            return;

        if (node.getLeft() == null && node.getRight() == null) {
            if (node.getData() == data) {
                node = null;
                return;
            } else {
                return;
            }
        }

        Queue<Node> q = new LinkedList<Node>();
        q.add(node);
        Node newNode = null, temp = null;

        // Do level order traversal until
        // we find key and last node.
        while (!q.isEmpty()) {
            newNode = q.peek();
            q.remove();

            if (newNode.getData() == data)
                temp = newNode;

            if (newNode.getLeft() != null)
                q.add(newNode.getLeft());

            if (newNode.getRight() != null)
                q.add(newNode.getRight());
        }

        if (temp != null) {
            int x = newNode.getData();
            delete(node, newNode);
            temp.setData(x);
        }
    }

    private void delete(Node node, Node delNode) {
        if (isEmpty()) {
            hold = "Tree is empty";
        } else {
            Queue<Node> q = new LinkedList<Node>();
            q.add(root);

            Node newNode = null;

            while (!q.isEmpty()) {
                newNode = q.peek();
                q.remove();

                if (newNode == delNode) {
                    newNode = null;
                }
                if (newNode.getRight() != null) {
                    if (newNode.getRight() == delNode) {
                        newNode.setRight(null);
                    } else
                        q.add(newNode.getRight());
                }
                if (newNode.getLeft() != null) {
                    if (newNode.getLeft() == delNode) {
                        newNode.setLeft(null);
                    } else
                        q.add(newNode.getLeft());
                }
            }
        }
    }
}
