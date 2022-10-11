package week6homework;

import java.util.Scanner;

/* Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog */
public class Programme19 {
    public static void main(String[] args) {
        lowercase();
    }

    public static void lowercase() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter sentence in Upper Case Only:  ");
        String sentence = scanner.nextLine();
        sentence = sentence.toLowerCase();
        System.out.println("Your sentence output:  " + sentence);
        scanner.close();

    }
}
