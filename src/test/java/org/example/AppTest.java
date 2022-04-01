package org.example;

import static java.util.Arrays.binarySearch;
import static org.junit.Assert.assertTrue;

import jdk.jfr.internal.tool.Main;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void binarySearchTest() {
        int[] testArray = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int desired = 11;
        App app = new App();
        int result = app.binarySearch(testArray, desired);
        System.out.println("The item you are looking for is at position number "+result);
        Assert.assertEquals(11, result);
    }
    @Test
    public void binaryNullTest() {
        int[] testArray = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int desired = 21;
        App app = new App();
        int result = app.binarySearch(testArray, desired);
        Assert.assertEquals(0, result);
    }
    @Test
    public void bubbleSortTest() {
        int[] testArray = new int[50];
        for(int i = 0; i< testArray.length; i++){
            testArray[i] = (int) (Math.random()*100);
        }
        App app = new App();
        System.out.println("Unsorted array: \n" + Arrays.toString(testArray));
        int[] result = app.bubbleSort(testArray);
        System.out.println("Sorted array: \n" + Arrays.toString(result));
    }
}
