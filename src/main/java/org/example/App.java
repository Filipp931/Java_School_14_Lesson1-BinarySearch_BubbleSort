package org.example;

import sun.applet.Main;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.List;
import java.util.stream.Stream;

/**
 * BinarySearch and BubbleSort
 *
 */
public class App 
{
    public static void main(String[] args) {
    }

    public int binarySearch(int[] array, int element) {
        int lowBound = 0;
        int upperBound = array.length - 1 ;
        int current;
        while (true) {
            current = (upperBound + lowBound) / 2;
            if(array[current] == element)
                return current;
            else if (lowBound >= upperBound) return 0;
            else if (element > array[current]) {
                lowBound = current + 1;
            } else upperBound = current - 1;
        }
    }
    public int recBinarySearch(int[] array, int element, int lowBound, int upperBound){
        int current = (lowBound + upperBound)/2;
            if(array[current] == element)
                return current;
            else if (lowBound >= upperBound) return 0;
            else if (element > array[current]) {
                lowBound = current + 1;
            } else upperBound = current - 1;
        return current;
    }
    public int[] bubbleSort(int[] array) {
        for(int k =0; k<array.length-1; k++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
