package SwordRefers2Offer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReplaceSpaceTest {
    @Test
    public void replaceSpace() throws Exception {
        StringBuffer str = new StringBuffer("We Are Happy");
        assertEquals("We%20Are%20Happy", new ReplaceSpace().replaceSpace(str));
    }

}