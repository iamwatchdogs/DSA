package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_14 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (n-i)*2 - 1; j++) {
                System.out.printf("%s", ( i != 0 && j > 0 && j + 1 < (n-i)*2 - 1   ) ? " " : "*");
            }

            System.out.println();
        }

    }

}

//  Output:-
//  -------
//      *********
//       *     *
//        *   *
//         * *
//          *