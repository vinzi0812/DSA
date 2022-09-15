package dsa;
public class charQueue
{
    int front, rear, size;
    char[] queue;
    public charQueue()
    {
        front = 0;
        rear = -1;
        size = 100;
        queue = new char[size];
    }
    public void Enqueue(char c)
    {
        if(!isFull())
        {
            queue[++rear] = c;
            System.out.println(c+" has been queued.");
        }
        else{
            System.out.println("Queue is full");
        }
    }
    public char Dequeue()
    {
        if(!isEmpty())
        {
            char x = queue[front++];
            return x;
        }
        return 0;
    }
    public char QueueFront()
    {
        if(!isEmpty())
            return queue[front];
        return 0;
    }
    public char QueueRear()
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
        return rear == size-1;
    }
}