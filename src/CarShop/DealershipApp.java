package CarShop;

public class DealershipApp {
    public static void main(String[] args) {
        Customer customer = new Customer("Ramaj", "Johnson");
        Car car = new Car("G63", "Mercedes", "Red", 2020);
        String[] details = {car.getColor(), String.valueOf(car.getYear()), car.getMake(), car.getModel()};

        customer.describe()
    }
}
