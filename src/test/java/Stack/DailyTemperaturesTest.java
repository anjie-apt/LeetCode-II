package Stack;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DailyTemperaturesTest {
    @Test
    public void dailyTemperatures() throws Exception {
        int[] T = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        assertEquals("[1, 1, 4, 2, 1, 1, 0, 0]", Arrays.toString(new DailyTemperatures().dailyTemperatures(T)));
    }

}