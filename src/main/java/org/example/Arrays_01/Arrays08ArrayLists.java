package org.example.Arrays_01;
import java.util.Arrays;

// public class Arrays08ArrayLists<D> <- <D> type is 'generics'
public class Arrays08ArrayLists<D> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 2;
    private Object elements[];

    public Arrays08ArrayLists(){

        elements = new Object[DEFAULT_CAPACITY];
    }

    public D get (int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index" + i + "Size" + size);
        }
        return (D) elements[i];
    }

    public void add(D item){
        if (size == elements.length){
            increaseCapacity();
        }
        elements[size] = item;
        size ++;
    }

    public int size(){

        return size;
    }

    private void increaseCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
