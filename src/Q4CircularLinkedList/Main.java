package Q4CircularLinkedList;

/**
 *
 * @author CaoKha
 */
public class Main {

    public static void main(String[] args) {
        Node p = new Node();
        MyList c_list = new MyList();
        System.out.println("Circular linked list nodes: ");
        c_list.addToTail(29);
        c_list.addToTail(30);
        c_list.addToTail(31);
        c_list.printList();
        System.out.println("Circular linked list nodes: ");
        c_list.addToHead(35);
        c_list.addToHead(40);
        c_list.addToHead(45);
        c_list.printList();
        System.out.println("Circular linked list nodes: ");
        c_list.addToTail(50);
        c_list.addToTail(55);
        c_list.addToTail(60);
        c_list.printList();
        c_list.deleteNode();
        c_list.deleteNode();
        System.out.println("List after delete node: ");
        c_list.printList();
        p = c_list.search(50);
        c_list.addAfter(p, 90);
        System.out.println("List after insert 90 after 50: ");
        c_list.printList();
        p = c_list.search(29);
        c_list.deleteAfter(p);
        System.out.println("List when delete node after 20: ");
        c_list.printList();
        p = c_list.search(40);
        c_list.addBefore(p, 75);
        System.out.println("List after insert 75 before 40: ");
        c_list.printList();
        int totalCount = c_list.count();
        System.out.println("List count: " + totalCount);
        c_list.searchNode(75);
    }

}
