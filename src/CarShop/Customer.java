package CarShop;

public class Customer implements Describable {
    private String firstName;
    private String lastName;

    private Car newCar;
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String describe(String details) {
        return String.format("Hey there %s %s, it looks like your %s, %s, %s, %s is ready to go!", firstName, lastName, newCar.getColor(), newCar.getYear(), newCar.getMake(), newCar.getModel());
    }

}
