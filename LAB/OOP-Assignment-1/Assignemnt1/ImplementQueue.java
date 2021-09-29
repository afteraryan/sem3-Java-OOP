import java.util.Queue;
import java.util.PriorityQueue;

public class ImplementQueue 
{
    public static void main(String[] args) {
        Queue<Integer> QueueObject = new PriorityQueue<>();
        QueueObject.offer(0);
        QueueObject.offer(1);
        QueueObject.offer(2);
        QueueObject.offer(3);
        System.out.println("Queue: " + QueueObject);
        int accessed = QueueObject.peek();
        System.out.println("Element Accessed: " + accessed);
        int NumberRemove = QueueObject.poll();
        System.out.println("Element Removed: " + NumberRemove);
        System.out.println("New Queue: " + QueueObject);
    }
    
}

