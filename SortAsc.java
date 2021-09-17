

public class SortAsc { 

    static void displayAndcheck(int a, int arr[]){
      System.out.println("Elements: ");    
      for (int i = 0; i < arr.length; i++) {
          if(a==arr[i]){
          System.out.print(i + " ");  }  
      }   
      }
         
      public static void main(String[] args) {        
              
              
          int [] arr = new int [] {5, 2, 8, 7, 1};     
          int temp = 0;    
              
            
                 
          for (int i = 0; i < arr.length; i++) {     
              for (int j = i+1; j < arr.length; j++) {     
                 if(arr[i] > arr[j]) {    
                     temp = arr[i];    
                     arr[i] = arr[j];    
                     arr[j] = temp;    
                 }     
              }     
          }  
          
          displayAndcheck(5,arr);



            
      }
  }  