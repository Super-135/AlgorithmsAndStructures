package com.Super135.Lesson4;

public class SimpleLinkedListImpl<E> implements LinkedList<E>{

    protected Entry<E> firstElement;
    protected int size;


    @Override
    public void insertFirst(E value) {
        Entry<E> entry = new Entry<>(value);
        entry.next = firstElement;
        firstElement = entry;
        size++;

    }

    @Override
    public E removeFirst() {
        if (isEmpti()){
            return null;
        }

        E removeValue = firstElement.value;
        firstElement = firstElement.next;
        size--;
        return removeValue;
    }

    @Override
    public boolean remove(E value) {
        Entry<E> current = firstElement;
        Entry<E> previous = null;

        while (current != null){
            if (current.value.equals(value)){
                break;
            }

            previous = current;
            current = firstElement.next;
        }

        if (current == null) {
            return false;
        }

        if (current == firstElement) {
            firstElement = firstElement.next;
        } else {
            previous.next = current.next;
        }

        size--;
        return true;
    }

    @Override
    public boolean contains(E value) {
        Entry<E> current = firstElement;

        while (current != null){
            if (current.value.equals(value)){
                return true;
            }

            current = current.next;
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getFirst() {
        return firstElement != null ? firstElement.value : null;
    }

    @Override
    public void display() {
        System.out.println("-------------");
        Entry<E> current = firstElement;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
        System.out.println("-------------");

    }
}
