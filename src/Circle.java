import java.lang.Math;
public class Circle extends Shape
{
    /**
     * Default constructor
     */
    private double radius;
    public Circle()
    {
        super();
        this.radius = 0.0;
    }

    /**
     * Constructor to initialize x and y coordinates of the origin and initialize the radius of circle as well
     * @param x x takes the x coordinate of the origin
     * @param y takes the y coordinate of the origin
     * @param radius takes the radius of the circle
     */
    public Circle(double x, double y, double radius)
    {
        super(x,y);
        this.radius = radius;
    }

    /**
     * Sets the radius of the circle
     * @param radius takes the radius of the circle and assign it to the appropriate variable
     */
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    /**
     * Returns the radius of the circle
     * @return returns the value of radius of the circle
     */
    public double getRadius()
    {
        return radius;
    }
    /**
     * Abstract method which gets overwritten here
     * @return returns the area of the rectangle
     */
    public double area()
    {
        return Math.PI*(radius*radius);
    }
    /**
     * Abstract method which gets overwritten here
     * @return returns the circumference of the rectangle
     */
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    /**
     * String method to represent the shape's origin
     * @return returns the coordinate values of the shape and shows it's current state
     */
    public String toString()
    {
        return "Circle ( Origin : " + getOrigin().toString()  + ", Radius = " + radius + ")";
    }
}
