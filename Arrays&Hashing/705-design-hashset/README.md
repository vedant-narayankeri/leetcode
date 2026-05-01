# Problem 705: Design HashSet

## Problem Description
Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

- void add(key) Inserts the value key into the HashSet.
- bool contains(key) Returns whether the value key exists in the HashSet or not.
- void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.


## Examples

Example 1:
```text
Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]

Explanation
MyHashSet myHashSet = new MyHashSet();
myHashSet.add(1);      // set = [1]
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(1); // return True
myHashSet.contains(3); // return False, (not found)
myHashSet.add(2);      // set = [1, 2]
myHashSet.contains(2); // return True
myHashSet.remove(2);   // set = [1]
myHashSet.contains(2); // return False, (already removed)
```

## Constraints

- `0 <= key <= 106`
- At most `10^4` calls will be made to add, remove, and contains.

## Core Concept

Brute force approach - 
Create class variable List<Integer>
    - For add -> check if data.contains(key)
        - If doesn't exist then data.add()
        - Else do nothing
    - For remove
        - data.remove(int): removes element of list at index `int`
        - But data.remove(Integer.valueOf(int)) - removes actual element `int`
    - For contains
        - data.contains(key)

Time Complexity - O(N) for each operation (managed by core libs)
Space Complexity = O(N)

With List we don't have to worry about last index

Optimized - Like and actual HashSet (Linked List implementation)

Node - key, value 

Node[] buckets = new Node[10^4];//Max number of operations, can add max 10^4 operations

HashFunction - Index of buckets = key%10000

Constructor:
Initialize buckets[i] = new Node(0);//Just default can be any value as we don't count the first element of node which is head.

- Add
    - Go to bucket index
    - while(node.next !=null) basic iteration
    - If match then return
    - Default once we reach last node
    - node.next = new Node(key)
- Contains
    - Go to bucket index
    - Default return false
    - while(node.next!=null) -> retrun true; //if(node.next.value = key)
        - Default node = node.next; // Keep going ahead
- Remove
    - Go to bucket index
    - While(node.next != null) - basic iteration
    - Iterate till next node of current node  is key to remove
    - When next node is to remove, node.next = node.next.next
    - Else just keep going ahead - node = node.next;

Time complexity

We have to traverse linked list = O(N) - Worst case all elements inserted in same bucket
IF well distributed -? O(N/k) - k is number of buckets (Average case)

Space Complexity = O(k+m) where k = bucket storage and m is num of unique keys