public abstract class Shape{
    private Point point;

    /**
     * Default Constructor to create an instance from the point class
     */
    public Shape()
    {
        point = new Point(0.0, 0.0);
    }

    /**
     * Constructor to initialize the parameters
     * @param x this gets initialised to the instance variable in Point class
     * @param y this gets initialised to the instance variable in Point class
     */
    public Shape(double x, double y)
    {
        point = new Point(x, y);
    }

    /**
     * Sets the x and y coordinates of the origin
     * @param x gets initialised to the instance variable value in Point class
     * @param y gets initialised to the instance variable value in Point class
     */
    public void setOrigin(double x, double y) {
        point.setXY(x, y);
    }

    /**
     * Returns the origin coordinates
     * @return returns the coordinate of the point origin
     */
    public Point getOrigin() {
        return point;
    }

    /**
     * moves the origin accodrding to the values given by the user
     * @param delta_x for changing the x coordinate of the point
     * @param delta_y for changing the y coordinate of the point
     */
    public void move(double delta_x, double delta_y) {
        point.move(delta_x, delta_y);
    }

    /**
     * calculates the distance between the origin of two objects
     * @param x1 takes the x coordinate of the first origin point
     * @param y1 takes the y coordinate of the first origin point
     * @param x2 takes the x coordinate of the second origin point
     * @param y2 takes the y coordinate of the second origin point
     * @return
     */
    public double distance(double x1, double y1,double x2,double y2)
    {
        return Point.distance(x1, y1,x2,y2);
    }

    /**
     * Abstract method will be overwritten in the subclasses
     * @return will return the area of the rectangle
     */
    public abstract double area();

    /**
     * Abstract method will be overwritten in the subclasses
     * @return will return the circumference of the rectangle
     */
    public abstract double circumference();

    /**
     * String method to represent the shape's origin
     * @return returns the coordinate values of ther origin
     */
    public String toString() {
        return "Shape (origin = " + point.toString() + ")";
    }
}
