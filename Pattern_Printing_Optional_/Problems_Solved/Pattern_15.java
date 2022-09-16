package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_15 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        int total_row = n*2 - 1;

        for (int i = 0; i <= total_row; i++) {

            if( i == n )
                continue;

            int max = ( i < n ) ? n-i-1 : i-n  ;

            for (int j = 0; j < max; j++) {
                System.out.print(" ");
            }

            max = (i < n) ? i*2 : (total_row - i )*2 ;

            for (int j = 0; j <= max; j++) {
                System.out.printf("%s", ( j == 0 || j == max ) ? "*" : " ");
            }

            System.out.println();
        }

    }

}

//  Output:-
//  -------
//         *
//        * *
//       *   *
//      *     *
//     *       *
//      *     *
//       *   *
//        * *
//         *