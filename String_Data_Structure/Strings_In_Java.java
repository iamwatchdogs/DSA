package String_Data_Structure;

import java.util.ArrayList;
import java.util.Arrays;

public class Strings_In_Java {

    // String(s) is/are a type of data structure which basically (Internally) uses
    // the concepts of "Arrays" to store a set/collection of characters in an
    // efficient way for even better and effective usage of set of characters.

    // In Java, we use mainly two different class to for maintain the string data
    // structure, and they are 'String' class, 'StringBuilder' class.

    // Lets us start with very basics of this String data structure in Java.
    // The Declaration, Initialization of this data structure.
    public static void string_Declaration () {

        System.out.println("Concept: String Declaration.\n");

        // If you are familiar with basic OOPS concepts of Java,
        // Then you might know that the declaration of any object of any class in Java
        // takes places as follows :
        //
        //          Class_Name object_name = new Class_Name();
        //          ---------- -----------   ----------------
        //              ^           ^               ^
        //              |           |               |
        //          Reference  |  Object    |   The Actual
        //         Object Type | Reference  |     Object
        //                                  |
        //         {     Stack Memory     } | {  Heap Memory }

        // By now, you might be knowing that the original object which is created using
        // the 'Class_Name' & the 'object_name' is not the actual object itself.
        // It's just a reference variable which refers (or) points towards the original
        // object allocated within the heap memory.

        // So, how does this 'String' class allocate memory to a given set of characters ???...
        //
        // We can think of it two ways:
        //      1) The different reference variables -- pointing to --> A same location where there
        //                                                              is same set of data.
        //                                                  (or)
        //      2) Different reference variables -- pointing to --> differently allocated data location
        //                                                          in heap ( even thought they are same ).
        //
        // For a short Answer, it's the first method. The Java 'String' class stores the given data in
        // special storage area called "String Pool". The internal working of this string pool is that,
        // for a better storage management, the string pool will point (or) returns the object reference
        // location when it comes across a new declaration of a String variable containing the set of
        // character which already exists in this special memory area called "String Pool".

        // When ever we give a declaration as shown below, will be stored in this String Pool.

        String name = "Sam";
        String your_friend_name = "Sam";

        // Here, the variable String object 'name' and 'your_friend_name' are pointing towards same
        // location where the memory is allocated to the data "Sam".
        // We can check this by using a Relational operator ( == ), just as shown below,

        System.out.println( "\t1) Result of " + name + " == " + your_friend_name + " is " + ( name == your_friend_name ) );

        // The above example will eventually return "true", say that both the variable points to the same
        // object physical location in String pool ( which is present inside the Heap memory ).

        // Why the 'String' in Java are immutable ???...
        //
        // Since we have discussed the concept of "String pool", lets talk a little about the reason behind
        // immutability of the String class objects in Java ( immutable means we can change the assigned data ).
        // We know that data/Object inside "String pool" can have more that on referencing variable pointing to it.
        // And suppose the Strings are mutable, then modifying the data from one referencing variable will change the
        // entire data itself and the other referencing variable might face issues due to this modification done by a
        // single referencing variable. So, it's better if the Strings stay are immutable this results in better
        // memory management and stuff.

        // There is another way we can declare the String object i.e., the traditional way we declare an object of a class.
        // Just as shown below,

        String my_name = new String("Sam");
        String you_can_call_me = new String("Sam");

        // But the problem with this is that, Since we declare them using 'new' keyword it will allocate memory directly
        // inside the Heap memory but NOT inside the "String Pool".
        // Which means ( in the example ) the variable 'my_name' and 'you_can_call_me' are allocated in different location
        // despite having same value. we can check this by using a Relational operator ( == ), just as shown below,

        System.out.println( "\t2) Result of " + my_name + " == " + you_can_call_me + " is " + ( my_name == you_can_call_me ) );

        // The above statement will return "false" as they are allocated in different location in Heap memory. But, If you
        // wish to check the value they are containing is equal or not, you can use the String class method 'equals',
        // Just as shown below,

        System.out.println( "\t3) Result of " + my_name + ".equals(" + you_can_call_me + ") is " + ( my_name.equals(you_can_call_me) ) );

        // The above statement returns "true" as "equals()" method checks the content inside the Objects instead of their
        // referencing object location.

    }


