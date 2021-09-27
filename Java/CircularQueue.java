import java.util.*
;public class CircularQueue
{
  
   int Queue[] = new int[50];
    
      int n, front, rear;
  
    public CircularQueue(int size)
  
  {
       this.n=size;
    
      this.front = 0;
    
         this.rear=0;
  }
  
    public  void enqueue(int item)
  
  {
      if((rear+1) % n != front)
    
     {
        rear = (rear+1)%n;
        
           Queue[rear] = item;
     }
      else
     
    {
        System.out.println(" Queue is full!");
    }
  }
  
    public  int dequeue()
  
  {
    int item;
  
      if(front!=rear)
    {
      front = (front+1)%n;
      
       item = Queue[front];
      
       return item;
    }

      else
    {
      
         System.out.println("Can’t remove element ");
         return 0;
    }
  }
  
    public void display()
  
  {
      int j;
    
       if(front != rear)
    {
      
        for(j=(front+1)%n ; j<rear ; j=(j+1)%n)
      
      {
      
          System.out.println(Queue[j]);
      }
    
    }
    
       else
      
         System.out.println("Queue is empty ");
  }
  
    public static void main(String args[]) 
  
  {
  
     System.out.print("Size of queue : ");
   
       Scanner sc = new Scanner (System.in);
     
         int size = sc.nextInt();
    
     CircularQueue cq = new CircularQueue(size);
     
       cq.enqueue(2);
       cq.enqueue(40);
       cq.enqueue(6);
       cq.enqueue(8);
       cq.display();
       int data = cq.dequeue();
       System.out.println("element delete is "+data);
       System.out.println(" queue after deletion");
       cq.display();


    sc.close();
  }
}