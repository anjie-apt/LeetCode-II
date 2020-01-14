package Stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class ImplementQueueUsingStacksTest {
    private ImplementQueueUsingStacks queueByStack = new ImplementQueueUsingStacks();

    @Test
    public void push() throws Exception {
        queueByStack.push(1);
        queueByStack.push(2);
    }

    @Test
    public void pop() throws Exception {
        queueByStack.push(1);
        queueByStack.push(2);
        assertEquals(1, queueByStack.pop());
        assertEquals(2, queueByStack.pop());
    }

    @Test
    public void peek() throws Exception {
        queueByStack.push(1);
        queueByStack.push(2);
        assertEquals(1, queueByStack.peek());
        assertEquals(1, queueByStack.peek());
        assertEquals(1, queueByStack.pop());
        assertEquals(2, queueByStack.peek());

    }

    @Test
    public void empty() throws Exception {
        assertTrue(queueByStack.empty());
        queueByStack.push(1);
        assertFalse(queueByStack.empty());
    }

}