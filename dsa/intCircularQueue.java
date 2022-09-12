package dsa;
class intCircularQueue
{
    int front, rear, size;
    int[] queue;
    public intCircularQueue(int n)
    {
        front = 0;
        rear = 0;
        size = n;
        queue = new int[n];
    }
    public void Enqueue(int c)
    {
        if(!isFull())
        {
            rear = (rear + 1) % (size - 1);
            queue[rear] = c;
            System.out.println(c + " has been queued.");
        }
        else
        {
            System.out.println("Queue Full.");
        }
    }
    public void Dequeue()
    {
        if(!isEmpty())
        {
            front = (front + 1) % (size - 1);
            System.out.println("Front has been dequeued.");
        }
        else
        {
            System.out.println("Queue Empty.");
        }
    }
    public int QueueFront()
    {
        return queue[front];
    }
    public int QueueRear()
    {
        return queue[rear];
    }
    boolean isEmpty()
    {
        return front == rear;
    }
    boolean isFull()
    {
        return (rear + 1) % (size - 1) == front;
    }
}