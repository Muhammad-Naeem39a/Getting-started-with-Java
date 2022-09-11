package Methods;

public class overloading_method {
    public static void main(String[] args) {
        myMethod(10);
        myMethod(10.5);
    }

    static void myMethod(int a) {
        System.out.println(a);
    }

    static void myMethod(Double a) {
        System.out.println(a);
    }
}
