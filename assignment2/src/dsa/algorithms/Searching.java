package dsa.algorithms;

public class Searching {
    public int linearSearch(int[] array, int number){
        for (int i = 0; i < array.length; i++){
            if (array[i] == number){
                return i;
            }
        }
        return -1;
    }

    public int linearSearch(String[] array, String target){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals(target)){
                return i;
            }
        }
        return -1;
    }

    public int binarySearch (int[] array, int number){
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

    public int binarySearch (String[] array, String target){
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

    public int[] findAllOccurrences(int[] array, int target){
        int count = 0;
        for(int num : array){
            if (num == target){
                count++;
            }
        }

        int[] indexes = new int[count];
        int i = 0;
        for (int j = 0; j < array.length; j++){
            if(array[j] == target){
                indexes[i] = j;
                i++;
            }
        }
        return indexes;
    }

    public int[] findAllOccurrences(String[] array, String target){
        int count = 0;
        for(String string : array){
            if (string.equals(target)){
                count++;
            }
        }

        int[] indexes = new int[count];
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
