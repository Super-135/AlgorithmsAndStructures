package com.Super135.Lesson4;

import com.Super135.Lesson3.Queue.Queue;
import com.Super135.Lesson3.Stack.Stack;

public class TestHW4 {

    public static void main(String[] args) {
//        testLinkedList();
//        testStackLinkedList();
//        testTwoLinkedList()
        testTwoStackLinkedList();
    }

    private static void testLinkedList() {
        LinkedList<Integer> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);

        linkedList.display();

        System.out.println("Найти 3 " + linkedList.contains(3));
        System.out.println("Найти 1 " + linkedList.contains(1));
        System.out.println("Найти 55 " + linkedList.contains(55));

        linkedList.removeFirst();
        linkedList.remove(2);
        linkedList.display();
    }
    private static void testStackLinkedList() {
        Stack<Integer> stack = new LinkedStackImpl<>();

        addToStack(stack, 1);
        addToStack(stack, 2);
        addToStack(stack, 3);
        addToStack(stack, 4);
        addToStack(stack, 5);
        addToStack(stack, 6);

        System.out.println("Размер стека "+stack.size());
        System.out.println("Верх стека  " + stack.peek());

        while ( !stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }

    }

    private static void testTwoLinkedList() {
        TwoSideLinkedList<Integer> linkedList = new TwoSideLinkedListImpl<>();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(4);
        linkedList.insertLast(5);

        linkedList.display();

        System.out.println("Найти 3 " + linkedList.contains(3));
        System.out.println("Найти 1 " + linkedList.contains(1));
        System.out.println("Найти 55 " + linkedList.contains(55));

        linkedList.removeFirst();
        linkedList.remove(2);
        linkedList.display();
    }

    private static void testTwoStackLinkedList() {
        Queue<Integer> stack = new LinkedQueueImpl<>();

        stack.insert(1);
        stack.insert(2);
        stack.insert(3);
        stack.insert(4);
        stack.insert(5);
        stack.insert(6);

        System.out.println("Размер стека "+stack.size());
        System.out.println("Верх стека  " + stack.peekFront());

        while ( !stack.isEmpty()) {
            System.out.print(stack.remove()+" ");
        }

    }


    private static void addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()){
            stack.push(value);
        }
    }
}
