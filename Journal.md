# Journal
Phase 1
In this phase I created a Binary Search Tree Node with getter and setter methods that can be used 
by the Tree class to retrieve and compare data that is added to the tree. The BinarySearchTree 
class adds new elements to the tree with the add method. The add method compares the info inserted into the 
new node to 0 to determine if it should go to the right node or left node. Since we are working with generics, 
the Comparable interface is required to be able to use the compareTo method so it knows whether to put it on the 
right or left side of the tree.

Phase 2 
I created a recursive method to calculate the height of the tree. The algorithm will check the root node, then it's left
node, then it's right node, and repeat those steps recursively until it gets to a node that is null and add the nodes 
together that are not null.

Phase 3
I coded algorithms to recursively traverse the tree Inorder and in Preorder and print them out. The Inorder algorithm
formula matches the structural rules of the binary search tree causing it to traverse the nodes in the correct order.

Phase 4 
When I made the skewed, each node went down to the right node and made an unbalanced tree. The preorder and inorder 
traversal for it was the same and printed the numbers out in sequential order. One edge case I noticed is that you can 
put the same integer into the array twice, and it will print it out twice in the tree, but the algorithm should disregard
any redundant numbers. I may be able to add a check for that in the add method.
