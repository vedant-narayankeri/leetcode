# Problem 242: Valid Anagram

## Problem Description
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

## Examples

Example 1:
```text
Input: s = "anagram", t = "nagaram"

Output: true
```

Example 2:
```text
Input: s = "rat", t = "car"

Output: false
```

## Constraints

- `1 <= s.length, t.length <= 5 * 104`
- `s` and `t` consist of lowercase English letters.

## Core Concept
Frequency counting for both strings
s.charAt(i)-'a' -> this give you relative position in 26 indexed array
Reference from index of character 'a'
Increment frequency in iteration for S string, Decrement in interation for T string
Final interation if any non zero frequency then return false
Default return true
