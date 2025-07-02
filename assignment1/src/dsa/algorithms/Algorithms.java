package dsa.algorithms;
import dsa.algorithms.SearchAlgorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithms {
    public int Search (int[] integer_array, String[] string_array, int value, String target){
//        ask wah type of search algorithm the user wants to user
        System.out.println("Select the type of Search Algorithm to use...");
        System.out.print("1. Sequential Search on Integers \n2. Sequential Search on Strings \n3. Sort Digits");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return -1;
    }

    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static boolean isUnique(int[] array) {
        Set<Integer> seen = new HashSet<>();
        for (int num : array){
            if (!seen.add(num)){
                return false;
            }
        }
        return true;
    }


    public static boolean isUnique(String[] array){
        Set<String> seen = new HashSet<>();
        for ( String string : array){
            if ( !seen.add(string)){
                return false;
            }
        }
        return true;

//        an alternative method is to check first before adding...
//        Set<String> my_set = new HashSet<>();
//        for ( String string : array){
//            if (my_set.contains(string)){
//                return false;
//            }
//            my_set.add(string);
//        }
//        return true;
    }

    public static int countBinaryDigits(int num){
        int total = 0;
        while (num > 0){
            num = num / 2;
            total += 1;
        }
        return total;
    }

    public static int countBinaryDigitsRecursively(int num) {
        if (num <= 0) return 0;
        return 1 + countBinaryDigitsRecursively(num / 2);
    }

    public static int factorial(int num){
        if (num == 0){
            return 1;
        }
        return num * factorial(num - 1);
    }



}
