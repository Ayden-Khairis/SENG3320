import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CompareTo {
    @Test
    public void Test1(){
        //test case 1 x=3, y=4
        BigInteger testx=new BigInteger("3");
        BigInteger testy=new BigInteger("4");
        assertEquals(-1,testx.compareTo(testy));
    }
    @Test
    public void Test2(){
        //test case 2 x=3, y=3
        BigInteger testx=new BigInteger("3");
        BigInteger testy=new BigInteger("3");
        assertEquals(0,testx.compareTo(testy));
    }
    @Test
    public void Test3(){
        //test case 3 x=5, y=1
        BigInteger testx=new BigInteger("5");
        BigInteger testy=new BigInteger("1");
        assertEquals(1,testx.compareTo(testy));
    }
    @Test
    public void Test4(){
        //test case 4 x=2147483648, y=-2147483648
        BigInteger testx=new BigInteger("2147483648");
        BigInteger testy=new BigInteger("-2147483648");
        assertEquals(1,testx.compareTo(testy));
    }
    @Test
    public void Test5(){
        //test case 5 x=-2147483648, y=2
        BigInteger testx=new BigInteger("-2147483648");
        BigInteger testy=new BigInteger("2");
        assertEquals(-1,testx.compareTo(testy));
    }
    @Test
    public void Test6(){
        //test case 6 x=2147483648, y=2
        BigInteger testx=new BigInteger("2147483648");
        BigInteger testy=new BigInteger("2");
        assertEquals(1,testx.compareTo(testy));
    }
    @Test
    public void Test7(){
        //test case 7 x=2, y=2147483648
        BigInteger testx=new BigInteger("2");
        BigInteger testy=new BigInteger("2147483648");
        assertEquals(-1,testx.compareTo(testy));
    }
    @Test
    public void Test8(){
        //test case 8 x=2147483648, y=2147483648
        BigInteger testx=new BigInteger("2147483648");
        BigInteger testy=new BigInteger("2147483648");
        assertEquals(0,testx.compareTo(testy));
    }
    @Test
    public void Test9(){
        //test case 9 x=2, y=2147483648
        BigInteger testx=new BigInteger("2");
        BigInteger testy=new BigInteger("2147483648");
        assertEquals(-1,testx.compareTo(testy));
    }

}
