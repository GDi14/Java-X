import java.util.Scanner;
public class overloading2
{
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
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length and breadth of reactangle");
        int l = sc.nextInt();
        int b = sc.nextInt();
        area(l,b);  
        System.out.println("enter side of square");
        int s = sc.nextInt();
        area(s);
        System.out.println("enter radius of circle");
        double r = sc.nextDouble();
        area(r);
        System.out.println("enter base and height of triangle");
        double b1 = sc.nextDouble();
        double h = sc.nextDouble();
        area(b1,h);
    }
}