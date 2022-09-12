# Strings

## What is String Data Structure ?

- **Strings** is one of the Data Structure which is speacially used for storing and manipulating a collection of `Character` elements.
- This data structure is basically an implemenetation of [Arrays](../Array_Data_Structure "Learn Arrays Data Structure") Data Structure but specifically for Charater elements.
- String can also be called a sub topic of Arrays Data Structure.
- Some of the programming languages took a step ahead and improved this Data Structure for even better performance in storing, accessing and manipulating the character data items.
- These improvements are possible due to some crucial concepts like Object Oriented Programming.

## Why do we need String Data Structure ?

- As its mentioned above, we know that Strings are just Arrays Storing character type data items. Then you might be wonder why to treat it as a seperate topic ?
- The reason we consider String as a seperate Data Structure is to make it even easier to works on a set of Characters.
- Even the internal implementation of reading data from User is done using Strings.
- The data read from the user is recorded as a set of character into the input buffer and then it would be reformatted into some other useful data to perform the required task.
- So, in this case wouldn't it be more diffcult to manage them as a set of seperate individual character item ?
- That's why even though we have the concept of Arrays that can implement Strings indirectly, people choose to take a different approach to implement them as String.
- So, that people could foucs more producing problem solutions rather than worrying about the implementation of Array Data Structure on seperate individual characters.

## How do we implement String Data Structure ?

String Data Structure can indifferent way based on the requierment and the programming language. 
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
  
  > - We can implement the String data structure same as mentioned in `C programming` language.
  >
  >   But in addition those, `String` datatype was introduced in `C++ programming` language.
  >
  > - This data type and its correspnding functions were developed & used under the concept of `namespace`.
  >
  > - The String Manipulation can be done using both C library `string.h` and C++ library `cstring`.
  >
  > - You can use either of the library, but not all compilers support `string.h` library. And its recommended to use `cstring` library as its more compatable than std C library.
  >
  > The data type `string` and the `cstring` use standard namespace for their execution.
