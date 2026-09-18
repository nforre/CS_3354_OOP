// Journey Forrest, CS 3354, Fall 2026 

public class SphereType extends CircleType {

    /** 
     * @return double
     */
    public double getVolume() {
        return 4 / 3.0 * Math.PI * Math.pow(radius, 3);
    }

    /** 
     * @return double
     */
    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public SphereType() {
        super(); // CircleType()
    }

    public SphereType(double radius) {
        super(radius); // CircleType(double)
    }

    /** 
     * @param args
     */
    public static void main(String[] args) {
        SphereType sphere = new SphereType(10);
        System.out.println("Sphere's volume: " + sphere.getVolume());
        System.out.println("Sphere's surface area: " + sphere.getArea());

        CircleType circle = new CircleType(10);
        System.out.println("Circles's areas: " + circle.getArea());
        System.out.println("=========================");

        displayArea(sphere);

    }

    /** 
     * @param circle
     */
    public static void displayArea(CircleType circle) {
        System.out.println("Printing area within a method.");
        // circle.getVolume();
        System.out.println("Area: " + circle.getArea());
    }
}
