# Sorting Algorithm

Sorting algorithm plays a key role in sorting out the given data set in an order for an easy and effective access of data items, and plays an important role in problem-solving solution. The prerequisites for learning/using these sorting algorithms are:
- Basic programming language syntax
- Concepts of Array Data structure
- Time Complexity
- Space Complexity
- [Stable vs Unstable algorithm](#stable-vs-unstable-algorithm)

Here we are going to discuss the following sorting algorithms:
- [Bubble Sort](#bubble-sort-algorithm)
- [Selection Sort](#selection-sort-algorithm)
<!--
- [Insertion Sort](#insertion-sort-algorithm)
- [Cyclic Sort](#cyclic-sort-algorithm)
-->

## Note:

- While reading the documentation, `take a note of highlighting markings`.
- `Read` the highlighting `markings of` each `individual point continuously` **&** `repeat the same for another individual point` for **better Understanding**.
- `Make use` of explanation `videos links` which are **time stamped** at a particular point `for saving time`.
- `Use the documentation links` for even **in depth** understanding.
- You can also `use the implementation of algorithm in programming language` *(which also documented with explanation of the algorithm)* for even **better understanding**.

## Stable vs Unstable Algorithm

- Any sorting algorithms can be determined either as a Stable algorithms or as an Unstable algorithms
- Determining an algorithm as stable or unstable might seem like a small thing and doesn't make much difference whether it's stable or unstable. But, it plays a huge role in overcoming problems like the below-mentioned example.

### What is a Stable (or) Unstable Algorithm ?

- Consider the situation, An algorithm ( say a sorting algorithm ) is given an input data-set which contain a **duplicate data item**.
- If the algorithm able to sort in such a way that the **FIRST OCCURRENCE** of the duplicate data item *( w.r.t the given original data set )* **STAYS AS** the **FIRST OCCURRENCE** even after sorting, Then we say that algorithm is 'Stable algorithm'.
- Unstable algorithm is quite opposite to the stable algorithm.
- So, if the first occurrence of the duplicate data item doesn't stay the first occurrence of the duplicate data item then it's said to be Unstable Algorithm.

![Example for Stable and Unstable algorithm](https://github.com/iamwatchdogs/DSA/blob/main/Sorting_Algo/src/Stable_vs_Unstable_sort_1.png)

###  Why do we need determine whether the algorithm is stable or not ?

- Consider a situation where you have set of data where the *Name* column is mapped with *Age* Column.
- Say the user wanted to sort the data set w.r.t 'Age' first, just as shown below.

![Example data set sorted by Age](https://github.com/iamwatchdogs/DSA/blob/main/Sorting_Algo/src/Stable_vs_Unstable_sort_2.png)

- After sorting the data set w.r.t Age, say the user wanted to sort the same data set w.r.t 'Name'.
- Then, if we have implemented a stable algorithm, the data displayed will be in sorted order both in terms of 'Age' and 'Name'.
- But, it's not same with the unstable algorithm, since the order of 'Age' will be disordered after sorting 'Name' column ( Just as shown in below figure ).

![Above example after data set sorted by Name](https://github.com/iamwatchdogs/DSA/blob/main/Sorting_Algo/src/Stable_vs_Unstable_sort_3.png)

- This is why need to determine the algorithm  as stable or unstable to make better use of it w.r.t the situation demands.

## Bubble Sort Algorithm

- Bubble Sort is one of the **basic sorting algorithms** which is taught as for beginner.
- Bubble sort is `implemented by sorting the largest element` ( if we're sorting in increasing order ) in the data set `for each iteration`/pass.
- The bubble sort is `implemented by a single nested loop`, where the `inner loop sorts the largest element` to the right-most side `for each 'i'-th iteration/pass of the outer loop`.
- `At the end of each 'i'-th iteration`/pass of the outer loop, the `largest element` of first 'n-i' number of elements in data set `will be sorted`.
- Since, `for every pass we are sorting one element`. `It would take 'n'-passes` in total `to sort all the 'n' elements` of the data set.
- `Thus, the time complexity` of this algorithm becomes `O(n)`. And the `Space complexity will remain constant` since we are not allocating addition memory.
- This is a `Stable Algorithm`.

![Bubble Sort Example](https://github.com/iamwatchdogs/DSA/blob/main/Sorting_Algo/src/Bubble_Sort.png)

- [Bubble Sort Documentation](https://www.geeksforgeeks.org/bubble-sort/)
- [Click here for watching detailed explanation](https://youtu.be/F5MZyqRp_IM?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=194)
- [Click here to see the Java Implementation of Bubble Sort](https://github.com/iamwatchdogs/DSA/blob/main/Sorting_Algo/Bubble_Sort.java)

#### Time Complexity:

- **Best case:** O(n)

  > Linear Time complexity.

  > Occurrence: When the given data set is already sorted in requested sorting order.

  > Why ?: If the array is sorted then the algorithm will not swap in inner loop for every 'n' element. The algorithm will only iterate over the elements of the array resulting in Linear Time complexity.

- **Worst case:** O(n<sup>2</sup>)

  > Quadratic Time complexity.
  
  > Occurrence: When the given data set is sorted in opposite order of the requested sorting order.

  > Why ?: If the array is sorted in opposite order of the requested sorting order. Then it will take 'n' no. of swaps for a "single" element to be sorted. So, to sort all 'n' elements we need to swap n*n elements resulting in Quadratic Time complexity.

#### Space Complexity:

- **Any case:** O(1)

    > Linear Space complexity.