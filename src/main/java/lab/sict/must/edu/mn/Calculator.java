package lab.sict.must.edu.mn;

import java.util.Scanner;

/**
 * Simple calculator class.
 */
public final class Calculator {

    private Calculator() {
        // Prevent instantiation
    }

    /**
     * Entry point of the calculator application.
     *
     * @param args the input arguments
     */
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        double a;
        double b;
        double c = 0.0;

        System.out.println("Enter the first number");
        a = in.nextDouble();
        System.out.println("And enter second");
        b = in.nextDouble();
        System.out.println("Choose the operation:"
                + "\n1. Addition"
                + "\n2. Subtraction"
                + "\n3. Multiplication"
                + "\n4. Division"
                + "\n5. Power"
                + "\n# Please enter the number of operation");

        double operation = in.nextDouble();
        final double addition = 1;
        final double subtraction = 2;
        final double multiplication = 3;
        final double division = 4;
        final double power = 5;

        if (operation == addition) {
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
        } else if (operation == subtraction) {
            c = a - b;
            System.out.println(a + " - " + b + " = " + c);
        } else if (operation == multiplication) {
            c = a * b;
            System.out.println(a + " * " + b + " = " + c);
        } else if (operation == division) {
            c = a / b;
            System.out.println(a + " / " + b + " = " + c);
        } else if (operation == power) {
            System.out.println("Enhance A or B?"
                    + "\n1. A"
                    + "\n2. B");
            double enhance = in.nextDouble();
            final double first = 1;
            final double second = 2;

            if (enhance == first) {
                System.out.println(Math.pow(a, 2));
            } else if (enhance == second) {
                System.out.println(Math.pow(b, 2));
            }
        }

        in.close();
    }
}
