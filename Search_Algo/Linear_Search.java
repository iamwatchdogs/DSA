package Search_Algo;

import java.util.Arrays;

public class Linear_Search {
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

    public static int search_1(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == target )
                return i;
        }
        return -1;
    }
    public static int search_2(int[] arr, int target) {
        for (int i : arr) {
            if (i == target)
                return i;
        }
        return -1;
    }
}

