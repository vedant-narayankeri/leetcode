# Problem 169: Majority Element

## Problem Description
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

## Examples

Example 1:
```text
Input: nums = [3,2,3]
Output: 3
```

Example 2:
```text
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

## Constraints

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`
- The input is generated such that a majority element will exist in the array.

## Core Concept
Get comparison length -> nums/2 if even or nums/2 + 1 if odd because division performs a floor causing and issue for Odd numbers
Create Map of number, frequency
Everytime we get new occurence we count newFreq and check if >= comparison, if yes break and return nums[index]