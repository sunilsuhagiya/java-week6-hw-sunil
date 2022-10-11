package week6homework;

/* 3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme */
public class Programme3 {
    static int a = 50;
    // static int b = 100;
    String name = "Sunil";

    void inMethod() {
        System.out.println(a);
        System.out.println(name);
    }

    public static void stMethod() {
        System.out.println(a);
        System.out.println("sunil");
    }

    public static void main(String[] args) {
        Programme3 obj = new Programme3();
        obj.inMethod();
        stMethod();

    }
}
