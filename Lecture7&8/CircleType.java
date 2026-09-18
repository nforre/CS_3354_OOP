// Journey Forrest, CS 3354, Fall 2026 

public class CircleType {
    protected double radius;

    /** 
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** 
     * @return double
     */
    public double getRadius() {
        return radius;
    }

    public CircleType() {
        this.radius = 0.0;
    }

    public CircleType(double radius) {
        this.radius = radius;
    }

    /** 
     * @return double
     */
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /** 
     * @param args
     */
    public static void main(String[] args) {
        CircleType circle = new CircleType(3.0);
        System.out.println("The circle's radius is " + circle.getRadius() + ".\nThe circle's area is " + circle.getArea() + ".");
    }
}