    // Now that we have understood the basic concept of Strings,
    // Lets see how the basic output function/method operates on Strings.
    public static void print_Streaming_Of_Strings () {

        System.out.println("Concept: PrintSteam / Output of String on consoles.\n");

        // The most of the programs we write has a basic method ( apart from main() ) and that is,
        //      System.out.println();
        // without this function, we are unable to see our result (or) even debug it.
        // for example,

        System.out.println("\t1) Printing Different types of data,");

        System.out.print("\t\t# ");
        System.out.println(35);         /* Primitive (Integer) data type */

        System.out.print("\t\t# ");
        System.out.println("Hello World");  /* String Object */

        System.out.print("\t\t# ");
        System.out.println(new int[] {1,2,3,4});    /* an (Integer) Array Object */

        System.out.print("\n");

        // All the above statements are going to be converted into strings before they are displayed
        // on the output console. The internal working behind this "println()" method of the "out" object       /* I have mentioned all
        // of class 'PrintStream' which is present inside the "System" class is that, it implicitly calls          parts of this method,
        // "toString" method to convert whatever the given input into String, so that it could be displayed        it's okay, if you
        // on to the output console. ( console is basic a base where you can interact with the program             don't understand it
        // something like terminal where you execute the program by providing the input )                          completely.        */

        // Lets us discuss more about the "toString()" method.
        // Let's just quickly recap the above explanation,
        //
        //      System.out.println(...);
        //                 -------
        //                    |
        //             calls the method
        //                    |                 /*  from
        //                    V                     PrintStream Class  */
        //            String.valueOf(...);
        //                    |                 /* from
        //                    V                    String Class  */
        //                 toString(...);

        // We can use this method directly also,
        // for example,

        System.out.println("\t2) toSting(),");

        System.out.print("\t\t# ");
        System.out.println( Arrays.toString(new int[] {1,2,3,4}) );    /* an (Integer) Array Object */

        System.out.print("\t\t# ");
        System.out.println( Integer.toString(new Integer(45)) );    /* an (Integer) Wrapper class Object */


    }


    // Since we have learnt the internal working of println() method.
    // Lets us take up closer look at how the concatenation operator plays a key role in println() method.
    public static void string_Concatenation_Operator () {

        System.out.println("Concept: String Concatenation Operator.\n");

        // Remember that any input is given to the println() method, it would convert it into String before it actually
        // prints it on the console.

        // But there are certain factors you need to consider too, because before the println() method coverts it into
        // String to print it evaluates the statement, and then it will convert it into string, and then it will display
        // the output to the console. So, You should be careful while using the println() method.

        // Lets us take few examples to understand the concept practically,

        System.out.println("\tDifferent outputs from println() method,");

        System.out.print("\t\t# ");
        System.out.println( 15 + 35 );

        // The above println() statement will first evaluate the expression first before converting it into string so
        // that it could display the output.

        System.out.print("\t\t# ");
        System.out.println( 'a' + 'b' );

        // Similar to the previous case, here first we will add up the character based on their Unicode / ASCII code
        // and display the sum as an integer.

        System.out.print("\t\t# ");
        System.out.println( "a" + "b" );

        // This is a different case that the ones we discussed just now. Well, if you observe closely we can see that
        // the input given to the method are Strings. And the plus ( + ) operator is specifically overloaded for
        // concatenation purpose for Strings. Thus, both of those Strings are concatenated and then displayed.

        // Note that the concept of Operator Overloading is NOT available in Java. Ths plus operator is  specifically
        // overloaded for concatenation purpose for Strings only.

        System.out.print("\t\t# ");
        System.out.println( "a" + 47 );

        // This might see a bit tricky but, you might have guessed it right. Since there is a String and plus operator,
        // the integer is type-casted into a String to get concatenated as a Single String, and then it will be displayed.

        System.out.print("\t\t# ");
        System.out.println( "a" + new int[] {1,2,3,4} );

        // The above example will give same result, apart from it being an Array object. The object reference is converted
        // into String ( due to method toString() ) and then it will be concatenated & displayed.

        System.out.print("\t\t# ");
        // System.out.println( (new int[]{1, 2, 3, 4}) + (new ArrayList<>()) );

        // The above example will show error because it doesn't have any instance of String in to get concatenated.
        // Thus, the statement should be evaluated before converting it into Sting to display it. But, it's not
        // possible to evaluate such expressions. Thus, ends up giving an error/exception.
        // That's why I have commented it out.

        System.out.println(new int[]{1, 2, 3, 4} + "" + new ArrayList<>());

        // As the previous statement we discussed, causes statement to end up abnormally. We can avoid that just by
        // add an instance of string anywhere in the statement, so that it would get concatenated a single string
        // and displayed on to the console without any error.

    }


