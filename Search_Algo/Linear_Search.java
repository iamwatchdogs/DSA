package Search_Algo;

import java.util.Arrays;

public class Linear_Search {

    // Basic iterative Linear search which return the index if the target element is found, else returns -1
    public static int search_1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == target )
                return i;
        }
        return -1;
    }

    // Basic iterative Linear search which return the element if the target element is found, else returns -1
    public static int search_2(int[] arr, int target) {
        for (int i : arr) {
            if (i == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] arr = {1, 55, 98, 89, 45, -6};
        int target = 98;
        int ans = search_1(arr, target);

        System.out.println("Return Index:");
        System.out.println("\tArray: " + Arrays.toString(arr) + "\n\tTarget: " + target +  "\n\tAns: " + ans);

        ans = search_2(arr, target);
        System.out.println("Return value:");
        System.out.println("\tArray: " + Arrays.toString(arr) + "\n\tTarget: " + target +  "\n\tAns: " + ans);

    }

}

//  Output:-
//  -------
//
//        Return Index:
//        Array: [1, 55, 98, 89, 45, -6]
//        Target: 98
//        Ans: 2
//        Return value:
//        Array: [1, 55, 98, 89, 45, -6]
//        Target: 98
//        Ans: 98
