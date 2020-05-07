package com.Super135.Lesson4;

public interface LinkedList<E> {

    void insertFirst(E value);

    E removeFirst();

    boolean remove(E value);

    boolean contains(E value);

    default boolean isEmpti(){
        return size() == 0;

    }

    int size();

    void display();

    E getFirst();

    class Entry<E>{
        E value;
        Entry<E> next;

        public Entry(E value){
            this.value = value;
        }
    }

}
