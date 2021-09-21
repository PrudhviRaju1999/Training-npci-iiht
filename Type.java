import java.util.*;
public class Type{
    public static void main(String[] args) {
        Scanner d = new Scanner (System.in);
        
         if (d.hasNextInt())
         {  if(d.nextInt()<34000)
            System.out.println(" Short");
            else
            System.out.println(" Int ");
         }
         else if (d.hasNextFloat())
        System.out.println(" Float"); 
        else if (d.hasNextDouble())
        System.out.println("Double");
        //else if(d.hasNextLong())
    }
}