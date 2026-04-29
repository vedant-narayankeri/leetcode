# Problem 49: Group Anagrams

## Problem Description
Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

## Examples

Example 1:
```text
Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

Explanation:

There is no string in strs that can be rearranged to form "bat".
The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
```

Example 2:
```text
Input: strs = [""]

Output: [[""]]
```

Example 3:
```text
Input: strs = ["a"]

Output: [["a"]]
```

## Constraints

- `1 <= strs.length <= 104`
- `0 <= strs[i].length <= 100`
- `strs[i]` consists of only lowercase English letters

## Core Concept
Map of lexicographically sorted strings & list of actual strings
Each anagram have the same lexicographically sorted string
Everytime we get a new sorted string, we put in map
else we get the value from it and append current string to it
Finally iterate map(k, v) and for each add v to the result. 
So result is List<v> where v is List<String>