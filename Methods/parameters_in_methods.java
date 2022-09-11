package Methods;

public class parameters_in_methods {
    public static void main(String[] args) {
        myMethod(10);
        addMethod(20, 30);
        myName("Sufyan", "Khan");
        checkAge(18);
    }

    static void myMethod(int a) {
        System.out.println(a);
    }

    static void addMethod(int a, int b) {
        System.out.println(a + b);
    }

    static void myName(String fName, String lName) {
        System.out.println(fName + " " + lName);
    }

    static void checkAge(int age) {

        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }
}
