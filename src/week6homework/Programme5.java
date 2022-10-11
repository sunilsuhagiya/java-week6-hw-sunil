package week6homework;

import java.util.Scanner;

/*Write a program for a calculator with addition, subtraction, multiplication
         and division methods all with parameters and use string concatenation
         methods.(Note: Two static and Two instance methods).*/
public class Programme5 {
    public static void main(String[] args) {
        add();
        sub();
        Programme5 obj = new Programme5();
        obj.multiplication();
        obj.division();
    }

    public static void add() {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:  ");
        a = scanner.nextInt();
        System.out.println("Enter Second Number:  ");
        b = scanner.nextInt();
        int c = a + b;
        System.out.println("Addition of two number is :  " + c);
        scanner.close();
    }

    public static void sub() {
        int d, e;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:  ");
        d = scanner.nextInt();
        System.out.println("Enter Second Number:  ");
        e = scanner.nextInt();
        int f = d - e;
        System.out.println("Subtraction of two number is :  " + f);
        scanner.close();
    }

    public void multiplication() {
        int m, n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:  ");
        m = scanner.nextInt();
        System.out.println("Enter Second Number:  ");
        n = scanner.nextInt();
        int o = m * n;
        System.out.println("Multiplication of two number is:  " + o);
        scanner.close();
    }

    public void division() {
        int x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:  ");
        x = scanner.nextInt();
        System.out.println("Enter Second Number:  '");
        y = scanner.nextInt();
        int z = x / y;
        System.out.println("Division of two number is:  " + z);
        scanner.close();
    }
}
