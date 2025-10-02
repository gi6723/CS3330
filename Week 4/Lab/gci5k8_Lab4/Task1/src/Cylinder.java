public class Cylinder {
    // Initialize attributes
    private double radius;
    private double height;
    private final double PI = 3.14159;

    // Constructor for cylinder
    public Cylinder(double r, double h){
        radius = r;
        height = h;
    }
    //setters for the attributes
    public void setRadius(double r){
        radius = r;
    }

    public void setHeight(double h){
        height = h;
    }


    //getters for the attributes and methods to calculate volume, curved surface area and total surface area
    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

   public double getVolume(){
        return PI * radius * radius * height;
   }

   public double getCurvedSurfaceArea(){
        return 2 * PI * radius * height;
   }

   public double getTotalSurfaceArea(){
        return 2 * PI * radius * (radius + height);
   }

}
