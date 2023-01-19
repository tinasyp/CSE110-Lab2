
package edu.ucsd.cse110.lab2;
import static org.junit.Assert.*;
import org.junit.Test;

public class UtilitiesTest {
    @Test
    public void test_trimDisplayStr() {
        assertEquals("1.234",Utility.trimDisplayStr("1.2340"));
        assertEquals("13",Utility.trimDisplayStr("13.0"));
    }
}
