package list;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MySimpleList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object [] elements;

    public MySimpleList() {
        elements= new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa(){
        int newsize = elements.length + 5;
        elements = Arrays.copyOf(elements,newsize);
    }

    public void increaseCapa(){
        int newsize = elements.length +1;

        Object [] newList = new Object[newsize];
        for (int i = 0; i< elements.length; ){
            newList[i] = elements[i];
        }
        elements = newList;
    }

    public void add(E e) {
        if(size == elements.length){
            ensureCapa();
        }
        size++;
        elements[size] = e;
    }

    public E getElement(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size );
        }
        return (E) elements[index];
    }


}
