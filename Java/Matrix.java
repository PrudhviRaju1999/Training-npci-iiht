import java.util.*;
public class Matrix {
  public static void main(String[] args) {
    Scanner d= new Scanner(System.in);
    int rows=d.nextInt();
    int columns=d.nextInt();
    int matrix[][]=new int[rows][columns];
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++)
        {matrix[i][j]=d.nextInt();

        }


    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<columns;j++)
        {        
            System.out.println(matrix[i][j]+" ");

        }

        System.out.println( );
    }



  }  
}
