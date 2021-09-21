public class Circu
{
  
   int Queue[] = new int[50];
    
      int n, front, rear;
  
    public CircularQueue(int size)
  
  {
        n=size;
    
      front = 0;
    
         rear=0;
  }
  
    public static void enqueue(int item)
  
  {
      if((rear+1) % n != front)
    
     {
        rear = (rear+1)%n;
        
           Queue[rear] = item;
     }
      else
     
    {
        System.out.println(” No Insertion -Queue is full!”);
    }
  }
  
    public static int dequeue()
  
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
      
         System.out.println(“Can’t remove element “);
    }
  }
  
    public static void display()
  
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
      
         System.out.println(“Queue is empty cant display!”);
  }
  
    public static void main(String args[]) 
  
  {
  
     System.out.print(“Size of queue : “);
   
       Scanner sc = new Scanner (System.in);
     
         int size = sc.nextInt();
    
     CircularQueue cq = new CircularQueue(size);
     System.out.println(” element in queue are  “);
       cq.enqueue(20);
       cq.enqueue(40);
       cq.enqueue(60);
       cq.enqueue(80);
       cq.display();
       int data = cq.dequeue();
       System.out.println(” element delete is “+data);
       System.out.println(” element in queue after deletion  “);
       cq.display();


    
  }
}