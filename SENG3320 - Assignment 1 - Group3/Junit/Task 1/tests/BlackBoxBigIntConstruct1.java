import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.shadow.com.univocity.parsers.common.ArgumentUtils.toByteArray;

class BlackBoxBigIntConstruct1 {
    //if the tests reach the catch statment, it means that the test has failed, and therefore
    //We force a fail output


    @Test /* Test 1 */
    void test1() {
        try {
            byte [] bytesX = {127,-1,};
            BigInteger x = new BigInteger(-2, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }
    }
    @Test/* Test 2 */
    void test2() {
        try {
            byte [] bytesX = {127,-1};
            BigInteger x = new BigInteger(-1, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }
    }
    @Test/* Test 3 */
    void test3() {
        try {
            byte [] bytesX = {127,-1,};
            BigInteger x = new BigInteger(0, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }
    }

    @Test/* Test 4 */
    void test4() {
        try {
            byte [] bytesX = {0};
            BigInteger x = new BigInteger(0, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }

    }
    @Test/* Test 5 */
    void test5() {
        try {
            byte [] bytesX = {127,-1};
            BigInteger x = new BigInteger(1, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }

    }
    @Test/* Test 6 */
    void test6() {
        try {
            byte [] bytesX = {0};
            BigInteger x = new BigInteger(2, bytesX);
            assertNotNull(x);
        }catch(Exception e){
            assertFalse(true);
        }
    }

}