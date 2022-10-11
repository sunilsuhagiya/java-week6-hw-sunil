package week6homework;
/*4. Write a Java programme using the following steps.
        4.1 Declare two instance and two static variables.
        4.2 Declare one instance method.
        4.3 Declare one static method.
        4.4 Call all four instance and static variables into both instance and static methods inside the
        print statement.
        4.5 Declare the Main method.
        4.6 Call both instance and static methods into the Main method and run the programme.*/

public class Programme4 {
    int instance1 = 10;
    int instance2 = 20;
    static int c = 30;
    static int d = 40;

    private void iMethod() {
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(c);
        System.out.println(d);

    }

    public static void sMethod() {
        Programme4 object = new Programme4();
        System.out.println(object.instance1);
        System.out.println(object.instance2);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.iMethod();
        sMethod();
    }
}
