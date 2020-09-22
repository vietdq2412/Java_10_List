import list.*;
public class Main {
    public static void main(String[] args) {
        MySimpleList<Integer> listInteger = new MySimpleList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.getElement(4));
        System.out.println("element 1: "+listInteger.getElement(1));
        System.out.println("element 2: "+listInteger.getElement(2));

        listInteger.getElement(6);
        System.out.println("element 6: "+listInteger.getElement(6));

        System.out.println("element 1: " + listInteger.getElement(3));
    }
}
