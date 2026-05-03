# Problem 912: Sort an Array

## Problem Description
Given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in `O(nlog(n))` time complexity and with the smallest space complexity possible.

## Examples

Example 1:
```text
Input: nums = [5,1,1,2,0,0]
Output: [0,0,1,1,2,5]
Explanation: Note that the values of nums are not necessarily unique.
```

Example 2:
```text
Input: nums = [5,2,3,1]
Output: [1,2,3,5]
Explanation: After sorting the array, the positions of some numbers are not changed (for example, 2 and 3), while the positions of other numbers are changed (for example, 1 and 5).
```

## Constraints

- `1 <= nums.length <= 5 * 10^4`
- `-5 * 10^4 <= nums[i] <= 5 * 10^4`

## Core Concept
Merge Sort
- O(N*logN) -> merge 2 sorted list O(N) (both pointers reach end, one move fix per iteration)
- We do merging log(N) times as we split array into half and keep merging recursively
- 2 Main functions - mergeSort(arr, left, right) & merge(arr, left, mid, right)
- mergeSort()
    - We calculate mid and then recursively call mergeSort(arr, left, mid) and mergeSort(arr, mid+1, right)
    - Once left, right splits are sorted then we call merge(arr, left, mid, right)
    - Base case: if array size = 0 or 1 ie. left>=right we just return no need to sort as is single element
    - int mid = (left+right)/2 - floor operation it is fine
- merge()
    - while loop till we reach end of one of the arrays
    - Outside while loop we iterate for both remaining arrays (if condition if i<=mid, j<=r)
    - 3 pointer approach i, j for 2 parts to be merged and k for temp array for filling it
    - In-place copy to replace temp with nums (we can do manually also but fine)
        - System.arraycopy(source, sourcePos, dest, destPos, temp.length)