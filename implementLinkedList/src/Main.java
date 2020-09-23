import javax.xml.soap.Node;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>(0);

        list.add(0,6);
        list.add(1,7);

        list.addFirst(7);

        list.addLast(8);
        list.addLast(11);



        list.printList();

//        list.remove((Integer)6);
//        System.out.println("////rm");
//        list.printList();
//
//        System.out.println("////");
//
//        System.out.println(list.contains(7));
//
//        System.out.println("////indexOf");
//        System.out.println(list.indexOf(7));
        MyLinkedList<Integer> newlist;

        newlist = list.clone();
        System.out.println("////clone");
        newlist.printList();

        System.out.println("list cux : ");
        list.printList();

        System.out.println("clear");
        list.clear();
        list.printList();
    }
}
