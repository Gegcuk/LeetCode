package Algorithms;

import java.util.Arrays;

public class bubbleSort {

    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void bubbleSort(int[] array){
        int outerIndex, innerIndex;
        boolean isSwapped;
        for(outerIndex = 0; outerIndex < array.length; outerIndex++){
            isSwapped = false;
            for(innerIndex = 0; innerIndex < array.length - outerIndex - 1; innerIndex++){
                if(array[innerIndex] > array[innerIndex + 1]){
                    swap(array, innerIndex, innerIndex+1);
                    isSwapped = true;
                }
            }
            if(!isSwapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arrayToSort = {1, -12, 0, -234, 1344, 133, 23,45,3};
        bubbleSort(arrayToSort);
        System.out.println("Bubble sort: " + Arrays.toString(arrayToSort));
    }
}
