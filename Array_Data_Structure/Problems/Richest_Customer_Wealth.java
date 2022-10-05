package Array_Data_Structure.Problems;

import java.util.Arrays;

class Easy_Solution_4 {

    // Time complexity: O(n)    /* n = (accounts.no_of_rows * accounts.no_of_cols) elements*/
    // Space complexity: O(n)   /* T(n/2) -> O(n) */
    public int worstCase ( int[][] accounts ) {

        int counter = 0;
        int [] temp = new int[accounts.length];

        for (int [] i : accounts) {
            int sum = 0;
            for( int j : i ) {
                sum += j;
            }
            temp[counter++] = sum;
        }

        Arrays.sort(temp);

        int res = temp[temp.length - 1];

        return res;
    }

    // Time complexity: O(n)    /* n = (accounts.no_of_rows * accounts.no_of_cols) elements*/
    // Space complexity: O(1)
    public int bestCase ( int[][] accounts ) {

        int res = 0;

        for (int[] account : accounts) {

            int sum = 0;

            for (int i : account) {
                sum += i;
            }

            if (sum > res) res = sum;   // res = Math.max( res, sum);
        }
        return res;
    }

}
public class Richest_Customer_Wealth {
    public static void main(String[] args) {

        int [][] test_case_1 = { {1,2,3}, {3,2,1} };
        int [][] test_case_2 = { {1,5}, {7,3}, {3,5} };
        int [][] test_case_3 = { {2,8,7}, {7,1,3}, {1,9,5} };

        Easy_Solution_4 sol = new Easy_Solution_4();

        System.out.println( sol.worstCase(test_case_1) == 6 );
        System.out.println( sol.bestCase(test_case_2) == 10 );
        System.out.println( sol.bestCase(test_case_3) == 17 );
    }

}

// Output :
//      true
//      true
//      true