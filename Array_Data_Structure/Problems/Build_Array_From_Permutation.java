package Array_Data_Structure.Problems;

import java.util.Arrays;

public class Build_Array_From_Permutation {

    // Time complexity: O(n)
    // Space complexity: O(n)
    public static int[] buildArray (int[] nums) {
        int [] res = new int [nums.length];
        for( int i = 0; i < nums.length; ++i )
            res[i] = nums[nums[i]];
        return res;
    }

    public static void main(String[] args) {
        int [] test_case_1 = {0,2,1,5,3,4};
        int [] test_case_2 = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(test_case_1)).equals("[0, 1, 2, 4, 5, 3]"));
        System.out.println(Arrays.toString(buildArray(test_case_2)).equals("[4, 5, 0, 1, 2, 3]"));
    }
}

// Output :
//      true
//      true