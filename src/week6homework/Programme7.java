package week6homework;

import java.util.Scanner;

/* Write a program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).*/
public class Programme7 {
    public static void main(String[] args) {
        Programme7 obj = new Programme7();
        obj.celsius();
    }

    public void celsius() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:  ");
        double fahrenheit = scanner.nextDouble();
        double celcius = ((fahrenheit - 32) * 5 / 9);
        System.out.println(fahrenheit + " fahrenheit is  " + celcius + " celsius ");
        scanner.close();
    }
}
