public class temp {
    public static void main(String args[])
    {
        int a =2;
        int b =3;
        b *= (a++)- (++b) + (++a);
        System.out.println("a=" +a);
        System.out.println("b="+b);
    }
}
