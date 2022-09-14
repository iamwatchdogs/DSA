package Pattern_Printing_Optional_.Problems_Solved;

public class Pattern_4 {

    public static void main(String[] args) {
        int n = 5;
        print_Pattern(n);
    }

    public static void print_Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }

}

//  Output:-
//  -------
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5