    // We have discussed a lot about println() method till now,
    // Now, Lets us take a look at how we can pretty print the data
    // In other terms, you can call it formatting too.
    public static void pretty_Printing () {

        System.out.println("Concept: Pretty Printing / Formatting output.\n");

        // Till now, we have observed the internal functioning of Strings, how the memory management is working
        // internally, how changing the way of declaration effects the memory management of the String's Data and
        // how the toString() method works and the behavior of it when we use concatenation operator.

        // Now, lets us see what pretty printing is.
        // Pretty printing (or) output - formatting is something which is based on the way the user want the data
        // to be represented to him/her on the output console.
        // This pretty printing can be done, using the method "printf()" of PrintStream class object "out" which is
        // present in System class. The Syntax is as follows,
        //
        //      System.out.printf( "< formatted String >", data_item_1, data_item_2, ... , data_item_n );
        //
        // This method is somewhat similar to the output function in C, C++ programming languages.

        // In the formatted String, we use notations called "Format Specifiers" to represent the data at that
        // particular position where we have specified the "Specifier". Some Specifiers are given below,
        //
        //        Specifier                  Explanation
        //        ---------     -----------------------------------------
        //           %c         Format characters
        //           %d         Format decimal (integer) numbers (base 10)
        //           %e         Format exponential floating-point numbers
        //           %f         Format floating-point numbers
        //           %i         Format integers (base 10)
        //           %o         Format octal numbers (base 8)
        //           %s         Format string of characters
        //           %u         Format unsigned decimal (integer) numbers
        //           %x         Format numbers in hexadecimal (base 16)
        //           %n         Adds a new line character
        //
        // I know we will not be using all of them all the time, but it's worth to have at least a vague idea on
        // each specifier.

        // Enough of theory, Lets us see a few examples.

        System.out.printf("\t# This is how %s %s works.%n", "printf()", "method");

        // The output of the above example will be "\t# This is how printf() method works\n". Here, the %s format Specifier
        // for displaying strings. Thus, the remaining arguments which are provided are taken place at the position where
        // the format specifiers are mentioned and the %n represents the new line.

        // Lets us see a numeric example,

        System.out.printf("\t# The value of 0.1234123 which is formatted upto 2 decimal points is %.2f%n", 0.1234123f);

        // As we can see, that the above statement is formatting a floating point number upto 2 decimal point. Thus, this
        // results in the number being printed as "0.12" instead of "0.1234123"

        // Lets us take another numeric example,

        System.out.printf("\t# The value of PI formatted upto 3 decimals is %.3f%n", Math.PI);

        // But as we observe this example, this statement results in printing the formatted PI value as "3.142". By this,
        // we can say that this formatting of floating value not only fixes the number of decimal points to be printed but
        // actually rounds up the value to the number of decimal points specified in the Format Specifier/

    }


