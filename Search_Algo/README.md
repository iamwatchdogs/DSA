# Linear Search

- Linear search is the basic searching algorithm where we iterate thorough out the given data set to find position of required data (or) to verify whether it is present in the given in data set or not.

- Since we are iterating throughout the whole data set, the time complexity of this algorithm will be O(n).

- The space complexity remains constant as we are **NOT** allocating additional memory to perform the computation using this algorithm.

- Time Complexity:

  - best case: O(1)
  
    > Constant Time complexity.
    
    > Occurrence: When the first element in the data set is the target element.
    
  - worst case: O(n)
  
    > Linear Time complexity.

    > Occurrence: When the target element is not present in the given data set.
    
- Space Complexity:

  - O(1)
  
    > Linear Space complexity.

- [Click here to see the Implementation of Linear search](https://github.com/iamwatchdogs/DSA/blob/main/Search_Algo/Linear_Search.java)
- [Reference Link](https://www.geeksforgeeks.org/linear-search/)

# Binary Search

- Binary search is improved version of searching algorithm but the only constraint for implementing this algorithm is given Data set **SHOULD BE SORTED !!!**.

- The given data set can either be sorted in increasing or decreasing order, ***but it has to be sorted***.

- This algorithm works by taking a **mid-value** of the data set and comparing it starting and ending value of the data set & then updating the *starting/ending index value* to search the part of data set where criteria/possibility of the finding the required data set is high and, repeating this process until the required data is found.

- And even after doing that, if we are unable to find the required data in the given data set then the required data item does not exist in the given data set.

- By this algorithm, We keep reducing the search area within the data set to find the required data item. Thus, number of passes will decrease drastically when compared to Linear search.

- For every single pass, we keep reducing the search area by half, and you choose **only one** of the half to search by repeating the same algorithm. Hence, the input size to the algorithm will be decreased. Thus, this algorithm is name **Bi**nary Search.

- [Click Here, Detailed Explanation of Binary Search Implementation](https://youtu.be/f6UU7V3szVw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&t=1324)

- [Click here to see the Different Java Implementation of Binary search](https://github.com/iamwatchdogs/DSA/blob/main/Search_Algo/Binary_Search.java)

- [Reference Link](https://www.geeksforgeeks.org/binary-search/)

- Time Complexity:

  - best case: O(1)
  
    > Constant Time complexity.

    > Occurrence: When the middle element in the data set is the target element.
    
  - worst case: O(log n)
  
    > Linear Time complexity.

    > Occurrence: When the target element is not present in the given data set.
    
- Space Complexity:

  - O(1)
  
    > Constant Space complexity.
     
    > We are just reducing the range/search area of the given data set but not allocating more additional memory for it.
