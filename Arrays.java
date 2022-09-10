public class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Ferrari", "Audi", "Volvo", "Civic", "BMW" };
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(cars[0]);

        cars[0] = "Mehran";
        for (String mehran : cars) {
            System.out.println(mehran);
        }
    }
}
