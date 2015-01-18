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
public class IntArrayTester {

    public static void main(String[] args) {
//        testReverse();
//        testClone();
//        testSubArray();
//        testMaxIndex();
//        testMinIndex();
//        testIndexOf();
//        testCountOf();
//        testIsConsecutive();
//        testFindHoleCount();
//        testFindBiggestHole();
//        testRotate();
//        testIsSorted();
test_SpiralPrint();     
    
    }
    

     public static void testReverse() {
        IntArray arr = new IntArray(new int[]{1, 2, 3, 4, 5});
        IntArray rev = new IntArray(new int[]{5, 4, 3, 2, 1});
        System.out.println(arr.Print());

        arr.reverse();
        System.out.println(arr.equals(rev));
        //System.out.println(arr.Print());
    }

     public static void testClone() {
        IntArray arr = new IntArray(new int[]{2, 4, 6, 8, 10});
        IntArray newArr = arr.clone();
        System.out.println(arr.equals(newArr));
    }

     public static void testSubArray() {
        IntArray arr = new IntArray(new int[]{10, 20, 30, 40, 50, 60, 70, 80});

        System.out.println(arr.subArray(3, 0).equals(new int[]{}));
    }

     public static void testMaxIndex() {
        IntArray arr = new IntArray(new int[]{0, -1, 2, 10, 30, 6, 5});
        System.out.println(arr.maxIndex());
    }

     public static void testMinIndex() {
        IntArray arr = new IntArray(new int[]{0, -1, 2, 10, 30, 6, 5});
        System.out.println(arr.minIndex());
    }
    
     public static void testIndexOf() {
        IntArray arr = new IntArray(new int[]{});
        System.out.println(arr.indexOf(45));
       
    }
     
     public static void testCountOf() {
        IntArray arr = new IntArray(new int[]{1,3,5,5,3,3,3,3,5,6,7});
        System.out.println(arr.countOf(3));
     }
     
     public static void testIsConsecutive() {
        IntArray arr = new IntArray(new int[]{1,2,4,5,6,7});
        System.out.println(arr.isConsecutive());
     }
    
     public static void testFindHoleCount() {
        IntArray arr = new IntArray(new int[]{1,2,4,6,7,9});
        System.out.println(arr.findHoleCount());
     }
     
     public static void testFindBiggestHole() {
        IntArray arr = new IntArray(new int[]{1,2,9,15});
        System.out.println(arr.findBiggestHole());
     }
     
     public static void testRotate() {
        IntArray arr = new IntArray(new int[]{1,2,3,4,5,6,7,8});
        System.out.println(arr.rotate(3));
     }
     
     public static void testIsSorted()
     {
        IntArray arr = new IntArray(new int[]{-1,0,1});
        System.out.println(arr.isSorted());
     }
     
     public static void testMove()
     {
        IntArray arr = new IntArray(new int[]{-1,0,1});
        System.out.println(arr.isSorted());
     }
     
     public static void test_SpiralPrint(){
        int arr [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};     
     
     IntArray.spiralPrint(arr, 5,4);
     }
     
}
