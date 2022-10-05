package Array_Data_Structure.Problems;

import java.util.Arrays;

class Arrays_Solution_3 {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] worstCase (int[] nums) {
        int n = nums.length;
        int [] res = new int[n*2];
        for (int i = 0; i < n*2; i++) {     // Expensive Operation - multiplication
            res[i] = nums[i%n];             // Expensive Operation - modular division
        }
        return res;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int[] bestCase_1 (int[] nums) {
        int n = nums.length;
        int [] res = new int[n*2];          // Expensive Operation - multiplication but happens only once
        for (int i = 0; i < n; i++) {
            res[i] = nums[i];
            res[i+n] = nums[i];
        }
        return res;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    //
    // Best solution when 'nums.length' is a bigger value.
    // Roughly when the 'nums.length' > 24, according to benchmark.
    //
    // For more details check out,
    // https://stackoverflow.com/questions/18638743/is-it-better-to-use-system-arraycopy-than-a-for-loop-for-copying-arrays
    public int[] bestCase_2 (int[] nums) {
        int n = nums.length;
        int [] ans = new int[2 * n];
        System.arraycopy(nums, 0, ans, 0, n);
        System.arraycopy(nums, 0, ans, n, n);
        return ans;
    }
}

public class Concatenation_Of_Array {

    public static void main(String[] args) {
        int [] test_case_1 = {1,2,1};
        int [] test_case_2 = {1,3,2,1};

        Arrays_Solution_3 sol = new Arrays_Solution_3();

        System.out.println( Arrays.toString(sol.worstCase(test_case_1)).equals("[1, 2, 1, 1, 2, 1]"));
        System.out.println( Arrays.toString(sol.bestCase_1(test_case_2)).equals("[1, 3, 2, 1, 1, 3, 2, 1]"));
        System.out.println( Arrays.toString(sol.bestCase_2(test_case_2)).equals("[1, 3, 2, 1, 1, 3, 2, 1]"));
    }
}

// Output :
//      true
//      true
//      true