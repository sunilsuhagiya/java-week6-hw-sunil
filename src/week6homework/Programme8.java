package week6homework;

import java.util.Scanner;

/*Write a program to calculate the area of a triangle */
public class Programme8 {
    public static void main(String [] args){
        Programme8 obj = new Programme8();
        obj.area();
    }
    private void area(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width:   ");
        double base = scanner.nextDouble();
        System.out.println("Enter Height:  ");
        double height = scanner.nextDouble();
        double area = (base* height)/2;
        System.out.println("Area of Triangle is:   " + area);
        scanner.close();
    }

}
