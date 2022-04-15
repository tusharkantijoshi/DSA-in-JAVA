<!--
! Introduction
* A Tree is a non linear data structure where each node is connected to a number of nodes with the help of references.
* Unlike Arrays, Linked Lists, Stack and Queues, which are linear data structures, trees are hierarchical data structures.

? Basic Tree Terminologies:
* Root: The root of a tree is the first node of the tree.
* Edge: An edge is a link connecting any two nodes in the tree.
* Siblings: The children nodes of same parent are called siblings. That is, the nodes with same parent are called siblings.
* Degree: The degrees of a node is the number of children it has.
* Leaf Node: A node is said to be the leaf node if it has no children.
* Height of a Tree: Height of a tree is defined as the total number of levels in the tree or the length of the path from the root node to the node present at the last level.


! Binary Tree
* A Tree is said to be a Binary Tree if all of its nodes have at most 2 children. That is, all of its node can have either no child, 1 child, or 2 child nodes.

? Properties of a Binary Tree:
* The maximum number of nodes at level 'l' of a binary tree is (2^(l - 1)).

* Maximum number of nodes in a binary tree of height 'h' is (2^h – 1).

* In a Binary Tree with N nodes, the minimum possible height or the minimum number of levels is Log2(N+1).

* A Binary Tree with L leaves has at least (Log2L + 1) levels.

* In a Binary tree in which every node has 0 or 2 children, the number of leaf nodes is always one more than the nodes with two children.

? Types of Binary Trees:
* Full Binary Tree: A Binary Tree is full if every node has either 0 or 2 children.

* Complete Binary Tree: A Binary Tree is a complete Binary Tree if all levels are completely filled except possibly the last level and the last level has all keys as left as possible.

* Perfect Binary Tree: A Binary tree is a Perfect Binary Tree when all internal nodes have two children and all the leave nodes are at the same level. A Perfect Binary Tree of height h (where height is the number of nodes on the path from the root to leaf) has (2^h – 1) node.


! Tree Traversal
* Unlike linear data structures (Array, Linked List, Queues, Stacks, etc.), which have only one logical way to traverse them, trees can be traversed in different ways. Following are the generally used ways for traversing trees:

? Types of Tree Traversal:
* Breath First or Level Order
* Depth First

? Types of Depth First Tree Traversal:
* InOrder
* PreOrder
* PostOrder

? Steps for InOrder Tree Traversal:
* Recursively traverse left subtree then root and then right subtree.

? Steps for PreOrder Tree Traversal:
* Recursively traverse root then left subtree and then right subtree.

? Steps for PostOrder Tree Traversal:
* Recursively traverse left subtree then right subtree and then root.

? Steps for LevelOrder Tree Traversal:
*




































































-->
