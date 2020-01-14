package Math;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtXTest {
    @Test
    public void mySqrt() throws Exception {
        assertEquals(1, new SqrtX().mySqrt(3));
    }

}