package dsa.utils;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {

    public static int readInt(Scanner scanner, String prompt, int min, int max, boolean forOptions){
        int input;

        while (true){
            System.out.println(prompt);
            System.out.print("Input (" + min + "-" + max + "): ");
            if (scanner.hasNextInt()){
                input = scanner.nextInt();
                scanner.nextLine();
                if (input == 99 && forOptions){
                    System.exit(0);
                }
                if (input < min || input > max ){
                    System.out.println(" \n Invalid Input!!\n   Input must be between " + min + " and " + max +" \n");
                } else {
                    return input;
                }
            } else {
                System.out.println( " \n Invalid Input!!\n   That's not a number. Try again.\n");
                scanner.next();
            }
        }
    }

    public static String readString(Scanner scanner, String prompt){
        String input;
        System.out.println(prompt);
        System.out.print("Input: ");
        input = scanner.nextLine();
        return input;
    }

    public static Integer[] readIntArray(Scanner scanner, int size) {
        Integer[] numbers = new Integer[size];

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
                System.out.println(" Numbers: " + Arrays.toString(numbers));
                break;
            }
        }
        return numbers;
    }

    public static String[] readStringArray (Scanner scanner, int size){
        String[] strings = new String[size];
        while (true){
            System.out.print("\n Input " + size + " characters/strings (comma or space separated): ");
            String string_input = scanner.nextLine();
            String[] parts = string_input.trim().split("[,\\s]+");
            if(parts.length != size){
                System.out.println(" Please enter exactly " + size + " characters.");
                continue;
            }
            System.arraycopy(parts, 0, strings, 0, size);
            break;
        }
        return strings;
    }

    public static double[][] readDoubleMatrix (Scanner scanner, int row, int col){
        double[][] matrix = new double[row][col];
        for ( int r = 0; r < row; r++ ) {
            while (true) {
                System.out.print("Input " + col + " numbers (comma or space separated)... ROW_" + r + ": ");
                String numbers_input = scanner.nextLine();
                String[] parts = numbers_input.trim().split("[,\\s]+");

                if (parts.length != col) {
                    System.out.println(" Please enter exactly " + col + " numbers.");
                    continue;
                }
                boolean valid = true;
                for (int c = 0; c < col; c++) {
                    try {
                        matrix[r][c] = Integer.parseInt(parts[c]);
                    } catch (NumberFormatException e) {
                        System.out.println("'" + parts[c] + "' is not a valid integer.");
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    break;
                }
            }
        }
        System.out.println("The matrix you entered: ");
        for(int r = 0; r < row; r++){
            System.out.println(" ROW_" + r + " " + Arrays.toString(matrix[r]));
        }
        return matrix;
    }
}
