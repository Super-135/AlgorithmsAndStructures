package com.Super135.Lesson3.Queue;

public class QueueImpl<E> implements Queue<E> {

    private static final int DEFAULT_TAIL = -1;
    protected static final int DEFAULT_HEAD = 0;

    protected E[] data;
    protected int size;
    protected int head;
    protected int tail;


    @SuppressWarnings("unchecked")
    public QueueImpl(int maxSize) {
        data = (E[]) new Object[maxSize];
        head = DEFAULT_HEAD;
        tail = DEFAULT_TAIL;
    }

    @Override
    public boolean insert(E value) {
        if (isFull()){
            return false;
        }
        if (tail == data.length-1){
            tail = DEFAULT_TAIL;
            return false;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {
        if (isEmpty()){
            return null;
        }
        if (head == data.length){
            head = DEFAULT_HEAD;
        }

        E remValue = data[head++];
        size--;
        return remValue;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return data.length == size;
    }
}
