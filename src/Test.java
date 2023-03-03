import java.util.Scanner;
public class Test
{
    public static void main(String[] args)
    {
        int index = 0;                                                                                                      // to keep track of the index of the array
        Shape[] shapes = new Shape[10];             // array to store the object references
        Scanner sc = new Scanner(System.in);;
        System.out.print("Enter 1 to create a rectangle object, 2 for a circle object and 3 to view the text menu: ");
        int input = sc.nextInt();    // takes the input option from the user to form rectangle or circle objects
        while(input!=3)
        {
            if (input == 1) {
                Rectangle r = new Rectangle();      // creates an object of the rectangle class
                shapes[index] = r;
                index++;
            } else if (input == 2) {
                Circle c = new Circle();            // creates an object of the circle class
                shapes[index] = c;
                index++;
            }
            else
            {
                System.out.println("Invalid Input!!");  // if there's an invalid input
            }
            System.out.print("Enter 1 to create a rectangle object, 2 for a circle object and 3 to view the text menu: ");
            input = sc.nextInt();
        }

        // Text Menu for the user to choose
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
            // To set the origin for the shapes
            if(choice == 1)
            {
                System.out.println("Enter the index of the shape object whose origin you want to set: ");
                int a = sc.nextInt();
                System.out.println("Enter the x coordinate of the origin point: ");
                double x = sc.nextDouble();
                System.out.println("Enter the y coordinate of the origin point: ");
                double y = sc.nextDouble();
                for (Shape shape : shapes) {
                    if (shape != null) {
                        shapes[a].setOrigin(x, y);
                    }
                }
            }
            // To specify the dimensions of the shapes in the array
            if(choice == 2)
            {
                System.out.println("Enter the index of the shape object whose dimension you want to specify: ");
                int z = sc.nextInt();
                if(shapes[z] instanceof Rectangle && shapes[z]!=null)
                {
                    System.out.println("Enter the length of the rectangle: ");
                    double l = sc.nextDouble();
                    System.out.println("Enter the width of the rectangle: ");
                    double b = sc.nextDouble();
                    ((Rectangle) shapes[z]).setLength(l);
                    ((Rectangle) shapes[z]).setWidth(b);
                }
                else if (shapes[z] instanceof Circle && shapes[z]!=null)
                {
                    System.out.println("Enter the radius of the circle: ");
                    double r = sc.nextDouble();
                    ((Circle) shapes[z]).setRadius(r);
                }
            }
            // To see the current state of any object as per the user's choice
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
            // To move the origin's coordinate points as per the user specified values
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
            // To compute the distance between any two point objects
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
            // To remove any object reference from the array
            if (choice == 6)
            {
                System.out.println("Enter the index number for the object you would want to destroy/remove: ");
                int index1 = sc.nextInt();
                shapes[index1]=null;
            }
            // This choice will display the current state for all the objects in the array
            if (choice == 7)
            {
                for(int i=0;i< shapes.length;i++)
                {
                    // checks if the object reference is an instance of the Rectangle class
                    if(shapes[i] instanceof Rectangle)
                    {
                        System.out.println("Origin: " + "(" + shapes[i].getOrigin().getX() +  "," + shapes[i].getOrigin().getY() + ")" );
                        System.out.println("Length: " + ((Rectangle) shapes[i]).getLength());
                        System.out.println("Width: " + ((Rectangle) shapes[i]).getWidth());
                        System.out.println("Area: " + shapes[i].area());
                        System.out.println("Circumference: " + shapes[i].circumference());
                        System.out.println();
                    }
                    // checks if the object reference is an instance of the circle class
                    else if (shapes[i] instanceof Circle)
                    {
                        System.out.println("Origin: " + "(" + shapes[i].getOrigin().getX() +  "," + shapes[i].getOrigin().getY() + ")" );
                        System.out.println("Radius: " + ((Circle) shapes[i]).getRadius());
                        System.out.println("Area: " + shapes[i].area());
                        System.out.println("Circumference: " + shapes[i].circumference());
                        System.out.println();
                    }
                }
            }
            // if the user wants to quit the program
            if(choice == 8)
            {
                break;
            }
            System.out.print("Enter your choice for the text menu: ");
            choice = sc.nextInt();
        }
    }
}