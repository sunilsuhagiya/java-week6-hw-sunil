package week6homework;
// Write a Java program to swap two variables.

import java.util.Scanner;

public class Programme15 {
    public static void main(String [] args){
    Programme15 obj = new Programme15();
    obj.swap();
    }
    public void swap() {
        int a, b, c;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter Value in a :");
        a = scanner.nextInt();
        System.out.println("Enter Value in b :");
        b = scanner.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Values in a:" + a);
        System.out.println("Values in b:" + b);
        scanner.close();
    }
}
