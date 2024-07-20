package Algorithms;

import java.util.Arrays;

public class mergeSort {
    public static void mergeSort(int[] array, int left, int right){
        if(left < right){
            int middle = left + (right - left)/2;

            mergeSort(array, left, middle);
            mergeSort(array, middle+1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right){
        int leftIndex, rightIndex, mergedIndex;
        int leftSize = middle - left + 1;
        int rightSize = right - middle;
        int[] tempLeft = new int[leftSize];
        int[] tempRight = new int[rightSize];

        for(leftIndex = 0; leftIndex < leftSize; leftIndex++){
            tempLeft[leftIndex] = array[left + leftIndex];
        }
        for(rightIndex = 0; rightIndex < rightSize; rightIndex++){
            tempRight[rightIndex] = array[middle + rightIndex + 1];
        }

        leftIndex = 0;
        rightIndex = 0;
        mergedIndex = left;
        while(leftIndex < leftSize && rightIndex < rightSize){
            if(tempLeft[leftIndex] < tempRight[rightIndex])
                array[mergedIndex++] = tempLeft[leftIndex++];
            else
                array[mergedIndex++] = tempRight[rightIndex++];
        }

        while (leftIndex < leftSize)
            array[mergedIndex++] = tempLeft[leftIndex++];
        while(rightIndex < rightSize)
            array[mergedIndex++] = tempRight[rightIndex++];
        System.out.println(Arrays.toString(array));

    }

    public static void main(String[] args) {
        int[] arrayToSort = {1, -12, 0, -234, 1344, 133, 23,45,3};
        mergeSort(arrayToSort, 0, arrayToSort.length-1);
        System.out.println(Arrays.toString(arrayToSort));
    }
}
