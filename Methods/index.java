package Methods;

public class index {
    public static void main(String[] args) {
        staticMethod();

        // Instance Method
        index testing = new index();
        testing.instanceMethod();
    }

    static void staticMethod() {
        System.out.println("Main function is executing me directly because I am a static method.");
    }

    void instanceMethod() {
        System.out.println(
                "Main function is executing me by making an instance because I am not a static function and I can't be accesible directly.");
    }
}
