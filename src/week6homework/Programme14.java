package week6homework;

/* Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
 Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */
public class Programme14 {
    public static void main(String[] args) {
        Programme14 obj = new Programme14();
        obj.ap();
    }

    void ap() {
        double width = 5.6;
        double height = 8.5;
        double perimeter = 2 * (width + height);
        double area = width * height;
        System.out.printf("Area is %.1f * %.1f = %.2f ", width, height, area);
        System.out.println();
        System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f ",  width, height, perimeter);

    }
}
