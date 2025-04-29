package lab.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MultiplicationTest {
    // test commit 
    // test conflict 
    @Test

    void testMultiplyPositive() {

        Multiplication calc = new Multiplication();

        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 нь 6-тай тэнцүү байх ёстой");

    }

    @Test

    void testMultiplyNegative() {

        Multiplication calc = new Multiplication();

        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 нь -6-тай тэнцүү байх ёстой");

    }

}