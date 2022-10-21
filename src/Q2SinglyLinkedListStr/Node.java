package Q2SinglyLinkedListStr;

/**
 *
 * @author CaoKha
 */
public class Node {
    String data;
    Node next;
    Node prev;
    static Node head;
    String info1;
    Node(String d) {data = d; next = null;}
    
    public Node(String i, Node n) {
        info1 = i;
        next = n;
            }
    
    Node() {
   
    }
    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
