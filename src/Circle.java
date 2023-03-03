import java.lang.Math;
public class Circle extends Shape
{
    private double radius;
    public Circle()
    {
        super();
        this.radius = 0.0;
    }
    public Circle(double x, double y, double radius)
    {
        super(x,y);
        this.radius = radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    public double getRadius()
    {
        return radius;
    }
    public double area()
    {
        return Math.PI*(radius*radius);
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "Circle ( Origin : " + getOrigin().toString()  + ", Radius = " + radius + ")";
    }
}
