import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils.toByteArray;

class BlackBoxBigIntConstruct2 {
    //if the tests reach the catch statment, it means that the test has failed, and therefore
    //We force a fail output

    @Test /* Test 1 */
    void test1() {
        try {
            byte [] bytesX = {127,-1,};
            BigInteger x = new BigInteger("123AFE",16);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }

    }
    @Test/* Test 2 */
    void test2() {
        try {
            byte [] bytesX = {127,-1};
            BigInteger x = new BigInteger("123AFZ",16);
            assertNotNull(x);
        }catch(Exception e){ assertFalse(true); }

    }
    @Test/* Test 3 */
    void test3() {
        try {
            byte [] bytesX = {127,-1,};
            BigInteger x = new BigInteger("123AFEZYX",16);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }
    }

    @Test/* Test 4 */
    void test4() {
        try {
            byte [] bytesX = {0};
            BigInteger x = new BigInteger("123AFEZYX",36);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }

    }
    @Test/* Test 5 */
    void test5() {
        try {
            byte [] bytesX = {127,-1};
            BigInteger x = new BigInteger("123AFEZYX",37);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }

    }

}