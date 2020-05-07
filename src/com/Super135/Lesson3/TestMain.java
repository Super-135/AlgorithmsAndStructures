package com.Super135.Lesson3;

import com.Super135.Lesson3.Deque.Deque;
import com.Super135.Lesson3.Deque.DequeImpl;
import com.Super135.Lesson3.Queue.Queue;
import com.Super135.Lesson3.Queue.QueueImpl;
import com.Super135.Lesson3.Stack.Stack;
import com.Super135.Lesson3.Stack.StackImpl;

import java.util.ArrayDeque;

public class TestMain {
    public static void main(String[] args) {
        // 1. Реализовать рассмотренные структуры данных в консольных программах.
        // Все 3- и теста рассматривают и стек и очередь.
        testStack();
        //2. Создать программу, которая переворачивает вводимые строки (читает справа налево).
        //В testQueue() переворачиваем строку.
//        testQueue();
        //3. Создать класс для реализации Decue.
        //Создали Decue раширерением Queue/
//        testDeque();

    }


    private static void testStack() {
        Stack<Integer> stack = new StackImpl<>(5);

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

        //Развернули строку

        String strInput = "0123456789";
        System.out.println("Так было");
        System.out.println(strInput);
        Stack<Character> stackStr = new StackImpl<>(strInput.length());
        for (int i = 0; i <strInput.length() ; i++) {
            stackStr.push(strInput.charAt(i));
        }
        System.out.println("Вот так перевернули");
        while ( !stackStr.isEmpty()) {
            System.out.print(stackStr.pop());
        }

    }

    private static void addToStack(Stack<Integer> stack, int value) {
        if (!stack.isFull()){
            stack.push(value);
        }
    }

    private static void testQueue() {
        Queue<Integer> queue = new QueueImpl<>(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        System.out.println("Текущий элемент "+ queue.peekFront());
        System.out.println("Размер  очереди "+ queue.size());

        while (!queue.isEmpty()){
            System.out.print (queue.remove()+" ");
        }
    }

    private static void testDeque() {

        Deque<Integer> deque = new DequeImpl<>(5);
        deque.insertLeft(1);
        deque.insertLeft(2);
        deque.insertLeft(3);
        deque.insertRieght(0);
        deque.insertRieght(5);

        System.out.println("Текущий элемент "+ deque.peekFront());

        while (!deque.isEmpty()){
            System.out.print(deque.removeRieght()+" ");
        }


    }


}
