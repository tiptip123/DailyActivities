
public class caller{
    public static void main (String [] args){
    
        Queue queue = new Queue(5);
        
        queue.enqueue("joseph");
        queue.printArray();
        queue.enqueue("mj");
        queue.enqueue("joash");
        queue.enqueue("jethro");
        queue.enqueue("lester");
         queue.printArray();
          queue.enqueue("jam");
          System.out.println(queue.isFull());
          
          
          queue.dequeue();
          queue.printArray();
          queue.dequeue();
          queue.printArray();
          System.out.println(queue.peek());
          
          System.out.println(queue.size());
          
          
          System.out.println(queue.rear());
          
          queue.dequeue();
          queue.dequeue();
          queue.dequeue();
          
          System.out.println(queue.isEmpty());
          
          
          
    }


}
