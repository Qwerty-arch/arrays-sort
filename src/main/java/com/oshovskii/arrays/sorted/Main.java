package com.oshovskii.arrays.sorted;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        MyArrayList<Integer> myArrayList = new MyArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            myArrayList.add(r.nextInt(100));
        }
        System.out.println(myArrayList);

        long time = System.nanoTime();
        myArrayList.selectionSort();
//       myArrayList.insertionSort();
//       myArrayList.bubbleSort();
        time = System.nanoTime() - time;
        System.out.println("time method: " + time);
    }
}