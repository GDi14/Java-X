//Design a class to store 10 names and only print the names containing 'A' or 'a' and ends with 'A' or 'a'
import java.util.Scanner;
public class words
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 words:");
        String wrd[] = new String[10];
        for(int i=0;i<10;i++)
        {
            wrd[i]=sc.nextLine();
        }
        for(int i=0;i<10;i++)
        {
            char firlet=wrd[i].charAt(0);
            char laslet=wrd[i].charAt(wrd[i].length()-1);
            if(firlet == 'A' || firlet == 'a' && laslet == 'A' || laslet == 'a')
            System.out.println();
            System.out.println(wrd);
        }
        sc.close();
    }
}