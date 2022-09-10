import java.util.Scanner;

public class if_else_statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("a: " + a + " is greater than b: " + b);
        } else if (b > a) {
            System.out.println("b: " + b + " is greater than a: " + a);
        } else {
            System.out.println("Values are equal");
        }

        // *******************************
        // Short_Hand_If_else_statement  *
        // *******************************

        System.out.println("Enter value of c: ");
        int c = sc.nextInt();
        System.out.println("Enter value of d: ");
        int d = sc.nextInt();
        String e = (c > d) ? "c is greater than d" : "d is greater than c";
        System.out.println(e);

        sc.close();
    }
}