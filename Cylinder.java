package baitap2;

public class Cylinder extends Circle {
    double height ;
    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Getarea()*this.height;
    }

    @Override
    public String toString() {
        return
                "radius=" + getRadius() + " "+ getHeight()+ " Volume is " + getVolume();


    }
}
