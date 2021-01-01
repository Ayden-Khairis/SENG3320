import org.junit.Test;
import java.math.BigInteger;
import static org.junit.Assert.*;

public class TestModInverse {

    public static BigInteger testModInverse(BigInteger x, BigInteger y)
    {
        BigInteger resultOfTest;

        resultOfTest = x.modInverse(y);

        System.out.println("Result of test: " + resultOfTest + " = " + x.toString() + ".modInverse(" + y.toString() + ")" );

        return resultOfTest;
    }

    @Test
    public void testModInverse() {


        //test cases for 100% statement coverage

        // assertEquals(new BigInteger("1"),main.testModInverse(new BigInteger("4"),new BigInteger("-3"))); //modulus not positive  #1
        assertEquals(new BigInteger("0"),testModInverse(new BigInteger("9"),new BigInteger("1"))); //test case #2
        assertEquals(new BigInteger("1"),testModInverse(new BigInteger("1"),new BigInteger("9"))); //test case #3
        assertEquals(new BigInteger("4005329459"),testModInverse(new BigInteger("3454565789"),new BigInteger("4234356765"))); //test case #4
        assertEquals(new BigInteger("229027306"),testModInverse(new BigInteger("-3454565789"),new BigInteger("4234356765"))); //test case #5
        assertEquals(new BigInteger("7"),testModInverse(new BigInteger("4"),new BigInteger("9"))); //test case #6
        assertEquals(new BigInteger("2"),testModInverse(new BigInteger("-4"),new BigInteger("9"))); //test case #7


        //extra test cases needed to complete 100% branch coverage
        assertEquals(new BigInteger("2"),testModInverse(new BigInteger("32"),new BigInteger("9"))); //test case #2
        assertEquals(new BigInteger("186850079"),testModInverse(new BigInteger("4234356765"),new BigInteger("3454565789"))); //test case #2
        assertEquals(new BigInteger("2"),testModInverse(new BigInteger("32"),new BigInteger("9"))); //test case #2


        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        //test cases for 100% condition and 100% condition/decision coverage

        // assertEquals(new BigInteger("1"),main.testModInverse(new BigInteger("6"),new BigInteger("-4"))); //modulus not positive  #1
        assertEquals(new BigInteger("7"),testModInverse(new BigInteger("4"),new BigInteger("9"))); //test case #2
        assertEquals(new BigInteger("0"),testModInverse(new BigInteger("6"),new BigInteger("1"))); //test case #3
        assertEquals(new BigInteger("1"),testModInverse(new BigInteger("1"),new BigInteger("9"))); //test case #4
        assertEquals(new BigInteger("2"),testModInverse(new BigInteger("-4"),new BigInteger("9"))); //test case #5
        assertEquals(new BigInteger("1"),testModInverse(new BigInteger("9"),new BigInteger("4"))); //test case #6
        assertEquals(new BigInteger("5"),testModInverse(new BigInteger("3121221332"),new BigInteger("9"))); //test case #7
        assertEquals(new BigInteger("2172113904"),testModInverse(new BigInteger("3234445654"),new BigInteger("4234654889"))); //test case #8
        assertEquals(new BigInteger("2062540985"),testModInverse(new BigInteger("-3234445654"),new BigInteger("4234654889"))); //test case #9




    }
}