package Methods;

public class recursion_method {
    public static void main(String[] args) {
        int result=sum(5);
        System.out.println(result);
    }

    static int sum(int a) {
        if (a > 0) {
            return a + sum(a - 1);
        }
        return 0;
    }
}
