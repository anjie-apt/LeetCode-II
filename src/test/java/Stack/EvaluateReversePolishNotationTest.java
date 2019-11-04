package Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvaluateReversePolishNotationTest {
    @Test
    public void evalRPN() throws Exception {
        String[] input = new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, new EvaluateReversePolishNotation().evalRPN(input));
    }

}