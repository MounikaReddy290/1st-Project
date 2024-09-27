package apjfsa;

// Define the interface
interface ThreeDFigure1{
	//method to calculate curved surface area 
    double curvedSurfaceArea();
    // method to calculate total surface area
    double totalSurfaceArea();
    //method to calculate volume
    double volume();
}

// Implement the Cylinder class
class Cylinder implements ThreeDFigure1 {
    private double radius;
    private double height;

    //  Constructor
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double curvedSurfaceArea() {
        return 2 * 3.14 * radius * height;
    }

    @Override
    public double totalSurfaceArea() {
    return 2 * 3.14 * radius * (radius + height);
    }

    @Override
    public double volume() {
        return 3.14 * radius * radius * height;
    }
}

// Example usage
public class ThreeDFigure{
    public static void main(String[] args) {
        double radius = 5;
        double height = 10;
        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println("Cylinder with radius " + radius + " and height " + height);
        System.out.println("Curved Surface Area: " + cylinder.curvedSurfaceArea());
        System.out.println("Total Surface Area: " + cylinder.totalSurfaceArea());
        System.out.println("Volume: " + cylinder.volume());
    }
}
