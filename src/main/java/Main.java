import java.util.*;

public class Main {
    public static class SetOfStacks {
        private int maxSize;
        private int length;
        private int stackIndex;
        public ArrayList<Stack<Integer>> listStacks = new ArrayList<Stack<Integer>>();

        public SetOfStacks(int sizeOfStacks) {
            maxSize = sizeOfStacks;
            length = 0;
            stackIndex = 0;
            listStacks.add(new Stack<Integer>());
        }

        public void push(int item) {
            listStacks.get(stackIndex).push(item);
            length++;
            if(length % maxSize == 0) {
                listStacks.add(new Stack<Integer>());
                stackIndex++;
            }

        }

        public Integer pop() {
            if (length % maxSize == 0) {
                listStacks.remove(stackIndex);
                stackIndex--;
            }
            int item = listStacks.get(stackIndex).pop();
            length--;
            return item;
        }
        public Integer popAt(int stackNum) {
            if (length % maxSize == 0) {
                listStacks.remove(stackIndex);
                stackIndex--;
            }
            if (stackNum > stackIndex) {
                throw new Error("Stack not available.");
            }
            int item = listStacks.get(stackNum).pop();
            length--;
            return item;
        }
    }

    public static void main(String[] args) {
        SetOfStacks stack = new SetOfStacks(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        stack.push(3);
        for (Stack<Integer> s : stack.listStacks) {
            System.out.println(s);
        }
        System.out.println("");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("");
        for (Stack<Integer> s : stack.listStacks) {
            System.out.println(s);
        }
        System.out.println(stack.popAt(1));
        for (Stack<Integer> s : stack.listStacks) {
            System.out.println(s);
        }
    }
}
