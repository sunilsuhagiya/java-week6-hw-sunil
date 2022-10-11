package week6homework;

import java.util.Scanner;

/*Write a program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).*/
public class Programme6 {
    public static void main(String[] args) {
        radius();
    }
    public static void radius(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any radius:  ");
        double radius = scanner.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle is:  " + area);
        scanner.close();
    }
}
