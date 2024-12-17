//Input name of a subscriber, mobile number, previous reading and present reading. Find number of calls, 
//phone charge and print a bill. The charge is Rs. 0.80 per call.

import java.util.Scanner;
public class mobile_bill
{
    public static void main( String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter name, mobile number, previous reading and present reading:");
        String name = sc.nextLine();
        long num=sc.nextLong();
        int prev_reading = sc.nextInt();
        int cur_reading = sc.nextInt();
        int calls = cur_reading-prev_reading;
        double charge = calls*0.80;
        System.out.println("Name:"+name);
        System.out.println("Mobile number:"+num);
        System.out.println("Number of calls:"+calls);
        System.out.println("Amount charged:"+charge);
        sc.close();
    }
}