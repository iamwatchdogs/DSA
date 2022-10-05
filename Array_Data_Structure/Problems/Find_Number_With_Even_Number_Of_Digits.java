package Array_Data_Structure.Problems;

class Beginner_Solution_2 {

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int worstCase ( int [] nums ) {
        int count = 0;
        for( int i : nums ) {
            String temp = Integer.toString(i);
            if( temp.length()%2 == 0 ) ++count;
        }
        return count;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int averageCase ( int [] nums ) {
        int count = 0;
        for( int i: nums ){
            if( hasEvenNumberOfDigits(i) ) ++count;
        }
        return count;
    }

    public boolean hasEvenNumberOfDigits(int n) {
        int count = 0;
        while( n > 0 ) {
            n /= 10;
            ++count;
        }
        return (count%2 == 0);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int bestCase_1 ( int [] nums ) {
        int count = 0;
        for( int i: nums ){
            if( ( (int)Math.log10(i) + 1 ) % 2 == 0 ) ++count;
        }
        return count;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    //
    // Even though, it gives good in terms of performance wise
    // we shouldn't implement any algorithm such a way.
    //
    // But, This is one good example which suggest you to keep
    // an eye out for the constraint specified in the problem.
    public int bestCase_2 ( int [] nums ) {
        int count = 0;
        for( int i : nums ) {
            if( i > 9 && i < 100 || i > 999 && i < 10000 ) ++count;
        }
        return count;
    }
}

public class Find_Number_With_Even_Number_Of_Digits {

    public static void main(String[] args) {

        int [] test_case_1 = {12,345,2,6,7896};
        int [] test_case_2 = {555,901,482,1771};

        Beginner_Solution_2 sol = new Beginner_Solution_2();

        System.out.println( sol.worstCase(test_case_1) == 2 );
        System.out.println( sol.averageCase(test_case_1) == 2 );
        System.out.println( sol.bestCase_1(test_case_2) == 1 );
        System.out.println( sol.bestCase_2(test_case_2) == 1 );
    }

}

// Output:
//      true
//      true
//      true
//      true