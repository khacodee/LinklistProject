package Q1SinglyLinkedList;

/**
 *
 * @author CaoKha
 */
public class Main {

    public static void main(String[] args) {
        Node p = new Node();
        MyList list = new MyList();
        MyList list1 = new MyList();
        list.push(7);
        list.push(9);
        list.push(1);
        list.push(3);
        list.push(8);
        list.push(6);
        list.push(4);
        list.push(5);
        list1.push(20);
        list1.push(5);
        list1.push(6);
        System.out.println("Created list: ");
        list.printList();

        //Delete node 3
        list.deleteNode(3);
        System.out.println("List after delete 3: ");
        list.printList();

        //Delete After
        p = list.search(7);
        list.addAfter(p, 2);
        System.out.println("List after insert 2 after 7: ");
        list.printList();

        //Delete node after node(1):
        p = list.search(1);
        list.deleteAfter(p);
        System.out.println("List after delete node after node 1: ");
        list.printList();

        //Insert 9 before 6:
        p = list.search(6);
        list.addBefore(p, 9);
        System.out.println("List after insert 9 before 6: ");
        list.printList();

        //Reverse
        list.reverse();
        System.out.println("List after reverse: ");
        list.printList();

        //Node count
        int totalCount = list.count();
        System.out.println("Number of node: " + totalCount);

        //Add to head
        list.addToHead(20);
        System.out.println("Add to head: ");
        list.printList();

        //Add to tail
        list.addToTail(23);
        System.out.println("Add to tail: ");
        list.printList();

        //Traverse
        System.out.println("List after traverse: ");
        list.traverse();

        //Delete head
        list.deleteFromHead();
        System.out.println("List after delete from head: ");
        list.printList();

        //Delete tail
        list.deleteFromTail();
        System.out.println("List after delete from tail: ");
        list.printList();

        //DeleteNode
        list.deleteNode(5);
        System.out.println("List after delete node: ");
        list.printList();

        //Delete node(value = 2):
        p = list.search(2);
        list.delete(p);
        System.out.println("List after delete 2: ");
        list.printList();

        //Delete by index
        list.remove(1);
        System.out.println("List after delete 1: ");
        list.printList();

        //Sort
        list.sort();
        System.out.println("List after sort: ");
        list.printList();
        
        //Min, max
        System.out.println("Minimum value node in the list: " + list.min());
        System.out.println("Maximum value node in the list: " + list.max());
        int avg = list.average();
        System.out.println("Sum: "+list.sum());
        System.out.println("Average of nodes in the list: " + avg);
        System.out.println("Do list same the node?");
        if (list.check(list1) == true) {
            System.out.println("Identical");
        } else {
            System.out.println("Not Identical");
        }
    }
}
