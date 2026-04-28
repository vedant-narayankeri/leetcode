# Problem 217: Contains Duplicate

## Problem Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Examples

Example 1:
```text
Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
```

Example 2:
```text
Input: nums = [1,2,3,1]

Output: true

Explanation:

The element 1 occurs at the indices 0 and 3.
```

## Constraints

- `1 <= nums.length <= 105`
- `-10^9 <= nums[i] <= 10^9`

## Core Concept
Maintain set of observed numbers
Iterate over nums, check if set contains nums[i]
If it exists then return true
Else add to set
Default return false, if no duplicate found
