import java.util.*;
public class JavaBasics{

public static void main(String[] args)
{
    int prev=0;
    int firstval=0;
    Scanner sc=new Scanner(System.in);
    firstval=sc.nextInt();
    if(firstval==prev*prev)
    {
        if(firstval%prev==0)
        {
            System.out.println("it is a square and multiple of %d "+(firstval/prev));
        }
        else
        {
            System.out.println("its nly a square");
        }
    }
    else if(firstval%prev==0)
    {
        System.out.println("it is a square and multiple of %d "+(firstval/prev));
    }
    else{
        System.out.println("neither square or multiple");
    }
    sc.close();
}


    
}
