package com.Super135.Lesson4;

import com.Super135.Lesson3.Queue.Queue;

public class LinkedQueueImpl<E> implements Queue<E> {

    private TwoSideLinkedList<E> data = new TwoSideLinkedListImpl<>();

    @Override
    public boolean insert(E value) {
        data.insertLast(value);
        return true;
    }

    @Override
    public E remove() {
        return data.removeFirst();
    }

    @Override
    public E peekFront() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isFull() {
        return false;
    }
}
