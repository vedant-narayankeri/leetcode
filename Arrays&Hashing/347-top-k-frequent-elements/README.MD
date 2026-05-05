# Problem 347: Top K Frequent Elements

## Problem Description
Given an integer array nums and an integer k, return the k most frequent elements. 
You may return the answer in any order.

## Examples

Example 1:
```text
Input: nums = [1], k = 1

Output: [1]
```

Example 2:
```text
Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

Output: [1,2]
```

## Constraints

- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4` 
- `k` is in the range `[1, the number of unique elements in the array]`.
- It is guaranteed that the answer is unique.

## Core Concept

- We calculate frequency of each integer put in map() -> k is number v is frequency
- Then we group integers with same frequency and store in List<Integer>[] buckets
- So buckets[i] -> all numbers with `i` frequency and buckets[i+1] with `i+1` frequency
- So all numbers part of higher index buckets have higher frequencies
- Note
    - List<Integer>[] array fo list of integers is `buckets`
    - buckets -> size should be nums.length+1 as it is 0 index and max freq = size of nums i.e. when all nubmers are same