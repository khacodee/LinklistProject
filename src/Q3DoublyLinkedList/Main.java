package Q3DoublyLinkedList;

/**
 *
 * @author CaoKha
 */
public class Main {

    public static void main(String[] args) {
        Node p = new Node();
        MyList dl_List = new MyList();
        dl_List.push(10);
        dl_List.push(20);
        dl_List.push(30);
        dl_List.push(40);
        dl_List.push(50);
        System.out.println("The list: ");
        dl_List.printList();
        dl_List.deleteNode();
        System.out.println("The list after delete: ");
        dl_List.printList();
        dl_List.addToHead(100);
        System.out.println("The list after add to head: ");
        dl_List.printList();
        dl_List.addToTail(200);
        System.out.println("The list after add to tail: ");
        dl_List.printList();
        System.out.println("The list after add after: ");
        dl_List.addAfter(dl_List.head.next, 60);
        dl_List.printList();
        System.out.println("The list after add before: ");
        dl_List.addBefore(dl_List.head.next, 70);
        dl_List.printList();
        dl_List.deleteFromHead();
        System.out.println("The list after delete from head: ");
        dl_List.printList();
        dl_List.deleteFromTail();
        System.out.println("The list after delete from tail: ");
        dl_List.printList();
        dl_List.searchNode(20);

    }

}
