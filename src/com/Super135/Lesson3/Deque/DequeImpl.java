package com.Super135.Lesson3.Deque;

import com.Super135.Lesson3.Queue.QueueImpl;

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E>  {


    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    @Override
    public boolean insertLeft(E value) {
        if (isFull()){
            return false;
        }
        if (head - 1 < 0){
            head = data.length;
        }

        data[--head] = value;
        size++;
        return true;
    }

    // Используем родителя
    @Override
    public boolean insertRieght(E value) {
        return super.insert(value);
    }

    // Используем родителя
    @Override
    public E removeLevt() {
        return super.remove();
    }

    @Override
    public E removeRieght() {
        if (isEmpty()){
            return null;
        }
        if (tail < 0){
            tail = data.length-1;
        }
        size--;
        E remValue = data[tail--];

        return remValue;
    }

    @Override
    public boolean insert(E value) {
        return false;
    }

    @Override
    public E remove() {
        return null;
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
