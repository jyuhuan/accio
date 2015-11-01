# [Problem 284: Peeking Iterator](https://leetcode.com/problems/peeking-iterator/)

My first problem on LeetCode! 

## The Idea

Don't get fooled by the comment in the provided code:

	// Returns the next element in the iteration without advancing the iterator.

You'll *have to* advance the iterator to see the next element. What you should do is actually conceal this fact, and make it appear like `next` is not called. At this point, you should realize that the next element should be stored in the iterator before hand. 

The code is straightforward. 

Again, I think this problem should be labeled as "simple".