/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arrays;

/**
 *
 * @author Saaduddin
 */
public class IntArray {

    private int[] arr;

    public IntArray(int[] arr) {
        this.arr = arr;
    }

    public String Print() {
        String s = "(";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + ", ";
        }
        s += ")";
        return s;
    }

    private static void Print(int[] arr) {
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ",");
        }
        System.out.println("---");
    }

    public boolean equals(IntArray other) {
        //checks if IntArray Classes are equal
        if (other.arr.length != this.arr.length) {
            return false;
        }

        for (int i = 0; i < other.arr.length; i++) {
            if (other.arr[i] != arr[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean equals(int[] arr) {
        //checks if arrays of the two classes are equal
        IntArray other = new IntArray(arr);
        return this.equals(other);
    }

    public IntArray clone() {
        //duplicates a copy of given IntArray
        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return new IntArray(copy);
    }

    public int at(int i) {
        //returns element at index i 
        return arr[i];
    }

    public void reverse() {
        //reverses an integer array
        if (arr.length == 0) {
            return;
        }

        for (int i = 0; i < arr.length / 2; i++) {
            swap(i, arr.length - 1 - i);
        }
    }

    public void swap(int i, int j) {
        //simple temp swap
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }

    public IntArray subArray(int start, int count) {
        //returns sub-array given a starting index and 'count' # of values
        int[] subArr = new int[count];
        for (int i = start; i < start + count; i++) {
            subArr[i - start] = arr[i];
        }

        return new IntArray(subArr);

    }

    public int minIndex() {
        //returns index of the smallest element in array
        if (arr.length == 0) {
            return -1;
        }
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }
        return min;
    }

    public int maxIndex() {
        //returns index of the largest element in array
        if (arr.length == 0) {
            return -1;
        }
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    public int indexOf(int n) {
        //returns the index of a given element, if not there returns -1
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }

    public int countOf(int n) {
        //returns the count of a specific element's occurence in an array
        if (arr.length == 0) {
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                count++;
            }
        }

        return count;
    }

    public boolean isConsecutive() {
        //returns true if the elements are in ascending order by +1
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public int findHoleCount() {
        if (arr.length == 0) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                count++;
            }
        }
        return count;
    }

    public int findBiggestHole() {
        if (arr.length == 0) {
            return 0;
        }

        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                if (arr[i + 1] - arr[i] > max) {
                    max = arr[i + 1] - arr[i];
                }
            }
        }

        if (max != 0) {
            return max - 1;
        } else {
            return max;
        }
    }

    public IntArray rotate(int count) {
    //rotates integer array count number of spaces
        if (arr.length == 0) {
            return new IntArray(arr);
        }
        //example count=3;
        int newArr[] = new int[arr.length];

        for (int j = 0; j < count; j++) {
            newArr[j] = arr[arr.length - count + j];
            //System.out.print(newArr[j]+",");
        }

        for (int i = 0; i < arr.length - count; i++) {
            newArr[count + i] = arr[i];
            //System.out.print(newArr[i]+",");
        }

        return new IntArray(newArr);
    }

    public boolean isSorted() {
    	//checks if array is sorted 
        if (arr.length == 0) {
            return true;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static int[] concat(int[] a, int[] b) {
    	//merges two arrays together
        int newArr[] = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            newArr[i] = a[i];
        }

        for (int j = 0; j < b.length; j++) {
            newArr[a.length + j] = b[j];

        }

        return newArr;

    }

    public void move(int from, int to) {
    	//moves an element from a specific index to another
        int temp = arr[from];
        for (int i = to; i < from; i++) {
            arr[i + 1] = arr[i];
        }

        arr[to] = temp;
            //System.out.print("temp = " + temp + ": ");
        //Print(arr);

    }

    public static void spiralPrint(int[][] arr, int rows, int columns) {

    	//prints the 2-D array in spiral form
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = columns - 1;
        int direction = 0;
        System.out.println();

        while (top <= bottom && left <= right) {
            if (direction == 0) {
                for (int i = left; i <= right; i++) {
                    System.out.print(arr[top][i] + ",");
                }
                top++;
                direction = 1;
                
            } else if (direction == 1) {
                for (int j = top; j <= bottom; j++) {
                    System.out.print(arr[j][right] + ",");
                    
                }
                right--;
                 direction = 2;
                 
            } else if (direction == 2) {
                for (int k = right; k >= left; k--) {
                    System.out.print(arr[bottom][k] + ",");
                    
                }
                bottom--;
                direction = 3;
                
            } else if (direction == 3) {
                for (int l = bottom; l >= top; l--) {
                    System.out.print(arr[l][left] + ",");                
            }
                left++;  
                direction = 0;
            
            }
        } 
    }
}
