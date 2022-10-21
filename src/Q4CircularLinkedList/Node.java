package Q4CircularLinkedList;

/**
 *
 * @author CaoKha
 */
public class Node {

    int data;
    Node next;
    Node prev;
    static Node head;
    int info1;

    Node(int d) {
        data = d;
        next = null;
    }

    public Node(int i, Node n) {
        info1 = i;
        next = n;
    }

    Node() {

    }

}
