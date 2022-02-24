import java.util.Scanner;
public class Start
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int start=0,stop=0;
        System.out.println("enter start and stop values");
        start=sc.nextInt();
        stop=sc.nextInt();
        if(start<stop)
        {
            for(int i=start;i<=stop;i++)
            {
                System.out.println(i+" ");
            }
        }
        else if(start>stop)
        {
            for(int i=start;i>=stop;i--)
            {
                System.out.println(i+" ");
            }
        }
        else{
            System.out.println("start and stop values are same");
        }
    }
}