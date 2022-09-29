package Array_Data_Structure.Problems;

import java.util.Arrays;

public class Running_Sum {

    // Time Complexity : O(n)
    // Space Complexity : O(n)
    public static int[] worstCase(int[] nums){

        int count = 0;
        int [] result = new int[nums.length];

        for( int i = 0; i < nums.length; ++i ){
            count += nums[i];
            result[i] = count;
        }

        return result;

    }

    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static int[] bestCase(int[] nums){

        for( int i = 1; i < nums.length; ++i ) {
            nums[i] += nums[i-1];
        }

        return nums;
    }



    public static void main(String[] args) {

        int [] test_case_1 = {1,2,3,4};
        int [] test_case_2 = {1,1,1,1,1};
        int [] test_case_3 = {3,1,2,10,1};

        System.out.println( Arrays.toString(worstCase(test_case_1)).equals("[1, 3, 6, 10]") );
        System.out.println( Arrays.toString(bestCase(test_case_2)).equals("[1, 2, 3, 4, 5]") );
        System.out.println( Arrays.toString(bestCase(test_case_3)).equals("[3, 4, 6, 16, 17]") );

    }
}

// Output:
// ------
//
//    True
//    True
//    True
