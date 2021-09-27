<<<<<<< HEAD
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
=======
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
>>>>>>> 9249e1644b9b17f21dd46114b4882f4fdc121fd2
}