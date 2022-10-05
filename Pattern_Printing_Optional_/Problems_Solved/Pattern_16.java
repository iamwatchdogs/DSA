package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_16 {

    public static void main(String[] args) {
        int n = 7;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0, value; j <= i ; j++) {

                value = sumOfNNaturalNumbers( (j <= i/2) ? j+1 : i-j+1 );

                System.out.print( value + "   ");

            }

            System.out.println();
        }

    }

    public static int sumOfNNaturalNumbers( int n ) {
        return n*(n+1)/2;
    }

}

//  Output:-
//  -------
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1