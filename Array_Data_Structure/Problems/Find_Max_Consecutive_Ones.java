package Array_Data_Structure.Problems;

class Beginner_Solution_1 {

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int worstCase ( int [] nums ) {

        int max = 0, count = 0;

        for( int i : nums ){

            if( i == 1 ) {
                ++count;
                max = Math.max( max, count);
            }

            else {
                count = 0;
            }

        }
        return max;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int bestCase ( int [] nums ) {

        int max = 0, count = 0;

        for( int i : nums ){

            if( i == 0 ) {
                max = Math.max( max, count);
                count = 0;
            }

            else {
                ++count;
            }

        }

        return Math.max(max, count);
    }
}

public class Find_Max_Consecutive_Ones {

    public static void main(String[] args) {

        int [] test_case_1 = {1,1,0,1,1,1};
        int [] test_case_2 = {1,0,1,1,0,1};

        Beginner_Solution_1 sol = new Beginner_Solution_1();

        System.out.println( sol.worstCase(test_case_1) == 3 );
        System.out.println( sol.bestCase(test_case_2) == 2 );

    }
}

// Output:
//      true
//      true