    // Now that we have learnt a lot about Strings and working & handling output,
    // Lets us take a look back at Strings & its performance and the StringBuilder Class
    public static void string_Builder_Class () {

        System.out.println("Concept: String Performance and StringBuilder Class.\n");

        // Till now, we have learnt a lot about Strings, its internal working, its usage, e.t.c.,
        // Lets us see how efficient Strings (or) String Class Objects are...

        // As we have discussed the concepts of "String Pool" and "immutability" of String Object earlier, we understand
        // how the memory is managed. Thus, we can say that Strings gives the best performance in terms of Storage. But,
        // is it a good practice to always use a String object to store the data. Lets us see it with an example,

        // Consider the following situation where we want to print alphabets from 'a' to 'z', we can do something like,

        System.out.print("\t# Printing letter 'a' to 'z' : ");
        for (int i = 0; i < 26; i++) {
            System.out.print( (char)('a' + i));
        }
        System.out.println();

        // What if we want to store these alphabets in a String, we can do something like this,

        System.out.print("\t# Storing letter 'a' to 'z' in a String object : ");

        String alpha = "";
        for (int i = 0; i < 26; i++) {
            alpha = alpha + (char)('a' + i);
        }
        System.out.println(alpha);

        // The above solution will work as we thought it would. But, is it a good practice ???...
        //
        // The short answer is NO. Lets us take a closer look at the solution and observe what's really happening
        // behind the scenes. For each iteration, we can see that the reference variable is getting update with the
        // concatenation of its previous referencing data and the Unicode/ASCII summation of character 'a' and value
        // of i variable. So, each and everytime time the String data gets concatenated it creates a new Object for it
        // & stores it. And also, the referencing variable will point towards the newly created String Object and thus
        // losing the referencing of Previous object resulting in the deallocation of the previous object.
        //
        // Lets us say all the created of new String Object and deallocation of previous object takes place at O(n)
        // complexity and the outer loop loops for n-times ( the above situation is constant time complexity, but for the
        // sake of generalization we take O(n) for outer loop ). Thus, this all results in O(n^2) time complexity which a
        // bad practice.

        // So, What's the Solution for the above problem ???...
        //
        // Say if there is a way we can update the original data itself we can resolve the above issue, but String class
        // objects are immutable then how we can update the original content of the Data. So, to resolve this issue we use
        // a different class called "StringBuilder". When we create an Object using String Builder, we can update the original
        // content itself. Thus, this helps us deal with the drawback of String Class.

        // Lets us solve the above problem using an StringBuilder Object,

        System.out.print("\t# Storing letter 'a' to 'z' in a StringBuilder object : ");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            builder.append((char)('a' + i));
        }
        System.out.println(builder);

        // Now the above problem is resolved and the performance of the above algorithm/program is improved even better.
    }

    // We have covered many things about Strings in Java to this point,
    // Now Lets wrap things with a few mostly used methods in the String Class.
    public static void some_String_Methods () {

        System.out.println("Concept: Some Method of String Class.\n");

        // Lets us up warp the concept of "String" in Java after discussing few mostly used
        // method of String Class.

        // Consider the string,

        String str = "I have learnt about Strings in Java";

        System.out.println("\tThe String: " + str + "\n");

        // Example of charAt() method,

        System.out.println("\t\t# str.charAt(0) returns: " + str.charAt(0) );

        // The charAt method take the index as the input and return the character present at that
        // index position of the given Sting Object.
        // Note that we use this method while read a single character from user from the input console,
        // as there is no special method from the Scanner class to read A single character as input from
        // input console which is given by the user.

        // Example of equals() method,

        System.out.println("\t\t# str.equals(\"I know Java\") returns: " + str.equals("I know Java") );

        // We have discussed the equals() method in the beginning chapter only. The equals() method takes
        // input as another String Object which compare the inside content and returns boolean value "true"
        // if the content inside both objects is same or else returns "false".

        // Example of toLowerCase() / toUpperCase() method,

        System.out.println("\t\t# str.toLowerCase() returns: " + str.toLowerCase() );
        System.out.println("\t\t# str.toUpperCase() returns: " + str.toUpperCase() );

        // As the name suggests, this method will convert the content into lower case characters when we use
        // toLowerCase() method and into upper case when we use toUpperCase() method.

        // Example of indexOf() method,

        System.out.println("\t\t# str.indexOf('e') returns: " + str.indexOf('e') );

        // The indexOf() method has multiple types of inputs as this method has been overloaded in the String Class
        // for different implementation based on given input parameters. The one that mentioned above takes the character
        // and returns the index of first occurrence of the given character in the String it's searching for.

        // Example of lastIndexOf() method,

        System.out.println("\t\t# str.lastIndexOf('e') returns: " + str.lastIndexOf('e') );

        // This method is similar to the previously discussed one. This method is also overloaded in the String Class
        // for different implementation based on given input parameters. The one that mentioned above takes the character
        // and returns the index of last occurrence of the given character in the String it's searching for.

        // Example of length() method,

        System.out.println("\t\t# str.length() returns: " + str.length() );

        // As the name suggest, this method will return the size/length of the String. Some people often get confused
        // as we use "arr.length" to get the size/length of the Array but for string we use this method. Because, the
        // length is a member variable of that array object but for strings we use a methods to get the size/length.
        // This method internally returns the value of member variable only.

        // Example of split() & toString() method,

        System.out.println("\t\t# Arrays.toString(str.split(\" \")) ( implicitly ) returns: " + Arrays.toString(str.split(" ")) );

        // This method return an Array of String split w.r.t the given input character present in the string. And used the
        // toString() method which is overridden inside the Arrays class. We mostly used "Arrays.toString()" method to
        // display the Array elements in a Single neat representation.

        // Example of strip() method,

        System.out.println("\t\t# str.strip() returns: " + str.strip() );

        // This method basically return the string which is the original string without the whitespaces. But the original data
        // will not be modified just by using this method.

    }

    // Driver Program
    public static void main(String[] args) {

        string_Declaration ();
        System.out.println("\n------------------------------------------------------\n");

        print_Streaming_Of_Strings ();
        System.out.println("\n------------------------------------------------------\n");

        string_Concatenation_Operator ();
        System.out.println("\n------------------------------------------------------\n");

         pretty_Printing ();        /* formatting output */
         System.out.println("\n------------------------------------------------------\n");

         string_Builder_Class ();
         System.out.println("\n------------------------------------------------------\n");

         some_String_Methods ();
         System.out.println("\n------------------------------------------------------\n");
    }
}

