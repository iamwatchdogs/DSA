package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_13 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i * 2; j++) {
                System.out.printf("%s", ( j > 0 && j < i*2 && i != n-1) ? " " : "*");
            }

            System.out.println();
        }

    }

}

//  Output:-
//  -------
//          *
//         * *
//        *   *
//       *     *
//      *********