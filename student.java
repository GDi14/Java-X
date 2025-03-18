import java.util.Scanner;
public class student {
    String name;
    int age;
    double mks;
    String stream;
    void accept()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the name of the student, marks and age");
        name = sc.nextLine();
        mks = sc.nextDouble();
        age = sc.nextInt();
    }
    void allocation()
    {
        if (mks>=300)
        {
            stream = "Science and computer";
        }
        else if (mks >= 200 && mks <300)
        stream  ="commerce and computer ";
        else if (mks>=75 && mks<200)
        stream = "arts and animation";
        else 
        stream = "try again";
    }
    void print ()
    {
        System.out.println("Name of the student is " + name);
        System.out.println("Age of the student is " + age);
        System.out.println("Marks of the student is " + mks);
        System.out.println("Stream of the student is " + stream);
    }
    public static void main (String args[])
    {
        student s1 = new student();
        s1.accept();
        s1.allocation();
        s1.print();
    }

}