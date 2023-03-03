public class Rectangle extends Shape
{
    private double length,width;
    public Rectangle()
    {
        super();
        length = 0;
        width = 0;
    }
    public Rectangle(double x,double y,double length,double width)
    {
        super(x,y);
        this.length = length;
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public void setLB(double length,double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double area()
    {
        return (length * width);
    }
    public double circumference()
    {
        return (2 * (length + width));
    }
    public String toString()
    {
        return "Rectangle ( Origin : " + getOrigin().toString()  + ", length = " + length + ", width = " + width + ")";
    }

}
