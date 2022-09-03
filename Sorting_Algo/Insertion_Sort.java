package Sorting_Algo;

import java.util.Arrays;

public class Insertion_Sort {

    // This sorting algorithm sorts elements in increase order
    // by inserting the 'j'-th element (or) 'i+1'-th element into
    // the left-hand side of the array making the left-hand side
    // section of the array as sorted.
    public static void insertion_Sort ( int [] arr ) {

        // The outer loop iterates till 'n-2' in total.

        // In first pass ( i.e., i = 0 ), the 'i'-th element and 'i+1'-th element gets sorted,
        // which results sorted array section where 2 elements are sorted w.r.t each other.

        // In second pass ( i.e., i = 1 ), we take the 'i+1'-th element and insert in sorted array
        // section such a way that even after inserting the element, that section should be in sorted order.
        // and at the end of this second pass we will have the sorted array section where 3 elements are
        // sorted w.r.t each other.

        // We repeat this process util the length of sorted array section is equal to array length.
        for(int i = 0; i < arr.length-1; i++) {

            // The inner loop takes the 'i+1'-th element of the array and iterates back into the
            // sorted section of the array to insert it ( 'i+1' element ) into a position by which
            // we end up with sorted section of the array.
            for (int j = i+1; j > 0; j--) {

                // We swap the element until it is placed in its rightful position in the sorted section
                // of the array.
                if( arr[j-1] > arr[j] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }

                // Once the element is placed in it rightful position, we don't need to check it with other
                // elements. Since, they all sorted and has smaller value compared to the inserted element.
                else {
                    break;
                }
            }
            // By the end of each inner loop, we will have one element sorted
            // in position w.r.t the left-hand side section i.e., the sorted section.
        }
        // By the end of outer loop,
        // the given array has been sorted by the algorithm.
    }

    public static void main(String[] args) {
        int [] arr = { 4, 99, -7, 49, 0, -11, -77};
        System.out.println("Unsorted Array : " + Arrays.toString(arr));
        insertion_Sort(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));
    }
}

//  Output:
//  ------
//        Unsorted Array : [4, 99, -7, 49, 0, -11, -77]
//        Sorted Array : [-77, -11, -7, 0, 4, 49, 99]
