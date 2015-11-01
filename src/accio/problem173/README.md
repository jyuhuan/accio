# [Problem 173: Binary Search Tree Iterator](https://leetcode.com/problems/binary-search-tree-iterator/)

## The Idea

The problem is asking for a lazy in-order traversal of the binary search tree. Although the recursive version is easy to understand and implement, the lazy version requires some thinking. Let's look at a binary search tree first:

<center>
	<img width='200px' src="https://upload.wikimedia.org/wikipedia/commons/thumb/d/da/Binary_search_tree.svg/400px-Binary_search_tree.svg.png" />
</center>

At the beginning of the algorithm, we will have to go to the very bottom left of the tree, because that's where the smallest number will be. So we need a function that can lead us there. We'll simply call this `pushLeft`. Why is there a `push` in the name? Well, we need a stack to act as the fringe that stores the next element we examine. If you are unfamiliar with this fringe idea, please read [my blog post about a general search framework](http://yuhuan.me/blog/articles/search-algorithms.html). 

	def pushLeft(a node n):
		do {
			push node n into the stack
			go to the n.next
			push next into the stack
		} until next is null

For example, if you call `pushLeft(root)`, the nodes with numbers 8, 3, 1 will be pushed into the stack, resulting in a stack that look like:

	│ 1 │
	│ 3 │
	│ 8 │
	└───┘

This should be done at the beginning of the algorithm. 

Then, the algorithm works like any other fringe-based while-loop search algorithms: get the top element from the fringe, examine it (in our case, we should treat this element as the next element of the iterator), and push more element into the fringe based on this top element, and repeat, until the fringe is empty. Here, we just need to put the stopping condition (fringe being empty) in `hasNext`, and the while-loop body in `next`. 

	def hasNext:
		return fringe is not empty

	def next:
		let top = fringe.pop
		if top's right child is not null:
			push this right child into the fringe
		return top's value

In `next`, what we did was to

1. remove the top node from the fringe
2. see if the top node has right child
3. if it does, then pushLeft(this child)

Let's trace this algorithm, using the same tree shown in the figure above. 

	// TODO

## YColl

Interestingly, this is actually something that I have already written in my own collection library, *YColl*, before I read this problem. In that library, I pushed for lazy evaluations everywhere possible. I have pre-order, in-order and post-order enumerators for any binary tree, which are all lazily evaluated. One can traverse a binary tree and stop anywhere they want with no memory wasted, using this lazy enumerator. Chained higher-order function operations will also be much faster. 

What this problem is asking for is exactly an in-order enumerator of the binary search tree. My code used a different style of iterator, which requires only one function to be implemented, which is `def next: Option[X]`. I had to convert it to the style here, which requires two functions, `next` and `hasNext`, to be implemented. 

It looks like questions in LeetCode are sometimes really practical, after all.