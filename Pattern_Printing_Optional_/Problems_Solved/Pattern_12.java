package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_12 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n*2; i++) {

            int max = ( i < n ) ? i : n*2 - i - 1;

            for (int j = 0; j < max; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - max; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

}

//  Output:-
//  -------
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *