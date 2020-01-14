package Stack;

import java.util.Stack;

/**
 * 使用栈实现队列的下列操作：
 * <p>
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 */
public class ImplementQueueUsingStacks {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;

    /**
     * Initialize your data structure here.
     */
    public ImplementQueueUsingStacks() {
        inStack = new Stack<Integer>();
        outStack = new Stack<Integer>();
    }

    /**
     * Push element x to the back of queue.
     */
    public void push(int x) {
        /**
         * 把所有操作集中在push函数，执行顺序为：
         * 1.先把outStack中的元素出栈push到inStack中
         * 2.再执行push(x)操作
         * 3.再把inStack中的元素按照出栈顺序添加到outStack
         */
        while (!outStack.isEmpty()) {
            inStack.push(outStack.pop());
        }
        inStack.push(x);
        while (!inStack.isEmpty()) {
            outStack.push(inStack.pop());
        }

    }

    /**
     * Removes the element from in front of queue and returns that element.
     */
    public int pop() {
        return outStack.pop();
    }

    /**
     * Get the front element.
     */
    public int peek() {
        return outStack.peek();
    }

    /**
     * Returns whether the queue is empty.
     */
    public boolean empty() {
        return outStack.isEmpty();
    }
}
