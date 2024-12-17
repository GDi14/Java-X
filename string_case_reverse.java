//Design a class which reverses the lowercased reversed but all the other letters should remain the same
import java.util.Scanner;
public class string_case_reverse
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word:");
        String wrd = sc.nextLine();
        String newrd ="";
        //Note : be carefull while using the wrapper class functions
        for(int i=0;i<wrd.length();i++)
        {
            char ch = wrd.charAt(i);
            if(Character.isLowerCase(ch))
            {
                newrd=newrd+Character.toUpperCase(ch);
            }
            else
            newrd=newrd+wrd.charAt(i);
        }
        System.out.println("New word:"+newrd);
        sc.close();
    }
}