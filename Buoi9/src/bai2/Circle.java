package bai2;

public class Circle implements IShape{
    private double radius;

    Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return radius*radius*3.14;
    }

    @Override
    public double getPerimeter() {
        return 2*3.14*radius;
    }
}
