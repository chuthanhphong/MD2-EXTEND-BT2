package baitap2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(8.0);
        circle.Getarea();
        System.out.println(circle.toString());
        Cylinder cylinder = new Cylinder();
        circle.setRadius(8.0);
        cylinder.setRadius(8.0);
        cylinder.setHeight(7.0);
        cylinder.getVolume();
        System.out.println(cylinder.toString());
    }
}
