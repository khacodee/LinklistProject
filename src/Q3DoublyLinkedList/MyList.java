package Q3DoublyLinkedList;

/**
 *
 * @author CaoKha
 */
public class MyList {

    int data;
    Node next;
    protected Node head, tail;

    MyList() {
        head = tail = null;
    }

    public void push(int new_data) {
        Node newNode = new Node(new_data);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
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

    public void addBefore(Node next_node, int new_data) {
        if (next_node == null) {
            System.out.println(
                    "The given next node can not be NULL");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.prev = next_node.prev;
        next_node.prev = new_node;
        new_node.next = next_node;
        if (new_node.prev != null) {
            new_node.prev.next = new_node;
        } else {
            head = new_node;
        }
    }

    public void addAfter(Node prev_Node, int new_data) {
        if (prev_Node == null) {
            System.out.println(
                    "The given previous node cannot be NULL ");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_Node.next;
        prev_Node.next = new_node;
        new_node.prev = prev_Node;
        if (new_node.next != null) {
            new_node.next.prev = new_node;
        }
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

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

    public int deleteFromHead() {
        int p = head.info1;
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
        return p;
    }

    public void deleteFromTail() {
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

    boolean isEmpty() {
        return (head == null);
    }
}
