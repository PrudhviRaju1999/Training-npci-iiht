import java.util.*;
public class Fibonacci
{
    public static void main(String[] args) {
        int n=0;
        Scanner d= new Scanner(System.in);
        n=d.nextInt();
        
        int arr[]=new int[n];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }}}