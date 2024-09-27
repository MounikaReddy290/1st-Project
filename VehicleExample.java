package apjfsa;
class Vehicle{
    // Fields for Vehicle class
    private String make;
    private String model;

    // Parameterized constructor for Vehicle class
    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // Getters for Vehicle class
    public void getMake() {
        System.out.println("Make is :"+make);
    }

    public void getModel() {
        System.out.println( "the Model is :"+model);
    }
}

// Define the Car class that inherits from Vehicle
class Car_11 extends Vehicle{
    // Additional field for Car class
    private int year;

    // Parameterized constructor for Car class
    public Car_11(String make, String model, int year) {
        // Call the constructor of the superclass Vehicle
        super(make, model);
        this.year = year;
    }

    // Getter for the year field
    public int getYear() {
        return year;
    }
}

public class VehicleExample{

	public static void main(String[] args) {
        // Create a Car object
        Car_11 obj = new Car_11("Toyota", "Corolla", 2022);
obj.getYear();
obj.getMake();
obj.getModel();

}
}
