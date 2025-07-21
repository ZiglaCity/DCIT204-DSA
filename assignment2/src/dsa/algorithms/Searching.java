package dsa.algorithms;
import java.util.Arrays;

public class Searching {
    public static int linearSearch(Integer[] array, int number){
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

//    public static <T> linearSearch(int[] array, int number){
//        for (int i = 0; i < array.length; i++){
//            if (array[i] == number){
//                return i;
//            }
//        }
//        return -1;
//    }

    public static int linearSearch(String[] array, String target){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch(Double[] array, double target){
        for (int i = 0; i < array.length; i++){
            if (array[i] == (target)){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (Integer[] array, int number){
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (array[mid] < number){
                left = mid + 1;
            }
            else if( array[mid] > number){
                right = mid - 1;
            }
            else return mid;
        }
        return left;
    }

    public static int binarySearch (String[] array, String target){
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (array[mid].compareTo(target) < 0){
                left = mid + 1;
            }
            else if( array[mid].compareTo(target) > 0){
                right = mid - 1;
            }
            else return mid;
        }
        return left;
    }

    public static int binarySearch (Double[] array, double target){
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while (left <= right){
            int mid = (right + left) / 2;
            if (array[mid] < target){
                left = mid + 1;
            }
            else if( array[mid] > target){
                right = mid - 1;
            }
            else return mid;
        }
        return left;
    }

    public static Integer[] findAllOccurrences(Integer[] array, int target){
        int count = 0;
        for(int num : array){
            if (num == target){
                count++;
            }
        }

        Integer[] indexes = new Integer[count];
        int i = 0;
        for (int j = 0; j < array.length; j++){
            if(array[j] == target){
                indexes[i] = j;
                i++;
            }
        }
        return indexes;
    }

    public static Integer[] findAllOccurrences(String[] array, String target){
        int count = 0;
        for(String string : array){
            if (string.equals(target)){
                count++;
            }
        }

        Integer[] indexes = new Integer[count];
        int i = 0;
        for (int j = 0; j < array.length; j++){
            if(array[j].equals(target)){
                indexes[i] = j;
                i++;
            }
        }
        return indexes;
    }

}
