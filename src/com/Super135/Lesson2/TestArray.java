package com.Super135.Lesson2;

import java.util.Arrays;
import java.util.Random;
import java.util.RandomAccess;

public class TestArray {



    public static void main(String[] args) {
        testDynamicArray();
        testSort();
    }

    private static void testSort() {
        int[] data1 = new int[10000];
        Random rnd = new Random();
        for (int i = 0; i < data1.length; i++) {
            data1[i] = rnd.nextInt();
        }

        int[] data2 = Arrays.copyOf(data1,data1.length);
        int[] data3 = Arrays.copyOf(data1,data1.length);

        long b = System.currentTimeMillis();
        sortBubble(data1);
        System.out.print("Время выполнения методом пузырька ");
        System.out.println(System.currentTimeMillis()-b);
        b = System.currentTimeMillis();
        sortSelect(data1);
        System.out.print("Время выполнения методом выбора ");
        System.out.println(System.currentTimeMillis()-b);
        b = System.currentTimeMillis();
        sortInsert(data1);
        System.out.print("Время выполнения методом вставки ");
        System.out.println(System.currentTimeMillis()-b);

    }

    private static void sortBubble(int[] data1) {
        for (int i = 0; i < data1.length-1; i++) {
           for (int j = 0; j < data1.length - 1- i ; j++) {
              if (data1[j] >= data1[j+1]) {
                  int temp = data1[j];
                  data1[j] = data1[j+1];
                  data1[j+1] = temp;
              }
           }
        }
    }

    private static void sortSelect(int[] data1) {
        for (int i = 0; i < data1.length-1; i++) {
            int minI = i;
            for (int j = i+1; j < data1.length; j++) {
                if (data1[j] <= data1[minI]) {
                    minI = j;
                }
            }
            if (minI != i){
            int temp = data1[minI];
            data1[minI] = data1[i];
            data1[i] = temp;
            }
        }
    }

    private static void sortInsert(int[] data1) {
        for (int i = 1; i < data1.length; i++) {
            int temp = data1[i];
            int in = i;
            while (in > 0 && data1[in - 1] >= temp){
                data1[in] = data1[in-1];
                in--;
            }
            data1[in] = temp;
        }
    }




    private static void testDynamicArray() {
        Array<Integer> data = new SuperArray<>();

        Random rnd = new Random();
        for (int i = 0; i < 10000; i++) {
            data.add(rnd.nextInt());
        }

        System.out.println(data.get(2));
//        System.out.println(data.indexOf(2));
//        data.remove(Integer.valueOf(2));
        data.remove(2);
        System.out.println(data.get(2));
    }


}
