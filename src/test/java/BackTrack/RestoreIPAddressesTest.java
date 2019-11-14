package BackTrack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestoreIPAddressesTest {
    @Test
    public void restoreIpAddresses() throws Exception {
        String[] res = new String[]{"0.0.0.0"};
        assertEquals(res, new RestoreIPAddresses().restoreIpAddresses("0000").toArray());
    }

}