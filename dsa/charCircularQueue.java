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
    public char Dequeue()
    {
        if(!isEmpty())
        {
            char x = queue[front + 1];
            front = (front + 1) % (size - 1);
            return x;
        }
        return 0;
    }
    public char QueueFront()
    {
        return queue[front];
    }
    public char QueueRear()
    {
        return queue[rear];
    }
    public int size()
    {
        return (rear - front + size) % size;
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