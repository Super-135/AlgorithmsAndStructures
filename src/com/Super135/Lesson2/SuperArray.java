package com.Super135.Lesson2;

import java.util.Arrays;
import java.util.function.ObjDoubleConsumer;

public class SuperArray<E extends Object & Comparable<? super E>> implements Array<E> {



    private  E[] data;
    private int size;

    public SuperArray() {
        this(null,INITIAL_CAPACITY);
    }

    public SuperArray(int initCap) {
        this(null, initCap);
    }

    public SuperArray(E... data) {
        this(data, data.length);
        this.size = data.length;

    }
    @SuppressWarnings("unchecked")
    private SuperArray(E[] data, int cap) {
        this.size = data != null ? data.length : 0;
        this.data = data != null ? data : (E[]) new Object[cap];
    }

    @Override
    public void add(E value) {
        checkAndgrow();
        data[size++] = value;
    }


    @Override
    public E get(int index) {
        checkIndex(index);
        return data[index];
    }


    @Override
    public boolean remove(E value) {

        int index = indexOf(value);
  //      if (index == -1) return false;
        try {
            return remove(index) != null;
        } catch ( IndexOutOfBoundsException e) {
            return false;
        }
    }

    @Override
    public E remove(int index) {
        checkIndex(index);
        E removedValue = data[index];
        for (int i = index; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        data[size-1] = null;
        size--;
        return removedValue;
    }

    @Override
    public int indexOf(E value) {
        for (int i = 0; i < size ; i++) {
            if (data[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int size() {
        return this.size;
    }




    private void checkIndex(int index) {
        if (index < 0 || index >= data.length){
            String errMsg = String.format("Invalid index %d for array with size %d", index, size);
            throw new  IndexOutOfBoundsException(errMsg);
        }
    }

    private void checkAndgrow() {
        if (data.length == size) {
            data = Arrays.copyOf(data, data.length * 2);
        }
    }

}
