import org.junit.*;
import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

class GCD {
    //Test cases to achieve All-Defs coverage

    @Test /* Test 1 */
    void test1() {
        /*BigInt X = -1, BigInt Y = -1
        Coverage: 1,2,3,6,8,11,12,13,14*/
       BigInteger x = new BigInteger("-1");
       BigInteger y = new BigInteger("-1");
       BigInteger expected = new BigInteger("1");
       BigInteger outcome = x.gcd(y);

       assertEquals(expected, outcome);

    }

    @Test /* Test 2 */
    void test2() {
        /*BigInt x = 10, BigInt Y = -2^31.
        Coverage: 1,2,3,6,7,4,10,15,9,18,19,20,21,22,23*/
        BigInteger x = new BigInteger("10");
        BigInteger y = new BigInteger("-2147483648");
        BigInteger expected = new BigInteger("2");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);
    }

    @Test /* Test 3 */
    void test3() {
        /*Bigint x = 0, BigInt y = 2147483650
        Coverage: 1,2,4,10,15,9,17,19,20,21,22,23*/
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("2147483650");
        BigInteger expected = new BigInteger("2147483650");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);
    }


    //Test cases to achieve All-Use coverage

    @Test /* Test 4 */
    void test4() {
        /*BigInt x = 10, BigInt Y = -2^31.
        Coverage: 1,2,3,6,7,4,10,15,9,18,19,20,21,22,23*/
        BigInteger x = new BigInteger("10");
        BigInteger y = new BigInteger("-2147483648");
        BigInteger expected = new BigInteger("2");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);

    }

    @Test /* Test 5 */
    void test5() {
        /*BigInt X = -1, BigInt Y = -1
        Coverage: 1,2,3,6,8,11,12,13,14*/
        BigInteger x = new BigInteger("-1");
        BigInteger y = new BigInteger("-1");
        BigInteger expected = new BigInteger("1");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);
    }

    @Test /* Test 6 */
    void test6() {
        /*BigInt X =0, BigInt Y = 0
        Coverage: 1,2,3,5*/
        BigInteger x = new BigInteger("0");
        BigInteger y = new BigInteger("0");
        BigInteger expected = new BigInteger("0");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);
    }

    @Test /* Test 7 */
    void test7() {
        /*BigInt X =2147483650, BigInt Y = 0
        Coverage: 1,2,4,10,16*/
        BigInteger x = new BigInteger("2147483650");
        BigInteger y = new BigInteger("0");
        BigInteger expected = new BigInteger("2147483650");
        BigInteger outcome = x.gcd(y);

        assertEquals(expected, outcome);
    }
}