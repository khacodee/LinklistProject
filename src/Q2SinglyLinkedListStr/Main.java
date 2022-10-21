package Q2SinglyLinkedListStr;

/**
 *
 * @author CaoKha
 */
public class Main {

    public static void main(String[] args) {
        Node p = new Node();
        MyList list = new MyList();
        MyList list1 = new MyList();
        list.push("Toi");
        list.push("la");
        list.push("sinh");
        list.push("vien");
        list.push("FPT");
        System.out.println("Linked List: ");
        list.printList();
        System.out.println("1.Add to Head: ");
        list.addToHead("Hello!");
        list.printList();
        System.out.println("2.Add to Tail: ");
        list.addToTail("HCM");
        list.printList();
        System.out.println("3.Add after 'vien': ");
        list.addAfter(list.search("vien"), "KTPM");
        list.printList();
        System.out.println("4.Traverse:  ");
        list.traverse();
        System.out.println("5.Count node: " + list.count());
        System.out.println("6.Delete From Head: ");
        list.deleteFromHead();
        list.printList();
        System.out.println("7.Delete from Tail: ");
        list.deleteFromTail();
        list.printList();
        System.out.println("8.Delete After 'sinh': ");
        list.deleteAfter(list.search("sinh"));
        list.printList();
        System.out.println("9.Delete Node 'la' : ");
        list.deleteNode("la");
        list.printList();
        System.out.println("10.Search Node 'KTPM': ");
        System.out.println(list.search("KTPM"));

    }
}
