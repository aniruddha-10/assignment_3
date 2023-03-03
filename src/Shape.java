public abstract class Shape{
    private Point point;

    public Shape()
    {
        point = new Point(0.0, 0.0);
    }

    public Shape(double x, double y)
    {
        point = new Point(x, y);
    }

    public void setOrigin(double x, double y) {
        point.setXY(x, y);
    }

    public Point getOrigin() {
        return point;
    }

    public void move(double delta_x, double delta_y) {
        point.move(delta_x, delta_y);
    }

    public double distance(double x1, double y1,double x2,double y2)
    {
        return Point.distance(x1, y1,x2,y2);
    }
    public abstract double area();
    public abstract double circumference();
    public String toString() {
        return "Shape (origin = " + point.toString() + ")";
    }
}
