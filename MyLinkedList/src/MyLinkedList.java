

public class MyLinkedList {
    private int numNodes;
    private Node head;

    public MyLinkedList(Object head) {
        this.head = new Node(head);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {         //ADD
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public Object get(int index) {          //GET
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

    public void addFirst(Object data) {          //ADDFIRST
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void printList() {               //PRINT
        Node temp = head;
        int i = 0;
        while (temp != null) {
            System.out.println("["+ i + "] " + temp.data);
            i++;
            temp = temp.next;
        }
    }
}

