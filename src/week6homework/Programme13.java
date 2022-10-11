package week6homework;

import java.util.Scanner;

/* Write a Java program that takes three numbers as input to calculate and
print the average of the numbers. */
public class Programme13 {
    public static void main(String[] args){
    Programme13 obj = new Programme13();
    obj.average();
    }
    private void average(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number:  ");
        double a = scanner.nextDouble();
        System.out.println("Enter Second Number:  ");
        double b = scanner.nextDouble();
        System.out.println("Enter Third Number:  ");
        double c = scanner.nextDouble();
        System.out.println("The Average of 3 Numbers is:  " + (a + b+ c)/3 );
        scanner.close();
    }
}
