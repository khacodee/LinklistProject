package Q1SinglyLinkedList;

/**
 *
 * @author CaoKha
 */
public class MyList {

    int data;
    Node next;
    protected Node head, tail;
    private Node firstL;

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

    boolean isEmpty() {
        return (head == null);
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

    void addAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    void traverse() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
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

    void deleteAfter(Node p) {
        Node prev = p, tmp = p.next;
        if (tmp == null) {
            return;
        }
        prev.next = tmp.next;
    }

    public void deleteNode(int key) {
        Node tmp = head, prev = null;
        if (tmp != null && tmp.data == key) {
            head = tmp.next;
            return;
        }
        while (tmp != null & tmp.data != key) {
            prev = tmp;
            tmp = tmp.next;
        }
        if (tmp == null) {
            return;
        }
        prev.next = tmp.next;
    }

    Node search(int x) {
        Node p = head;
        while (p != null && p.data != x) {
            p = p.next;
        }
        return p;
    }

    void delete(Node p) {
        if (p == null) {
            return;
        }
        Node f = head, prev = null;
        while (f != null && f != p) {
            prev = f;
            f = f.next;
        }
        if (prev == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            prev.next = p.next;
            if (p == tail) {
                tail = prev;
            }
        }
        p.next = null;
    }

    public Node remove(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        node.next = node.next.next;
        return node;
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

    public void sort() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        this.head = prev;
    }

    public int size() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        return count;
    }

    private void get(int i) {

    }

    public int[] toArray() {
        java.util.LinkedList<Integer> List = new java.util.LinkedList<Integer>();
        System.out.println("LinkedList: " + List);
        return null;
    }

    public Node sortedMerge(Node headA, Node headB) {
        Node dummyNode = new Node(0);

        while (true) {
            if (headA == null) {
                tail.next = headB;
                break;
            }
            if (headB == null) {
                tail.next = headA;
                break;
            }
            if (headA.data <= headB.data) {
                tail.next = headA;
                headA = headA.next;
            } else {
                tail.next = headB;
                headB = headB.next;
            }
            tail = tail.next;
        }
        return dummyNode.next;
    }

    public int max() {
        Node current = head;
        int max = 0;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            max = head.data;
            while (current != null) {
                if (max < current.data) {
                    max = current.data;
                }
                current = current.next;
            }
        }
        return max;
    }

    public int min() {
        Node current = head;
        int min = 0;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            min = head.data;
            while (current != null) {
                if (min > current.data) {
                    min = current.data;
                }
                current = current.next;
            }
        }
        return min;
    }

    int sum() {
        if (head == null) {
            return -1;
        }
        int count = 0;
        int sum = 0;
        Node current = head;
        while (current != null) {
            count++;
            sum += current.data;
            current = current.next;
        }
        return sum;
    }

    int average() {
        if (head == null) {
            return -1;
        }
        int count = 0;
        int sum = 0;
        int avg = 0;
        Node current = head;
        while (current != null) {
            count++;
            sum += current.data;
            current = current.next;
        }
        avg = sum / count;
        return avg;
    }

    static boolean isSorted(Node head) {
        if (head == null) {
            return true;
        }
        for (Node t = head; t.next != null; t = t.next) {
            if (t.data <= t.next.data) {
                return false;
            }
        }
        return true;
    }

    static Node Insert(Node head, Node newNode) {
        Node current;
        if (head == null) {
            head = newNode;
        } else if (head.data >= newNode.data) {
            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.data < newNode.data) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                newNode.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
        }
        return head;
    }

    boolean check(MyList listb) {
        Node a = this.head, b = listb.head;
        while (a != null && b != null) {
            if (a.data != b.data) {
                return false;
            } else {
                a = a.next;
                b = b.next;
            }
        }
        return (a == null && b == null);
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
        System.out.println();
    }

}
