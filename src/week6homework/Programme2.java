package week6homework;

/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme. */
public class Programme2 {
    static int a = 10;
    static String name = "Sunil";

    public static void pStatic() {
        Programme2 programme2 = new Programme2();
        System.out.println(programme2.a);
        System.out.println(programme2.name);
    }

    public static void main(String[] args) {
        pStatic();
    }


}
