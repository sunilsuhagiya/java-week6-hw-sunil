package week6homework;

import java.util.Scanner;

/* Write a program to convert the upper case to lower case. */
public class Programme9 {
    public static void main(String[] args) {
        uppertolower();
    }

    public static void uppertolower() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Characters in Upper Case:  ");
        String strUpper = scanner.nextLine();
        String strLower = strUpper.toLowerCase();
        System.out.println("Equivalent Character in Lowercase: " + strLower);
        scanner.close();

    }
}
