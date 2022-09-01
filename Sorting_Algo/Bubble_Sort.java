package Sorting_Algo;

import java.util.Arrays;

public class Bubble_Sort {

    // This is a simple ordinary Bubble sort which sort the given array in increasing order.
    public static void originalBinarySearch(int[] arr) {

        // This loop is used to tell the number of passes it will take to sort
        for (int i = 0; i < arr.length-1; i++) {

            // This loop will bring the largest element to the right-most end
            // the array ( the sorted part ) for each pass/ i-th iteration.
            for (int j = 1; j < arr.length - i; j++) {

                // Swapping if the previous j-th element is
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                // End of Swapping
            }
            // End of i-th iteration i.e.,
            // the largest element of i-th unsorted part has reach the right-most end of-
            // -the array which means that the largest element of i-th iteration is sorted.
        }
        // End of Sorting
    }

    // This is an improvised version of bubble sort. If we give a sorted / semi-sorted array
    // then the original implementation will iterate throughout ~ n^2 passes before it ends.
    // but the below implementation will end the process as soon as it recognizes that given array
    // is sorted (or) the given semi-sorted array has finished sorting, it ends the program.
    // So to find whether the given array is sorted or the given semi-sorted array is sorted or not,
    // we check the occurrences of swapping. If there is at least one swapping in the whole i-th iteration
    // ( i.e., during execution of j-th loop ), then we consider there might be a possibility for the array
    // still being unsorted. BUT, if there is NO occurrence throughout the whole i-th iteration then we can
    // assume that the given array is a sorted array (or) the semi-sorted array has been sorted.
    public static void improvisedBubbleSort(int [] arr ) {

        for (int i = 0; i < arr.length - 1; i++) {
            boolean not_A_Single_Swap = true;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    not_A_Single_Swap = false;
                }
            }
            if(not_A_Single_Swap)
                break;
        }
    }

    public static void main(String[] args) {

        // Testing out regular bubble sort
        int [] arr = { -9, 9, 75, 0, -54, 31, 11, 4};
        System.out.println("Testing out regular bubble sort:-");
        System.out.println("\nUnsorted Array : " + Arrays.toString(arr) );
        originalBinarySearch(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr) );

        // Testing out the improvised bubble sort using sorted
        System.out.println("\nTesting out the improvised bubble sort using sorted:-");
        arr = new int[] { 1, 8, 9, 16, 19, 29, 30, 49};
        System.out.println("\nUnsorted Array (Assume) : " + Arrays.toString(arr) );
        improvisedBubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr) + " ( Took only single pass to compute )");

        // Testing out the improvised bubble sort using semi-sorted
        System.out.println("\nTesting out the improvised bubble sort using semi-sorted:-");
        arr = new int[] { 0, 3, 19, 14, 291, 30, 49};
        System.out.println("\nUnsorted Array : " + Arrays.toString(arr) );
        improvisedBubbleSort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr) + " ( Took only two passes to compute )" );
    }

}

//  Output:-
//
//        Testing out regular bubble sort:-
//
//        Unsorted Array : [-9, 9, 75, 0, -54, 31, 11, 4]
//        Sorted Array : [-54, -9, 0, 4, 9, 11, 31, 75]
//
//        Testing out the improvised bubble sort using sorted:-
//
//        Unsorted Array (Assume) : [1, 8, 9, 16, 19, 29, 30, 49]
//        Sorted Array : [1, 8, 9, 16, 19, 29, 30, 49] ( Took only single pass to compute )
//
//        Testing out the improvised bubble sort using semi-sorted:-
//
//        Unsorted Array : [0, 3, 19, 14, 291, 30, 49]
//        Sorted Array : [0, 3, 14, 19, 30, 49, 291] ( Took only two passes to compute )

