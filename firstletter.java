import java.util.Scanner;
public class firstletter
{
   public static void main(String args[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence:");
    String sent =sc.nextLine();
    String wrd = "";
    sent = sent.toUpperCase();
    for(int i=0;i<sent.length();i++)
    {
        // here we extract each word and store them in a temporary variable called 'wrd'
        if(sent.charAt(i) != ' ')
        wrd=wrd+sent.charAt(i);
        
        //here we check if the word store in 'wrd' has first letter 'A', if it has it prints the word and then clears and then 
        //moves to find teh next word
        if(wrd.charAt(0)=='A')
        {
            System.out.println(wrd);
        }
    }
    sc.close();
   } 
}