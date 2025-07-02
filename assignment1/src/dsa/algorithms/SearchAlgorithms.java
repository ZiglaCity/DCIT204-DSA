package dsa.algorithms;

import java.util.Objects;

public class SearchAlgorithms {
    public static int sequentialSearch (int[] array, int value){
        int i = 0;
        while (i < array.length && array[i] != value) {
            i += 1;
        }
        if ( i < array.length){
            return i;
        }
        return -1;
    }

    public static int sequentialSearch(String[] array, String target){
        int i = 0;
        while (i < array.length && !Objects.equals(array[i], target)) {
            i += 1;
        }
        if ( i < array.length){
            return i;
        }
        return -1;
    }
}
