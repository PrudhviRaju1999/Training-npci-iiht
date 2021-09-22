public class EqualMatrix {
	public static void main(String[] args) {
		int[][] first = {{1, 2, 3,7}, {3, 4, 6,9}};
		int[][] second = {{5,1, 2, 3}, {7,3, 4, 6}};
		
		int i, j, temp = 1;
		
		for(i = 0; i < first.length; i++)
		{
			for(j = 0; j < first[0].length; j++)
			{
				if(first[i][j] == second[i][j]) {
					
					first[i][j]=0;
                    second[i][j]=0;
				}
                else
                {
                    temp=0;
                }
			}
		}
		if(temp == 1) {
			System.out.println(" Equal Matrix ");
		}
		else {
			System.out.println("Not Equal  Matrix ");
		}



        for(int x=0;x<first.length;x++){
            for(int y=0;y<first[0].length;y++)
            {        
                System.out.print(first[x][y]+" ");
    
            }
    
            System.out.println( );
        }
        for(int x=0;x<first.length;x++){
            for(int y=0;y<first[0].length;y++)
            {        
                System.out.print(second[x][y]+" ");
    
            }
    
            System.out.println( );
        }
    
	}
}
