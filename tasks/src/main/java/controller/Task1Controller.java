package controller;

import java.util.Scanner;

public class Task1Controller {
    public void run() {
        /* task 1
         * Найти число правильных скобочных выражений, содержащих N открывающихся и N закрывающихся скобок. N вводится с клавиатуры. N неотрицательное целое число
         */

        System.out.println("*****************************************************************************TASK 1*********************************************************************");
        System.out.println("Enter number of brackets: ");
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        if (N < 0) {
            N = Math.abs(N);    // must be non-negative number
        }
        System.out.println("NUMBER OF COMBINATIONS: " + Math.pow(2, N - 1)); // output result

    }
}
