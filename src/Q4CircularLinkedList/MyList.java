package Q4CircularLinkedList;

/**
 *
 * @author CaoKha
 */
public class MyList {

    public MyList() {

    }

    public Node head = null;
    public Node tail = null;

    public void addToHead(int x) {
        Node p = new Node(x);
        if (isEmpty()) {
            head = tail = p;
        } else {
            p.next = head;
            head = p;
        }
    }

    void addToTail(int x) {
        Node new_node = new Node(x);
        if (head == null) {
            head = new Node(x);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;

    }

    void addAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void addBefore(Node given_ptr, int new_data) {
        if (head == given_ptr) {
            Node n = new Node(new_data);
            n.next = head;
            head = n;
        } else {
            Node p = null;
            for (Node n = head; n != given_ptr; p = n, n = n.next);
            Node m = new Node(new_data);
            m.next = p.next;
            p.next = m;
        }
    }

    void deleteAfter(Node p) {
        Node prev = p, tmp = p.next;
        if (tmp == null) {
            return;
        }
        prev.next = tmp.next;
    }

    public void deleteNode() {
        Node p = head;
        if (p == null) {
            return;
        }
        if (p.next == null) {
            p = null;
        } else {
            Node temp = new Node();
            temp = p;
            while (temp.next.next != null) {
                temp = temp.next;
            }

            Node lastNode = temp.next;
            temp.next = null;
            lastNode = null;
        }
    }

    int count() {
        Node tmp = head;
        int count = 0;
        while (tmp != null) {
            count++;
            tmp = tmp.next;
        }
        return count;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    Node search(int x) {
        Node p = head;
        while (p != null && p.data != x) {
            p = p.next;
        }
        return p;
    }

    boolean isEmpty() {
        return (head == null);
    }

    public void searchNode(int data) {
        Node current = head;
        int i = 1;
        boolean flag = false;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (current != null) {
                if (current.data == data) {
                    flag = true;
                    break;
                }
                i++;
                current = current.next;
            }
        }
        if (flag) {
            System.out.println("Element is present in the list at the position : " + i);
        } else {
            System.out.println("Element is not present in the list");
        }
    }
}
