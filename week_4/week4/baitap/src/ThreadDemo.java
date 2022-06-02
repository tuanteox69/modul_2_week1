public class ThreadDemo
{
    public static void main (String [] args)
    {
        String x = "abc";
        String y = "abc";
        x.concat(y);
        System.out.print(x);
    }
}