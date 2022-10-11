package week6homework;
/*Write a Java program that takes a number as input and prints its
multiplication table up to 10.*/

import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Programme10 obj = new Programme10();
        obj.table();
    }

    void table() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number between 1 to 10:  ");
        int num1 = scanner.nextInt();
        for (int i = 0; i < 10; i++) {
            System.out.println(num1 + " x " + (i + 1) + " = " +
                    (num1 * (i + 1)));
            scanner.close();
        }
    }
}
