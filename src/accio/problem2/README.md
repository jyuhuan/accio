# [Problem 2: Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)

## Idea

This is a very straight forward question, and should really be classified as *simple*.

The key is to maintain three fronts, which I refer to as the `addeeFront`, the `adderFront`, and the `sumFront`. `addeeFront` is initialized to point to the first node of the addee. Similarly, `adderFront` initially points to the first node of the adder. `sumFront` points to a node that has `val` of `0` and `next` of `null`. 

The rest is just mimicking how human do addition. Code is already straightforward. 