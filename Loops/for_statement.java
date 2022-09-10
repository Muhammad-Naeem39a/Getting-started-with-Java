package Loops;

public class for_statement {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
         System.out.println(i);   
        }

        // *******************************
        // For_each_loop                 *
        // *******************************

        String[] cars={"Ferrari", "Land Rover", "Volvo", "Audi", "Civic"};
        for (String car: cars) {
           System.out.println(car); 
        }
    }
}
