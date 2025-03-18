//make a program for finding the area of rectangle, square, circle, triangle using menu driven
import java.util.Scanner;
public class overloading{
    static void area (int l, int b)
    {
        System.out.println("Area of rectangle is " + (l*b));
    }
    static void area (int s)
    {
        System.out.println("Area of square is " + (s*s));
    }
    static void area (double r)
    {
        System.out.println("Area of circle is " + (3.14*r*r));
    }
    static void area (double b,double h)
    {
        System.out.println("Area of triangle is " + (0.5*b*h));
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Menu  -  for area");
        System.out.println("1. rectangle");
        System.out.println("2. square");
        System.out.println("3. circle");
        System.out.println("4. triangle");
        System.out.println("Enter your choice:");
        int ch  = sc.nextInt(); // Changed from char to int
        switch(ch)
        {
            case 1: 
            {
                System.out.println("Enter the length and breadth of the rectangle:");
                int l = sc.nextInt();
                int b = sc.nextInt();
                area(l,b);
                break;
            }
            case 2 : 
            {
                System.out.println("Enter the side of the square:");
                int s = sc.nextInt();
                area(s);
                break;
            }
            case 3 : 
            {
                System.out.println("Enter the radius of the circle");
                double r = sc.nextDouble();
                area(r);
                break;
            }
            case 4 : 
            {
                System.out.println("Enter the base and height of the triangle");
                double b = sc.nextDouble();
                double h = sc.nextDouble();
                area(b,h);
                break;
            }
            default : 
            {
                System.out.println("Invalid choice");
                break;
            }
        }

    }  
 

}