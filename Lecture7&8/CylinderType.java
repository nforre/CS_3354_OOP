// Journey Forrest, CS 3354, Fall 2026 

public class CylinderType extends CircleType {
    private double height;

    /** 
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /** 
     * @return double
     */
    public double getHeight() {
        return height;
    }

    /** 
     * @return double
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    /** 
     * @return double
     */
    // super.getArea (CircleType)
    // this.getArea || getArea (CylinderType)

    @Override 
    public double getArea() {
        return super.getArea() * 2 + height * Math.PI * radius * 2;
    }

    public CylinderType() {
        super();
    }

    public CylinderType(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /** 
     * @param args
     */
    public static void main(String[] args) {
        CylinderType cylinder = new CylinderType(10,5);
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface area: " + cylinder.getArea());
    }
}
