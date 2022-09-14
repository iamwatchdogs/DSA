package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_3 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

//  Output:-
//  -------
//        *****
//        ****
//        ***
//        **
//        *

