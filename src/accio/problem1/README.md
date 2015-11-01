# [Problem 1:  Two Sum](https://leetcode.com/problems/two-sum/)

## The Idea

I'll use the following example to explain the idea: 

> **Example**: `nums = [2, 7, 11, 15]`, `target = 13`

Starting from the number `n` at index `i = 0`, we put the pair `(target - n, i)` into an hash map from `Integer` to `Integer`. 
We stop whenever we find that the hash map already contains `n` in its keys. The corresponding value of the key `n` should be the index of the number which can yield the target number when added by `n`.  

In the beginning, we see the number `n = 2` at index `i = 0`, the hash map looks like:

	KEY  VAL 
	11   0

The number `11` is `target - n`, which is `13 - 2`.

Upon seeing number `n = 7` at index `i = 1`, the hash map looks like:

	KEY  VAL 
	11   0
	6    1

Next, we see the number `n = 11` at index `i = 2`, which is already in the key list. The corresponding value is `0`, which means that if we add the number at index 0 to `n`, we will have the target value. We'll simply just return the value of the key `11` and the current index `2`.


## Pseudo-code

	For each n at i in numbers:
		let complement = target - n
		if map does not have n in its keys:
			put the pair (complement, i) in map
		else:
			let j = value at i in map
			return pair (j, i)
	return no result
	
## Complexity
Since there is only one swipe of the candidate numbers, this solution executes in *O*(*n*) time where *n* is the length of the candidate numbers.