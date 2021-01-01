import org.junit.*;
import java.math.BigInteger;
import static org.junit.Assert.assertEquals;

class CompareTo {
    //Test cases to achieve All-Defs coverage

    @Test /* Test 1 */
    void test1() {
        /*BigInt x = 10, BigInt Y = 2^31 +10.
        Coverage: 1,2,8,9,10,15,16,17,19,21,22*/
       BigInteger x = new BigInteger("10");
       BigInteger y = new BigInteger("2147483658");
       int outcome = x.compareTo(y);
       int expected = -1;

       assertEquals(expected, outcome);

    }

    @Test /* Test 2 */
    void test2() {
        /*BigInt x = 2^31 +10, BigInt Y = 10.
        Coverage: 1,2,8,9,10,15,16,17,19,21,22*/
        BigInteger x = new BigInteger("2147483658");
        BigInteger y = new BigInteger("10");
        int outcome = x.compareTo(y);
        int expected = 1;

        assertEquals(expected, outcome);
    }

    //Test cases to achieve All-Use coverage

    @Test /* Test 3 */
    void test3() {
        /*BigInt x = 2^31 +10, BigInt Y = 10.
        Coverage: 1,2,8,9,10,14,16,18,19,21,23*/
        BigInteger x = new BigInteger("2147483650");
        BigInteger y = new BigInteger("10");
        int outcome = x.compareTo(y);
        int expected = 1;

        assertEquals(expected, outcome);
    }


    @Test /* Test 4 */
    void test4() {
        /*BigInt x = 1, BigInt Y = 1.
        Coverage: 1,2,3,6*/
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("1");
        int outcome = x.compareTo(y);
        int expected = 0;

        assertEquals(expected, outcome);

    }

    @Test /* Test 5 */
    void test5() {
        /*BigInt x = -1, BigInt Y = 1.
        Coverage: 1,2,4*/
        BigInteger x = new BigInteger("-1");
        BigInteger y = new BigInteger("1");
        int outcome = x.compareTo(y);
        int expected = -1;

        assertEquals(expected, outcome);
    }

    @Test /* Test 6 */
    void test6() {
        /*BigInt X =1, BigInt Y = -1
        Coverage: 1,2,3,5,7*/
        BigInteger x = new BigInteger("1");
        BigInteger y = new BigInteger("-1");
        int outcome = x.compareTo(y);
        int expected = 1;

        assertEquals(expected, outcome);
    }

    @Test /* Test 7 */
    void test7() {
        /*BigInt x = -2^31+10, BigInt Y = 10.
        Coverage: 1,2,8,9,11,12*/
        BigInteger x = new BigInteger("-2147483650");
        BigInteger y = new BigInteger("10");
        int outcome = x.compareTo(y);
        int expected = -1;

        assertEquals(expected, outcome);
    }

    @Test /* Test 8 */
    void test8() {
        /*BigInt x = 2^31+10, BigInt Y = -10.
        Coverage: 1,2,8,9,11,12*/
        BigInteger x = new BigInteger("2147483650");
        BigInteger y = new BigInteger("10");
        int outcome = x.compareTo(y);
        int expected = 1;

        assertEquals(expected, outcome);
    }

    @Test /* Test 9 */
    void test9() {
        /*BigInt x = 2^31+10, BigInt Y = 2^31+10.
        Coverage: 1,2,8,9,10,14,16,17,19,20*/
        BigInteger x = new BigInteger("2147483650");
        BigInteger y = new BigInteger("2147483650");
        int outcome = x.compareTo(y);
        int expected = 0;

        assertEquals(expected, outcome);
    }

    @Test /* Test 10 */
    void test10() {
        /*BigInt x = 2^31 +10, BigInt Y = 2^31 +100.
        Coverage: 1,2,8,9,10,14,16,17,19,21,22*/
        BigInteger x = new BigInteger("2147483650");
        BigInteger y = new BigInteger("2147483758");
        int outcome = x.compareTo(y);
        int expected = -1;

        assertEquals(expected, outcome);
    }

    @Test /* Test 11 */
    void test11() {
        /*BigInt x = 231+100, BigInt Y = 231+10.
        Coverage: 1,2,8,9,10,14,16,17,19,21,23*/
        BigInteger x = new BigInteger("2147483758");
        BigInteger y = new BigInteger("2147483650");
        int outcome = x.compareTo(y);
        int expected = 1;

        assertEquals(expected, outcome);
    }
}