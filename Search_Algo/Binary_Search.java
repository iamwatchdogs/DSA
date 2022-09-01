package Search_Algo;

import java.util.Arrays;

public class Binary_Search {

    // basic binary search algorithm which still has its limitations i.e.,
    // applicable to only array which is sorted either in increasing or
    // decreasing order. ( below code is only for increasing ordered array )
    public static int naive_binary_search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while( start <= end ) {
            int mid = start+(end-start)/2;
            if( arr[mid] == target )
                return mid;
            else if( arr[mid] > target )
                end = mid-1;
            else
                start = mid+1;
        }
        return -1;
    }

    // Implementation of basic binary search algorithm Recursively
    public static int naive_rec_binary_search(int[] arr, int target, int start, int end) {
        int mid = start+(end-start)/2;
        if( start <= end ) {
            if( arr[mid] == target )
                return mid;
            else if ( arr[mid] > target )
                return naive_rec_binary_search( arr, target, start, mid-1);
            else
                return naive_rec_binary_search( arr, target, mid+1, end);
        }
        return -1;
    }

    // Order Agnostic binary search is improved binary search which is used when
    // we know the given array is sorted, but we don't know whether it's in
    // increasing order or decreasing order
    public static int order_Agnostic_Binary_Search(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isInc = ( arr[start] < arr[end] );
        while( start <= end ) {
            int mid = start+(end-start)/2;
            if( arr[mid] == target )
                return mid;
            if( isInc ) {
                if( arr[mid] < target )
                    start = mid+1;
                else
                    end = mid-1;
            }
            else {
                if( arr[mid] < target )
                    end = mid-1;
                else
                    start = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int [] arr1 = { -8, -1, 0, 9, 15, 23, 45, 68, 79, 99, 111 };
        int [] arr2 = { 121, 97, 73, 68, 54, 20, 16, 4, 0, -3, -12};
        int target = 68;
        int ans;

        System.out.println("Array1: " + Arrays.toString(arr1));
        System.out.println("Array2: " + Arrays.toString(arr2));

        // Naive Method
        System.out.println("The Basic Naive method:");
        ans = naive_binary_search( arr1, target );
        System.out.println("\ttarget: "+target+", Index: "+ans);

        // Naive Method ( recursive )
        System.out.println("\nThe Basic Naive ( Recursive ) method:");
        ans = naive_rec_binary_search( arr1, target, 0, arr1.length-1 );
        System.out.println("\ttarget: "+target+", Index: "+ans);

        // Order Agnostic binary search
        System.out.println("\nOrder Agnostic method:");
        ans = order_Agnostic_Binary_Search( arr1, target );
        System.out.println("\ttarget: "+target+", Index: "+ans);
        ans = order_Agnostic_Binary_Search( arr2, target );
        System.out.println("\ttarget: "+target+", Index: "+ans);

    }

}

//  Output:-
//  ------
//        Array1: [-8, -1, 0, 9, 15, 23, 45, 68, 79, 99, 111]
//        Array2: [121, 97, 73, 68, 54, 20, 16, 4, 0, -3, -12]
//        The Basic Naive method:
//        target: 68, Index: 7
//
//        The Basic Naive ( Recursive ) method:
//        target: 68, Index: 7
//
//        Order Agnostic method:
//        target: 68, Index: 7
//        target: 68, Index: 3
