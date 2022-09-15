package dsa;
public class intQueue
{
    int front, rear, size;
    int[] queue;
    public intQueue(int size)
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
    public int Dequeue()
    {
        if(!isEmpty())
        {
            int x = queue[front++];
            return x;
        }
        return -1;
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
    public void PrintQueue()
    {
        for(int i = front; i <= rear; i++)
        {
            System.out.print(queue[i]+" ");
        }
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