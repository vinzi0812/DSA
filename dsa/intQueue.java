package dsa;
import java.util.*;
public class intQueue
{
    int front, rear, size;
    int[] queue;
    public intQueue()
    {
        front = 0;
        rear = -1;
        size = 100;
        queue = new int[size];
    }
    public void Enqueue(int c)
    {
        if(!isFull())
        {
            queue[++rear] = c;
            System.out.println(c+" has been queued.");
        }
    }
    public void Dequeue()
    {
        if(!isEmpty())
        {
            front++;
            System.out.println("Front element has been dequeued.");
        }
    }
    public int QueueFront()
    {
        if(!isEmpty())
            return queue[front];
        return 0;
    }
    public int QueueRear()
    {
        if(!isEmpty())
            return queue[rear];
        return 0;
    }
    public boolean isEmpty()
    {
        return front > rear;
    }
    public boolean isFull()
    {
        return rear == size - 1;
    }
}