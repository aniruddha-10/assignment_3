public abstract class Shape extends Object
{
    private Point point;
    public Shape()
    {
        point = new Point(0.0,0.0);
    }
    public Shape(double x, double y)
    {
        point = new Point(x,y);
    }
    public void setOrigin(double x,double y)
    {
        point.setXY(x,y);
    }
    public Point getOrigin()
    {
        return point;
    }

}
