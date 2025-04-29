package lab.sict.must.edu.mn;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class CalculatorTest {

    @Test
    void testAddition() {
        String input = "5\n3\n1\n"; // a=5, b=3, operation=1 (Addition)
        String expected = "5.0 + 3.0 = 8.0";

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testSubtraction() {
        String input = "5\n3\n2\n"; // a=5, b=3, operation=2 (Subtraction)
        String expected = "5.0 - 3.0 = 2.0";

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testMultiplication() {
        String input = "5\n3\n3\n"; // a=5, b=3, operation=3 (Multiplication)
        String expected = "5.0 * 3.0 = 15.0";

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testDivision() {
        String input = "6\n3\n4\n"; // a=6, b=3, operation=4 (Division)
        String expected = "6.0 / 3.0 = 2.0";

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testPowerEnhanceA() {
        String input = "2\n3\n5\n1\n"; // a=2, b=3, operation=5 (Power), enhance=1 (A)
        String expected = "4.0"; // 2^2 = 4.0

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testPowerEnhanceB() {
        String input = "2\n3\n5\n2\n"; // a=2, b=3, operation=5 (Power), enhance=2 (B)
        String expected = "9.0"; // 3^2 = 9.0

        assertConsoleOutputContains(input, expected);
    }

    @Test
    void testInvalidOperation() {
        String input = "5\n3\n6\n"; // a=5, b=3, operation=6 (invalid)
        assertConsoleOutputContains(input, ""); // Should not crash
    }

    @Test
    void testInvalidEnhanceInput() {
        String input = "2\n3\n5\n3\n"; // a=2, b=3, operation=5 (power), then 3 (invalid enhance)
        assertConsoleOutputContains(input, ""); // Should not crash
    }

    private void assertConsoleOutputContains(String input, String expectedOutput) {
        // Backup original
        PrintStream originalOut = System.out;
        java.io.InputStream originalIn = System.in;

        try {
            // Setup new input and output
            ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setIn(in);
            System.setOut(new PrintStream(out));

            // Call main
            Calculator.main(new String[] {});

            // Check output
            String consoleOutput = out.toString();
            assertTrue(consoleOutput.contains(expectedOutput));
        } finally {
            // Restore original
            System.setOut(originalOut);
            System.setIn(originalIn);
        }
    }
}
