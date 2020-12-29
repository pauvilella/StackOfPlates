# StackOfPlates
Exercise related with Stacks and Queues.

## Exercise Challenge
Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
Therefore, in real life, we would likely start a new stack when the previous stack exceeds some threshold. 
Implement a data structure SetOfStacks that mimics this. SetOfStacks should be composed of several stacks and should create a new stack once the previous one exceeds capacity. 
SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack (that is, pop() should return the same value as it would if there were just a single stack).

### Solution
I have implemented an ArrayList of Stacks. 
Every time I hit a Stack maxLength I create another Stack on the list and so on. 
This is the main idea, see the code for more details.