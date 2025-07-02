package dsa.assignment1;
import java.util.Arrays;
import java.util.Scanner;

import dsa.algorithms.Algorithms;
import dsa.algorithms.SearchAlgorithms;
import dsa.utils.Utils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey there, welcome to my algo samples...!");
        Scanner scanner = new Scanner(System.in);
        String prompt = """
                Select the algorithm you want to perform:\s
                1. Find Max
                2. Element Uniqueness (Integers)\s
                3. Element Uniqueness (Strings/Characters) \s
                4. Matrix Multiplication\s
                5. Gaussian Elimination\s
                6. Counting Binary Digits (Iterative) \s
                7. Counting Binary Digits (Recursive)\s
                8. Factorial (Recursive) \s
                9. Sequential Search (Integers)\s
                10.Sequential Search (Strings/Characters)\s
                99.Exit""";
        int input = Utils.readInt(scanner, prompt, 1, 10, true);

        System.out.println(" You selected option: " + input);

        if (input == 1 || input == 2 || input == 9){
            prompt = "Input the size of the array to be used.";
            int size = Utils.readInt(scanner, prompt, 1, 10000, false);
            int[] numbers = Utils.readIntArray(scanner, size);
            int result;
            switch (input){
                case 1 :
                    result = Algorithms.findMax(numbers);
                    System.out.println("The maximum number of the array: " + Arrays.toString(numbers) + " is " + result);
                    break;
                case 2 :
                    boolean isUnique = Algorithms.isUnique(numbers);
                    if(isUnique){
                        System.out.println("The elements of the array: " + Arrays.toString(numbers) + " are unique");
                    }
                    else{
                        System.out.println("The elements of the array: " + Arrays.toString(numbers) + " are not unique");
                    }
                    break;
                case 9 :
                    prompt = "Input the value you want to search for:";
                    int value = Utils.readInt(scanner, prompt, -1000000000, 1000000000, false);
                    result = SearchAlgorithms.sequentialSearch(numbers, value);
                    if (result == -1){
                        System.out.println("The value: " + value + " in not found in the array: " + Arrays.toString(numbers));
                        break;
                    }
                    else {
                        System.out.println("The value: " + value + " is found at index " + result + " of the array: " + Arrays.toString(numbers) );
                    }
            }
        }
        else if (input == 3 || input == 10){
            prompt = "Input the size of the array to be used.";
            int size = Utils.readInt(scanner, prompt, 1, 10000, false);
            String[] strings = Utils.readStringArray(scanner, size);
            switch (input){
                case 3 :
                    if (Algorithms.isUnique(strings) ) {
                        System.out.println("The elements of the array: " + Arrays.toString(strings) + " are unique. ");
                        break;
                    }
                    System.out.println("The elements of the array: " + Arrays.toString(strings) + " are not unique. ");
                case 10 :
                    prompt = "Input the keyword you want to search for:";
                    String target = Utils.readString(scanner, prompt);
                    int result = SearchAlgorithms.sequentialSearch(strings, target);
                    if ( result == -1){
                        System.out.println("The keyword '" + target + "' is not found in the array " + Arrays.toString(strings));
                        break;
                    }
                    System.out.println("The keyword '" + target + "' is found in the array " + Arrays.toString(strings));
            }
        }
        else if (input >= 6 && input <= 8) {
            prompt = "Input an integer to perform operation.";
            int result;
            int number = Utils.readInt(scanner, prompt, 1, 100000000, false);
            switch (input){
                case 6 :
//                    later update this with countBinaryDigitsIteratively
                    result = Algorithms.countBinaryDigits(number);
                    System.out.println("Counting the binary digits of " + number + " iteratively gives " + result);
                    break;
                case 7 :
                    result = Algorithms.countBinaryDigitsRecursively(number);
                    System.out.println("Counting the binary digits of " + number + " recursively gives " + result);
                    break;
                case 8 :
                    result = Algorithms.factorial(number);
                    System.out.println("The factorial of " + number + " is " + result);
            }
        }
    }

    public static int[] readIntArray(Scanner scanner, int size) {
        int[] numbers = new int[size];

        while (true) {
            System.out.print("\n Input " + size + " numbers (comma or space separated): ");
            String numbers_input = scanner.nextLine();
            String[] parts = numbers_input.trim().split("[,\\s]+");

            if (parts.length != size) {
                System.out.println(" Please enter exactly " + size + " numbers.");
                continue;
            }

            boolean valid = true;
            for (int i = 0; i < size; i++) {
                try {
                    numbers[i] = Integer.parseInt(parts[i]);
                } catch (NumberFormatException e) {
                    System.out.println(parts[i] + "' is not a valid integer.");
                    valid = false;
                    break;
                }
            }
            if (valid) {
                System.out.println(" Parsed: " + Arrays.toString(numbers));
                break;
            }
        }
        return numbers;
    }

}
