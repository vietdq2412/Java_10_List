

public class MyLinkedList<E> {
    private int numNodes;
    private Node head;

    public MyLinkedList(E head) {
        this.head = new Node(head);
    }

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private E data;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }

        public void setData(E o) {
            this.data = o;
        }
    }

    public void add(int index, E data) {         //ADD
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

    public void addLast(E e) {                   ///addLast
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
        }
        temp.next = new Node(e);
    }


    public void addFirst(E data) {          //ADDFIRST
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public E remove(int index) {           //remove
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        Node temp2 = temp;
        temp2.next = temp2.next.next;
        temp.next = null;
        return (E) temp;
    }

    public E remove(Object e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            if (temp.next.getData() == e) {
                break;
            }
        }
        Node temp2 = temp;
        temp2.next = temp2.next.next;
        temp.next.next = null;
        return (E) temp;
    }

    public E get(int index) {          //GET
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.getData();
    }

//    public E getFirst(){
//
//        return ;
//    }
    //public E getFirst(){}


    public void printList() {               //PRINT
        Node temp = head;
        int i = 0;
        while (temp != null) {
            System.out.println("[" + i + "] " + temp.data);
            i++;
            temp = temp.next;
        }
    }

    public int size() {              //size
        return numNodes;
    }

    public MyLinkedList<E> clone() {          ///clone
        MyLinkedList<E> newList = new MyLinkedList<>(null);
        Node temp = this.head;

        Node tempnew = newList.head;
        while (temp.next != null) {
            //tempnew.setData(temp.getData());
            tempnew.next = new Node(null);
            tempnew = tempnew.next;
            temp = temp.next;
        }
        return newList;
    }

    public boolean contains(E o) {           //contains
        boolean isExist = true;
        Node temp = head;
        while (o != temp.data) {
            temp = temp.next;
            isExist = false;
            if (temp == null) break;
        }
        return isExist;
    }

    public int indexOf(E o) {                    //indexOf
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (o == temp.data) break;
            index++;
            temp = temp.next;
        }
        if (temp == null) index = -1;
        return index;
    }

    public void clear(){
        Node temp = head;
        Node nextTemp;
        while (temp != null){
            temp.setData(null);

            nextTemp = temp;
            nextTemp.next = null;

            temp = temp.next;
        }
    }
}

