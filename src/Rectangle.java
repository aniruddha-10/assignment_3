public class Rectangle extends Shape
{

    private double length,width;

    /**
     * Default constructor
     */
    public Rectangle()
    {
        super();
        length = 0;
        width = 0;
    }

    /**
     * Constructor to initialize x and y coordinates of the origin and initialize the length and width as well
     * @param x takes the x coordinate of the origin
     * @param y takes the y coordinate of the origin
     * @param length takes the length of the rectangle
     * @param width take the width of the rectangle
     */
    public Rectangle(double x,double y,double length,double width)
    {
        super(x,y);
        this.length = length;
        this.width = width;
    }

    /**
     * Sets the length of the rectangle
     * @param length takes the length and assign it to the appropriate variable
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Sets the width of the rectangle
     * @param width takes the width and assign it to the appropriate variable
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Sets both length and breadth of the rectangle together
     * @param length takes the length and assign it to the appropriate variable
     * @param width takes the width and assign it to the appropriate variable
     */
    public void setLB(double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    /**
     * Returns the length of the rectangle
     * @return returns the value of length of the rectangle
     */
    public double getLength()
    {
        return length;
    }

    /**
     * Returns the width of the rectangle
     * @return returns the value of width of the rectangle
     */
    public double getWidth() {
        return width;
    }

    /**
     * Abstract method which gets overwritten here
     * @return returns the area of the rectangle
     */
    public double area()
    {
        return (length * width);
    }

    /**
     * Abstract method which gets overwritten here
     * @return returns the circumference of the rectangle
     */
    public double circumference()
    {
        return (2 * (length + width));
    }
    /**
     * String method to represent the shape's origin
     * @return returns the coordinate values of the shape and shows it's current state
     */
    public String toString()
    {
        return "Rectangle ( Origin : " + getOrigin().toString()  + ", length = " + length + ", width = " + width + ")";
    }

}
