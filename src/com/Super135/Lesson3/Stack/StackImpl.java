package com.Super135.Lesson3.Stack;

public class StackImpl <E> implements Stack<E> {

    private E[] data;
    private int size;

    @SuppressWarnings("unchecked")
    public StackImpl(int maxSize) {
        data = (E[]) new Object[maxSize];
    }

    @Override
    public void push(E value) {
        data[size++] = value;

    }

    @Override
    public E pop() {
        return data[--size];
    }

    @Override
    public E peek() {
        return data[size-1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }
}
