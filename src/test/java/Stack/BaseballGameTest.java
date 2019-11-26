package Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BaseballGameTest {
    @Test
    public void calPoints() throws Exception {
        String[] ops = new String[]{"5", "2", "C", "D", "+"};
        assertEquals(30, new BaseballGame().calPoints(ops));
    }

}