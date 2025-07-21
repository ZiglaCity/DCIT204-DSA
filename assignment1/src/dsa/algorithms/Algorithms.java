package dsa.algorithms;
import dsa.algorithms.SearchAlgorithms;
import dsa.utils.Utils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Algorithms {
    public int Search (Integer[] integer_array, String[] string_array, int value, String target){
//        ask wah type of search algorithm the user wants to user
        System.out.println("Select the type of Search Algorithm to use...");
        System.out.print("1. Sequential Search on Integers \n2. Sequential Search on Strings \n3. Sort Digits");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        return -1;
    }

    public static int findMax(Integer[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static boolean isUnique(Integer[] array) {
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

    public static double[][] MatrixMultiplication (double[][] matrixA, double[][] matrixB){
        int rowA = matrixA.length;
        int colA = matrixA[0].length;
        int rowB = matrixB.length;
        int colB = matrixB[0].length;

        double[][] matrixAB = new double[rowA][colB];
        for (int r = 0; r < rowA; r++){
            for (int c = 0; c < colB; c++){
                matrixAB[r][c] = 0.0;
                for (int x = 0; x < colA; x++){
                    matrixAB[r][c] += (matrixA[r][x] * matrixB[x][c]);
                }
            }
        }
        return matrixAB;
    }

    public static double[] GaussianElimination(double[][] A, Integer[] b){
        int n = b.length;

        for (int p = 0; p < n; p++) {
            // Find pivot row and swap
            int max = p;
            for (int i = p + 1; i < n; i++) {
                if (Math.abs(A[i][p]) > Math.abs(A[max][p])) {
                    max = i;
                }
            }

            // Swap rows in A
            double[] temp = A[p];
            A[p] = A[max];
            A[max] = temp;

            // Swap values in b
            double t = b[p];
            b[p] = b[max];
            b[max] = (int) t;

            if (Math.abs(A[p][p]) <= 1e-10) {
                throw new ArithmeticException("Matrix is singular or nearly singular, there could be no solution or infinitely many solutions, but not a unique solution.");
            }

            // Pivot within A and b
            for (int i = p + 1; i < n; i++) {
                double alpha = A[i][p] / A[p][p];
                b[i] -= (int) (alpha * b[p]);
                for (int j = p; j < n; j++) {
                    A[i][j] -= alpha * A[p][j];
                }
            }
        }

        // Back substitution
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            double sum = 0.0;
            for (int j = i + 1; j < n; j++) {
                sum += A[i][j] * x[j];
            }
            x[i] = (b[i] - sum) / A[i][i];
        }

        return x;
    }

}
