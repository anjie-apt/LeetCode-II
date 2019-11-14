package BackTrack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PermutationsTest {
    @Test
    public void permute() throws Exception {
        int[] nums = new int[]{1, 2, 3};
        assertEquals("[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]", new Permutations().permute(nums).toString());
    }

}