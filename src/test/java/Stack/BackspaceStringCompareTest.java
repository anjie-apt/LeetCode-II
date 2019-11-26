package Stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackspaceStringCompareTest {
    @Test
    public void backspaceCompare() throws Exception {
        String S = "ab#c";
        String T = "ac#c";
        assertEquals(true, new BackspaceStringCompare().backspaceCompare(S, T));
    }

}