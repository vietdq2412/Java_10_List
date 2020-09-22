package list;

import java.util.Arrays;

public class MySimpleList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MySimpleList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MySimpleList(int capacity) {
        elements = new Object[capacity];
    }

    public int getSize() {
        return size;
    }

    public void ensureCapa() {
        int newsize = elements.length + 5;
        elements = Arrays.copyOf(elements, newsize);
    }

    public void increaseCapa() {
        int newsize = elements.length + 1;

        Object[] newList = new Object[newsize];
        for (int i = 0; i < elements.length; ) {
            newList[i] = elements[i];
        }
        elements = newList;
    }

    public void add(E e) {                   ///ADD
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size] = e;
        size++;
    }

    public E getElement(int index) {                  //GET
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        return (E) elements[index];
    }

    public E remove(int index) {               //REMOVE
        Object[] arr;
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        } else {
            size--;
            arr = new Object[size];
            for (int i = 0; i < size; i++) {
                if (i < index) {
                    arr[i] = elements[i];
                } else arr[i] = elements[i + 1];
            }
        }
        E e = (E) elements[index];
        elements = arr;
        return e;
    }

    public E clone() {         //CLONE
        MySimpleList newList = new MySimpleList();
        return (E) newList;
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return true;
            } else if (i >= size) {
                return false;
            }
        }
        return false;
    }

    public int indexOf(E o) {         ///////indexOF
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        for (int i =0; i< size; i++){
            elements[i] = null;
        }
        size = 0;
    }

}
