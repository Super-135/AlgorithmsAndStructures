package com.Super135.Lesson4;

public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {

    private Entry<E> lastElement;

    @Override
    public void insertLast(E value) {
        Entry<E> entry = new Entry<>(value);

        if (isEmpti()){
            firstElement = entry;
        } else {
            lastElement.next = entry;
        }

        lastElement = entry;
        size++;
    }

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size()==1){
            lastElement = firstElement;
        }
    }

    @Override
    public E removeFirst() {
        E removeValue = super.removeFirst();
        if (isEmpti()) {
            lastElement = null;
        }
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
        }
        else if (current == lastElement){
            lastElement = previous;
            previous.next = null;
        }
        else {
            previous.next = current.next;
        }

        size--;
        return true;
    }
}
