package Algorithms;

import java.util.Arrays;

public class insertionSort {

    public static void insertionSort(int[] array){
        for(int currentIndex = 1; currentIndex < array.length; currentIndex++){
            int currentElement = array[currentIndex];
            int previousIndex = currentIndex - 1;

            while(previousIndex >= 0 && array[previousIndex] > currentElement){
                array[previousIndex+1] = array[previousIndex];
                previousIndex--;
            }
            array[previousIndex + 1] = currentElement;
            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {1, -12, 0, -234, 1344, 133, 23,45,3};
        insertionSort(arrayToSort);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
