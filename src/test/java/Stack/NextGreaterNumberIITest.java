package Stack;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class NextGreaterNumberIITest {
    @Test
    public void nextGreaterElements() throws Exception {
        int[] nums = new int[]{100, 1, 11, 1, 120, 111, 123, 1, -1, -100};
        assertEquals("[120, 11, 120, 120, 123, 123, -1, 100, 100, 100]", Arrays.toString(new NextGreaterNumberII().nextGreaterElements(nums)));
    }

}