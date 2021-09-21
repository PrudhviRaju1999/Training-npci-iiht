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
         System.out.println("number is %d"+y+"and square is "+y*y);
         return;
     }
     else if(count%3==0)
     {
         System.out.println("number is %d"+y+"and cube is "+y*y*y);
     }
     else if((y-1)%2==0)
     {
         System.out.println("number is %d"+y+"and small even  is "+(y-1)+"square is "+y*y);
     }
    }
}