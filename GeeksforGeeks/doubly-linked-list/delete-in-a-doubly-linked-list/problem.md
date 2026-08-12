# GFG. Delete in a Doubly Linked List
**Platform:** GeeksforGeeks
**Difficulty:** N/A
**Topic:** doubly-linked-list

## Problem Statement
Given the head of a doubly linked list and an integer x, delete the node at the xth position (1-based indexing) and return the head of the modified list.

Examples:

Input: x = 3,

Output: 1 <-> 3
Explanation: After deleting the node at position 3 (position starts from 1), the updated linked list is 1 <-> 3.

Input: x = 1,

Output: 5 <-> 2 <-> 9
Explanation: After deleting the node at position 1, the updated linked list is 5 <-> 2 <-> 9.


Constraints:
1 ≤ x ≤ size of the linked list ≤ 106
0 ≤ node->data ≤ 104