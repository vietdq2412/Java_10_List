import list.*;

public class Main {
    public static void main(String[] args) {
        MySimpleList<Integer> listInteger = new MySimpleList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(7);
        listInteger.add(22);

        listInteger.remove(3);

        boolean c = listInteger.contains(3);
        System.out.println(c);

        listInteger.clear();
        for (int i =0; i< listInteger.getSize(); i++){
            System.out.println(listInteger.getElement(i));
        }


    }
}
