//design a ajava class t change all lower case letter to uppercase letters and print each word in a new line
import java.util.Scanner;
public class seperateline
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sent = sc.nextLine();
        sent = sent.toUpperCase();
        for(int i=0;i<sent.length();i++)
        {
                if(sent.charAt(i) != ' ')
                {
                    System.out.print(sent.charAt(i));
                }
                else
                System.out.println();
        }
        sc.close();
    }
}