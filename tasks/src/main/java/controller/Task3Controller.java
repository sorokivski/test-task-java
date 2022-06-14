package controller;

import java.math.BigInteger;

public class Task3Controller {
    public void run() {
        /**
         * task 3
         * Find the sum of the digits in the number 100! (i.e. 100 factorial)
         * {Correct answer: 648}
         *
         */
        System.out.println("*****************************************************************************TASK 3*********************************************************************");
        int num = 100;
        BigInteger factorial = BigInteger.valueOf(1); // using BigInteger for calculate factorial of 100
        for (int i = 1; i <= num; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i)); // calculation of factorial (1*2*3*...*99*100)
        }

        String s = factorial.toString(); // transforming big number to string for simpler calculations

        int sum = 0; // initialization of sum

        for (int i = 0; i < s.length(); i++) { // cycle for calculate sum of digits

            num = s.charAt(i) - '0';     // digit = digit at i position - ASCII-code of ZERO
            sum = sum + num;          // summarize digits

        }
        System.out.println("Sum:" + sum); // output sum
    }
}
