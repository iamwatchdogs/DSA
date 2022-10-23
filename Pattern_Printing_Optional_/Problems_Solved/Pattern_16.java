package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_16 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0, value = 1; j <= i ; j++) {

                value = ( i == 0 || j == 0 ) ? 1 : (value*(i-j+1))/j;

                System.out.print( value + "   ");

            }

            System.out.println();
        }

    }

}

//  Output:-
//  -------
//              1
//            1   1
//          1   2   1
//        1   3   3   1
//      1   4   6   4   1