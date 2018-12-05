package Arrays;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ContainsDuplicateTest {
    @Test
    public void containsDuplicate() throws Exception {
        int[] input = new int[]{1, 2, 3, 4};
        assertEquals(false, new ContainsDuplicate().containsDuplicate(input));
    }
}