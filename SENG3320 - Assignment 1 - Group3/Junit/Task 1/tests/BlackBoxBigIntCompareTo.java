import org.junit.Test;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils.toByteArray;

class BlackBoxBigIntCompareTo{
    BigInteger x = new BigInteger("10",10);
    BigInteger y = new BigInteger("1000",10);
    BigInteger z = new BigInteger("10",10);
    BigInteger a = new BigInteger("-1000",10);

    @Test /* Test 1 */
    void test1() {
        int test = x.compareTo(y);
        assertEquals(-1, test);
    }
    @Test/* Test 2 */
    void test2() {
        int test = x.compareTo(z);
        assertEquals(0, test);
    }
    @Test/* Test 3 */
    void test3() {
        int test = x.compareTo(a);
        assertEquals(1, test);
    }



}