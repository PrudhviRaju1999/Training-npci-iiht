import java.util.Scanner;

public class Condtionals
{

    public static int countD(long n)
        {
            int count = 0;
            while (n != 0) {
                n = n / 10;
                ++count;
            }
            return count;
        }
    public static void main(String [] args)
    {
        Scanner d= new Scanner(System.in);

     int y=d.nextInt();
     int count=countD(y);

     if(count<2)
     {
         System.out.println(y);
     }
     else if(count%2==0)
     {
         System.out.println("number count is "+count+"and square is "+count*count);
         return;
     }
     else if(count%3==0)
     {
         System.out.println("number count is "+count+"and cube is "+count*count*count);
     }
     else if((count-1)%2==0)
     {
         System.out.println("number count is "+count+"and small even  is "+(count-1)+"square is "+((count-1)*(count-1)));
     }
    }
}