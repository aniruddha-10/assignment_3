import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        int index = 0;
        boolean flag = false;
        Shape[] shapes = new Shape[10];
        Scanner sc = new Scanner(System.in);;
        System.out.print("press 1 to create a rectangle object, 2 for circle object and 3 to view the text menu: ");
        int input = sc.nextInt();
        while(input!=3)
        {
            if (input == 1) {
                Rectangle r = new Rectangle();
                shapes[index] = r;
                index++;
            } else if (input == 2) {
                Circle c = new Circle();
                shapes[index] = c;
                index++;
            }
            System.out.print("press 1 to enter for rectangle, 2 for circle and 3 to view the text menu: ");
            input = sc.nextInt();

        }
        System.out.println("-:WELCOME TO THE TEXT MENU:- ");
        System.out.println("Enter your choice for the following options:");
        System.out.println("1. To set the origin point of the shape ");
        System.out.println("2. To set the dimensions of the shape ");
        System.out.println("3. To display the current state of any shape ");
        System.out.println("4. To move any coordinates of any object");
        System.out.println("5. To compute and display distance between two objects ");
        System.out.println("6. To destroy any object");
        System.out.println("7. To display the current state of all objects");
        System.out.println("8. To quit the text menu");
        System.out.print("Enter the Choice: ");
        int choice = sc.nextInt();
        while(choice<9)
        {
            if(choice == 1)
            {
                System.out.println("Enter the x coordinate of the origin point: ");
                double x = sc.nextDouble();
                System.out.println("Enter the y coordinate of the origin point: ");
                double y = sc.nextDouble();
                for(int i = 0; i < shapes.length;i++)
                {
                    if(shapes[i]!=null)
                    {
                        shapes[i].setOrigin(x,y);
                    }
                }
            }
            if(choice == 2)
            {
                System.out.println("Enter the length of the rectangle: ");
                double l = sc.nextDouble();
                System.out.println("Enter the width of the rectangle: ");
                double b = sc.nextDouble();
                System.out.println("Enter the radius of the circle: ");
                double r = sc.nextDouble();
                for(int i = 0; shapes[i]!= null;i++)
                {
                    if(shapes[i] instanceof Rectangle)
                    {
                        ((Rectangle) shapes[i]).setLength(l);
                        ((Rectangle) shapes[i]).setWidth(b);
                    }

                    if(shapes[i] instanceof Circle)
                    {
                        ((Circle) shapes[i]).setRadius(r);
                    }
                }
            }
            if(choice == 3)
            {
                System.out.println("Enter the index of the object of which you want to see the state: ");
                int ind = sc.nextInt();
                if(shapes[ind] instanceof Rectangle)
                {
                    System.out.println("Origin: " + "(" + shapes[ind].getOrigin().getX() +  "," + shapes[ind].getOrigin().getY() + ")" );
                    System.out.println("Length: " + ((Rectangle) shapes[ind]).getLength());
                    System.out.println("Width: " + ((Rectangle) shapes[ind]).getWidth());
                    System.out.println("Area: " + shapes[ind].area());
                    System.out.println("Circumference: " + shapes[ind].circumference());
                }
                if(shapes[ind] instanceof Circle)
                {
                    System.out.println("Origin: " + "(" + shapes[ind].getOrigin().getX() +  "," + shapes[ind].getOrigin().getY() + ")" );
                    System.out.println("Radius: " + ((Circle) shapes[ind]).getRadius());
                    System.out.println("Area: " + shapes[ind].area());
                    System.out.println("Circumference: " + shapes[ind].circumference());
                }
            }
            if(choice == 4)
            {
                System.out.println("Enter the index of the object of which you want to move the points");
                int a = sc.nextInt();

                    System.out.println("Enter the value for delta x");
                    double delta_x = sc.nextDouble();
                    System.out.println("Enter the value for delta y");
                    double delta_y = sc.nextDouble();
                    shapes[a].move(delta_x,delta_y);
            }
            if(choice == 5)
            {
                System.out.println("Enter the index of the first shape object: ");
                int i1 = sc.nextInt();
                System.out.println("Enter the index of the second shape object ");
                int i2 = sc.nextInt();

                double x1 = shapes[i1].getOrigin().getX();
                double y1 = shapes[i1].getOrigin().getY();

                double x2 = shapes[i2].getOrigin().getX();
                double y2 = shapes[i2].getOrigin().getY();
                System.out.println("The Distance between the origin points of the shape objects: " +Point.distance(x1,y1,x2,y2));
            }
            if (choice == 6)
            {
                System.out.println("Enter the index number for the object you would want to destroy/remove: ");
                int index1 = sc.nextInt();
                shapes[index1]=null;
            }
            if (choice == 7)
            {
                for(int i=0;i< shapes.length;i++)
                {
                    if(shapes[i] instanceof Rectangle)
                    {
                        System.out.println("Origin: " + "(" + shapes[i].getOrigin().getX() +  "," + shapes[i].getOrigin().getY() + ")" );
                        System.out.println("Length: " + ((Rectangle) shapes[i]).getLength());
                        System.out.println("Width: " + ((Rectangle) shapes[i]).getWidth());
                        System.out.println("Area: " + shapes[i].area());
                        System.out.println("Circumference: " + shapes[i].circumference());
                        System.out.println();
                    }
                    else if (shapes[i] instanceof Circle)
                    {
                        System.out.println("Origin: " + "(" + shapes[i].getOrigin().getX() +  "," + shapes[i].getOrigin().getY() + ")" );
                        System.out.println("Radius: " + ((Circle) shapes[i]).getRadius());
                        System.out.println("Area: " + shapes[i].area());
                        System.out.println("Circumference: " + shapes[i].circumference());
                        System.out.println();
                    }
                    else if(shapes[i]==null)
                    {

                    }
                }
            }
            if(choice == 8)
            {
                break;
            }
            System.out.print("Enter your choice for the text menu: ");
            choice = sc.nextInt();
        }
        for(int i = 0;i< shapes.length;i++)
        {
            System.out.println(shapes[i]);
        }
    }
}