package CarShop;

import java.util.Arrays;

public class DealershipApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Ramaj", "Johnson");
        Car car = new Car("G63", "Mercedes", "Red", 2020);
        String details = String.format("%s, %s, %s %s",car.getColor(), String.valueOf(car.getYear()), car.getMake(), car.getModel() );
        //System.out.println(details);
        System.out.println(customer.describe(details));
    }
}
