import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class GCDTest{
    //tests for statement and branch coverage
    @Test
    public void GCDTest1(){
        //test case 1
        BigInteger test1x = new BigInteger("0");
        BigInteger test1y = new BigInteger("10");
        assertEquals(test1y,test1x.gcd(test1y));
    }
    @Test
    public void GCDTest2() {
        //test case 2 x =-1, y =-2
        BigInteger test2x = new BigInteger("-1");
        BigInteger test2y = new BigInteger("-2");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest3() {
        //test case 3 x =1, y =2147483648
        BigInteger test2x = new BigInteger("1");
        BigInteger test2y = new BigInteger("2147483648");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest4() {
        //test case 4 x =2147483648, y =1
        BigInteger test2x = new BigInteger("2147483648");
        BigInteger test2y = new BigInteger("1");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest5() {
        //test case 5 x =2147483648, y =0
        BigInteger test2x = new BigInteger("2147483648");
        BigInteger test2y = new BigInteger("0");
        BigInteger expected2 = new BigInteger("2147483648");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest6() {
        //test case 6 x =5, y =5
        BigInteger test2x = new BigInteger("5");
        BigInteger test2y = new BigInteger("5");
        BigInteger expected2 = new BigInteger("5");
        assertEquals(expected2, test2x.gcd(test2y));
    }

    //tests for condition, condition/decision and most of mutliple condition decision coverage
    @Test
    public void GCDTest7() {
        //test case 7 x =0, y =2
        BigInteger test2x = new BigInteger("0");
        BigInteger test2y = new BigInteger("2");
        BigInteger expected2 = new BigInteger("2");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest8() {
        //test case 8 x =2, y =2
        BigInteger test2x = new BigInteger("2");
        BigInteger test2y = new BigInteger("2");
        BigInteger expected2 = new BigInteger("2");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest9() {
        //test case 9 x =-2, y =-2
        BigInteger test2x = new BigInteger("-2");
        BigInteger test2y = new BigInteger("-2");
        BigInteger expected2 = new BigInteger("2");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest10() {
        //test case 10 x=-2^31,y=-2^31

        BigInteger test2x = new BigInteger("-2147483647");
        BigInteger test2y = new BigInteger("-2147483647");
        BigInteger expected2 = new BigInteger("2147483647");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest11() {
        //test case 11 x=1, y=2^31+1

        BigInteger test2x = new BigInteger(Integer.toString(1));
        BigInteger test2y = new BigInteger("2147483648");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest12() {
        //test case 12 x=2^31+1,y=2

        BigInteger test2x = new BigInteger("2147483648");
        BigInteger test2y = new BigInteger(Integer.toString(2));
        BigInteger expected2 = new BigInteger("2");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest13() {
        //test case 13 x=2^31+1,y=0

        BigInteger test2x = new BigInteger("2147483648");
        BigInteger test2y = new BigInteger(Integer.toString(0));
        BigInteger expected2 = new BigInteger("2147483648");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest14() {
        //test case 14 x=-2^31,y=2

        BigInteger test2x = new BigInteger("-2147483647");
        BigInteger test2y = new BigInteger(Integer.toString(2));
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest15() {
        //test case 15 x=-2^31,y=2^31+1

        BigInteger test2x = new BigInteger("-2147483647");
        BigInteger test2y = new BigInteger("2147483648");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
    @Test
    public void GCDTest16() {
        //test case 16 x=2^31+1,y=-2^31

        BigInteger test2x = new BigInteger("2147483648");
        BigInteger test2y = new BigInteger("-2147483647");
        BigInteger expected2 = new BigInteger("1");
        assertEquals(expected2, test2x.gcd(test2y));
    }
}