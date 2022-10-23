package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_17 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 1; i < (n - 1) * 2; i++) {

            int counter = (i < n - 1) ? n - 2 - i  : i - n;

            for (int j = 0; j <= counter; j++) {
                System.out.print(" ");
            }

            counter = (i < n) ? (i-1)*2  : 4*n - 2*i - 6;
            // { ((n - 1) * 2 - i - 1)*2 } -> { 4*n - 2*i - 6 }

            for (int j = 0, value = 0; j <= counter; j++) {

                if( i < n )
                    value = ( counter >= j*2 ) ? i-j : ++value;
                else
                    value = ( counter >= j*2 ) ? counter/2 + 1 - j : ++value;

                System.out.print( value );
            }

            System.out.println();
        }
    }
}


//  Output:-
//  -------
//         1
//        212
//       32123
//      4321234
//       32123
//        212
//         1
