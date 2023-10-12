
public class myQueue {

     String[] array = {"Joseph", "Jethro", "Mj", "Joash", "Lester"};
    int maxSize = 6;
    int currentSize;
    int front = currentSize - currentSize +1;
    int rear;
    
    
    
    
    
    
    public myQueue(){
    
        for (int i = 0; i < array.length; i++) {
            this.currentSize = i;    
            this.front = 0;
            this.rear = -1;
        }
    
    
    }
    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public int size() {
        return currentSize;
    }
    
    
    public void enqueue(String item) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            array[rear] = item;
            currentSize++;
            System.out.println("Enqueued: " + item);
        } else {
            System.out.println("Queue is full. Cannot enqueue " + item);
        }
    }
        
        public String dequeue() {
        if (!isEmpty()) {
            String removedItem = array[front];
            array[front] = null;
            front = (front + 1) % maxSize;
            currentSize--;
            System.out.println("Dequeued: " + removedItem);
            return removedItem;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return null;
        }
    }
        
    public String front() {
        if (!isEmpty()) {
            return array[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return null;
        }
    }
    
    public String rear() {
        if (!isEmpty()) {
            return array[rear];
        } else {
            System.out.println("Queue is empty.");
            return null;
        }
    }
    
    
    
    
    

}
