package dsa.assignment2;

import java.util.Arrays;
import java.util.Scanner;
import dsa.utils.Utils;
import dsa.utils.Utils2;
import dsa.algorithms.Searching;
import dsa.algorithms.Sorting;

public class Main {
    public static void main(String[] args) {
        System.out.println("#".repeat(80));
        System.out.println(" ".repeat(30) + "Welcome to the Algo Squad!!!");
        System.out.println("#".repeat(80));

        Scanner scanner = new Scanner(System.in);

        String prompt = "Input a number to select the type of Algorithm to be performed \n" +
                "1. Searching \n" +
                "2. Sorting \n" +
                "99.Exit";

        String select_data_type = "What type of data are you operating with? \n" +
                "1. Strings/ Characters \n" +
                "2. Integers \n" +
                "3. Decimals \n";

        String input_array_size = "Input the size of the array: ";
        int input = Utils2.readInt(scanner, prompt, 1, 2, true);

        if (input == 1) {
            prompt = "Input a number to select the type of Searching Algorithm to be performed. \n" +
                    "1. Linear Search \n" +
                    "2. Binary Search \n" +
                    "99.Exit";
            int search_type = Utils2.readInt(scanner, prompt, 1, 2, true);
            int size = Utils.readInt(scanner, input_array_size, 1, 1000, false);
            int data_type = Utils2.readInt(scanner, select_data_type, 1, 3, false);

            if (data_type == 1) {
                String[] array = new String[size];
                String target = Utils2.readString(scanner, "Input the targeted string to search for: ");
                array = Utils2.readStringArray(scanner, size);
                int index;
                switch (search_type) {
                    case 1:
                        index = Searching.linearSearch(array, target);
                        if (index == -1) {
                            System.out.println("Target: " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target: " + target + " found at index " + index);
                        break;
                    case 2:
                        index = Searching.binarySearch(array, target);
                        if (index == -1) {
                            System.out.println("Target " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target " + " found at index " + index);
                        break;
                }

            } else if (data_type == 2) {
                Integer[] array = new Integer[size];
                array = Utils.readIntArray(scanner, size);
                int target = Utils2.readInt(scanner, "Input the targeted value you want to search for: ", -1000000, 1000000, false);

                int index;
                switch (search_type) {
                    case 1:
                        index = Searching.linearSearch(array, target);
                        if (index == -1) {
                            System.out.println("Target: " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target: " + target + " found at index " + index);
                        break;
                    case 2:
                        index = Searching.binarySearch(array, target);
                        if (index == -1) {
                            System.out.println("Target " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target " + " found at index " + index);
                        break;
                }
            } else {
                Double[] array = new Double[size];
                array = Utils2.readDoubleArray(scanner, size);
                double target = Utils2.readDouble(scanner, "Input the targeted value you want to search for: ", -1000000, 1000000);

                int index;
                switch (search_type) {
                    case 1:
                        index = Searching.linearSearch(array, target);
                        if (index == -1) {
                            System.out.println("Target: " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target: " + target + " found at index " + index);
                        break;
                    case 2:
                        index = Searching.binarySearch(array, target);
                        if (index == -1) {
                            System.out.println("Target " + target + " does not exist.");
                            break;
                        }
                        System.out.println("Target " + " found at index " + index);
                        break;
                }
            }
        } else {
            prompt = "Input a number to select the type of Sorting Algorithm to be performed. \n" +
                    "1. Bubble Sort \n" +
                    "2. Selection Sort \n" +
                    "3. Insertion Sort \n" +
                    "4. Quick Sort \n" +
                    "5. Merge Sort \n" +
                    "6. Heap Sort \n" +
                    "99.Exit";
            int sort_type = Utils2.readInt(scanner, prompt, 1, 6, true);
            int size = Utils.readInt(scanner, input_array_size, 1, 1000, false);
            int data_type = Utils2.readInt(scanner, select_data_type, 1, 3, false);

            if (data_type == 1) {
                String[] array = Utils2.readStringArray(scanner, size);

                switch (sort_type) {
                    case 1 -> Sorting.bubbleSort(array);
                    case 2 -> Sorting.selectionSort(array);
                    case 3 -> Sorting.insertionSort(array);
                    case 4 -> Sorting.quickSort(array);
                    case 5 -> Sorting.mergeSort(array);
                    case 6 -> Sorting.heapSort(array);
                }

                System.out.println("Sorted Array: " + Arrays.toString(array));
            } else if (data_type == 2) {
                Integer[] array = Utils.readIntArray(scanner, size);

                switch (sort_type) {
                    case 1 -> Sorting.bubbleSort(array);
                    case 2 -> Sorting.selectionSort(array);
                    case 3 -> Sorting.insertionSort(array);
                    case 4 -> Sorting.quickSort(array);
                    case 5 -> Sorting.mergeSort(array);
                    case 6 -> Sorting.heapSort(array);
                }

                System.out.println("Sorted Array: " + Arrays.toString(array));
            } else {
                Double[] array = Utils2.readDoubleArray(scanner, size);

                switch (sort_type) {
                    case 1 -> Sorting.bubbleSort(array);
                    case 2 -> Sorting.selectionSort(array);
                    case 3 -> Sorting.insertionSort(array);
                    case 4 -> Sorting.quickSort(array);
                    case 5 -> Sorting.mergeSort(array);
                    case 6 -> Sorting.heapSort(array);
                }

                System.out.println("Sorted Array: " + Arrays.toString(array));
            }
        }
    }
}