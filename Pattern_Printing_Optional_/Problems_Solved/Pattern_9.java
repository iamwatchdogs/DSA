package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_9 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            int max = n * 2 - i - 1;

            for (int j = i; j < max  ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

//  Output:-
//  -------
//    *********
//     *******
//      *****
//       ***
//        *
