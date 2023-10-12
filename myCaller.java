
import java.util.Arrays;


public class myCaller {
    
    
    public static void main(String[] args) {
        myQueue q = new myQueue();
        System.out.println(q.currentSize);
        System.out.println(q.front);
        System.out.println(q.front());
        System.out.println(Arrays.toString(q.array));
        q.dequeue();
        System.out.println(Arrays.toString(q.array));
    }
    
}
