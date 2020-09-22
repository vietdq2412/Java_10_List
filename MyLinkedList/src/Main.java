import javax.xml.soap.Node;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(0);

        list.add(0,6);
        list.add(1,"lala");

        list.addFirst("papa");

        list.printList();

        System.out.println("////");

        System.out.println(list.get(1));
    }
}
