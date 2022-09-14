package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_5 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n*2; i++) {

            int max = ( i > n ) ? (n*2)-i-1 : i;

            for (int j = 0; j <= max; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}

//  Output:-
//  -------
//
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        ****
//        ***
//        **
//        *