//  Output:-
//  ------
//
//        Concept: String Declaration.
//
//            1) Result of Sam == Sam is true
//            2) Result of Sam == Sam is false
//            3) Result of Sam.equals(Sam) is true
//
//        ------------------------------------------------------
//
//        Concept: PrintSteam / Output of String on consoles.
//
//            1) Printing Different types of data,
//                # 35
//                # Hello World
//                # [I@5fd0d5ae
//
//            2) toSting(),
//                # [1, 2, 3, 4]
//                # 45
//
//        ------------------------------------------------------
//
//        Concept: String Concatenation Operator.
//
//            Different outputs from println() method,
//                # 50
//                # 195
//                # ab
//                # a47
//                # a[I@7ef20235
//                # [I@4f3f5b24[]
//
//        ------------------------------------------------------
//
//        Concept: Pretty Printing / Formatting output.
//
//            # This is how printf() method works.
//            # The value of 0.1234123 which is formatted upto 2 decimal points is 0.12
//            # The value of PI formatted upto 3 decimals is 3.142
//
//        ------------------------------------------------------
//
//        Concept: String Performance and StringBuilder Class.
//
//            # Printing letter 'a' to 'z' : abcdefghijklmnopqrstuvwxyz
//            # Storing letter 'a' to 'z' in a String object : abcdefghijklmnopqrstuvwxyz
//            # Storing letter 'a' to 'z' in a StringBuilder object : abcdefghijklmnopqrstuvwxyz
//
//        ------------------------------------------------------
//
//        Concept: Some Method of String Class.
//
//            The String: I have learnt about Strings in Java
//
//                # str.charAt(0) returns: I
//                # str.equals("I know Java") returns: false
//                # str.toLowerCase() returns: i have learnt about strings in java
//                # str.toUpperCase() returns: I HAVE LEARNT ABOUT STRINGS IN JAVA
//                # str.indexOf('e') returns: 5
//                # str.lastIndexOf('e') returns: 8
//                # str.length() returns: 35
//                # Arrays.toString(str.split(" ")) ( implicitly ) returns: [I, have, learnt, about, Strings, in, Java]
//                # str.strip() returns: I have learnt about Strings in Java
//
//        ------------------------------------------------------

