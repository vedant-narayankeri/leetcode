# Problem 14: Longest Common Prefix

## Problem Description
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string `""`.

## Examples

Example 1:
```text
Input: strs = ["flower","flow","flight"]
Output: "fl"
```

Example 2:
```text
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

## Constraints

- `1 <= strs.length <= 200`
- `0 <= strs[i].length <= 200`
- `strs[i]` consists of only lowercase English letters if it is non-empty.

## Core Concept
So iterate for-each chars of First String strs[0]
If it is smallest that can be max Common prefix, if larger no worries we break at smallest string
Then - we compare the character at same index for each of the strings of the array. Note - start from including itself also because we need to handle case when size of list is 1, so there is no next index hence i+1 will go out of bounds.  But we handle by base case, default return
Base case - Also by default if all characters match then we return the first string - as all strings of list are the same
Normal flow - 
On occurrance of different character we break and return s.substring(0,i) -> from 0 to i-1
We also break if we reach and index equal to lenght of shorter string of comparison - as that can be max answer
If no characters match s.substring(0,0) is from 0 to -1 which returns `""` empty string
