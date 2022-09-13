# Strings

## What is String Data Structure ?

- **Strings** is one of the Data Structure which is specially used for storing and manipulating a collection of `Character` elements.
- This data structure is basically an implementation of [Arrays](../Array_Data_Structure "Learn Arrays Data Structure") Data Structure but specifically for Character elements.
- String can also be called a sub topic of Arrays Data Structure.
- Some programming languages took a step ahead and improved this Data Structure for even better performance in storing, accessing and manipulating the character data items.
- These improvements are possible due to some crucial concepts like Object-Oriented Programming.

## Why do we need String Data Structure ?

- As it's mentioned above, we know that Strings are just Arrays Storing character type data items. Then you might be wonder why to treat it as a separate topic ?
- The reason we consider String as a separate Data Structure is to make it even easier to works on a set of Characters.
- Even the internal implementation of reading data from User is done using Strings.
- The data read from the user is recorded as a set of character into the input buffer, and then it would be reformatted into some other useful data to perform the required task.
- So, in this case wouldn't it be more difficult to manage them as a set of separate individual character item ?
- That's why even though we have the concept of Arrays that can implement Strings indirectly, people choose to take a different approach to implement them as String.
- So, that people could fours more producing problem solutions rather than worrying about the implementation of Array Data Structure on separate individual characters.

## What are the prerequisites required to learn Strings ?

String is one of the basic Data Structure as it's a derivative of [Arrays](../Array_Data_Structure "Learn Arrays Data Structure") Data Structure itself.
As the technologies improved, even better modification took place on this data structure.
Nowadays, we are using Strings as data type *( class, to be specific )*, this was possible due to the evolution of Object oriented programming.
So to have a decent understanding of the String data structure, you should be fimilar with the following concepts :

- Basic programming language syntax
- [Concepts of Array Data structure](../Array_Data_Structure/README.md "Learn Array Data Structure")
- Concepts of Object-oriented programming
- Time Complexity *( for problem-solving aspect )*
- Space Complexity *( for problem-solving aspect )*

## How do we implement String Data Structure ?

String Data Structure can indifferent way based on the requirement and the programming language. 
Lets us take a look at different implementation in different programming languages :

- **`C Programming` Language** :

  > In C programming language we can implement String in two ways,
  >
  >> - Using a regular `Character Array`.
  >
  >> - Using a `Character pointer` pointing some memory location in heap.
  >
  > The String Manipulation can be done using one of the std C library named as `string.h`
  
- **`C++ Programming` Language** :
  
  > We can implement the String data structure,
  > 
  >> - same as mentioned in `C programming` language.
  >
  >> - But in addition those, `String` *( class )* datatype was introduced in `C++ programming` language.
  >
  > This data type and its corresponding functions were developed & used under the concept of `Object Oriented Programming` and `Templates`.
  >
  >> - The String Manipulation can be done using both C library `string.h` and C++ library `cstring`.
  >>
  >>-  You can use either of the library, but not all compilers support `string.h` library. And It's recommended to use `cstring` library as its more compatible than std C library.
  >
  >> The data type `string` and the `cstring` library uses standard namespace scoping for execution.

- **`Java` Programming Language** :

  > We can implement the String data structure in two ways,
  > 
  >> - Using a regular `Character Array`. *( rarely used )*
  >> - Using `String class`.
  >> - Using `String Builder class`.
  >
  > The String Manipulation can be done via their own member functions / methods present in them.
  > 
  >> - Unlike the above programming language, the `String` object are `immutable`.

- **`Python` Programming Language** :

  > We can implement the String data,
  > 
  >> Just by assigning a `string` value we can create an object of string type.
  > 
  > Similar to Java, String Manipulation can be done using its own member functions (or) its own methods.
  > 
  >> - Similar to Java, the strings in python are `immutable`..

## Learning Resources

- For `Java` programming language :
  > I **strongly recommend** you to check out my personal documentation about strings in [Strings_In_Java.java](Strings_In_Java.java "Visit Strings_In_Java.java")
  - Check out the tutorial -
    - [Watch English-Hindi tutorial](https://youtu.be/zL1DPZ0Ovlo?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=76 "Watch tutorial by Kunal")
  - Read the documentation ( for String Class ) -
    - [Read from JavaTPoint Documentation( Beginners )](https://www.javatpoint.com/java-string "Goto Javatpoint Java String")
    - [Read from GFG](https://www.geeksforgeeks.org/strings-in-java/ "Goto GFG Java Strings") *( for abstract idea of other string related classes )*
    - [Read from original JAVA Documentation ( Medium )](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html "Goto Oracle Java String")
  - Read the documentation ( for StringBuilder Class ) -
    - [Read from GFG ( Beginners )](https://www.geeksforgeeks.org/stringbuilder-class-in-java-with-examples/ "Goto GFG Java StringBuilder")
    - [Read from JavaTPoint Documentation ( best for examples)](https://www.javatpoint.com/StringBuilder-class "Goto javatpoint Java StringBuilder")
    - [Read from original JAVA Documentation ( Medium to Advanced )](https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html "Goto Oracle Java StringBuilder")