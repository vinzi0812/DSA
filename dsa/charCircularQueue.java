package dsa;
class charCircularQueue
{
    int front, rear, size;
    char[] queue;
    public charCircularQueue(int n)
    {
        front = 0;
        rear = 0;
        size = n;
        queue = new char[n];
    }
    public void Enqueue(char c)
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
    public char QueueFront()
    {
        return queue[front];
    }
    public char QueueRear()
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