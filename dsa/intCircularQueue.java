package dsa;
public class intCircularQueue
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
            rear = (rear + 1) % size;
            queue[rear] = c;
            System.out.println(c + " has been queued.");
        }
        else
        {
            System.out.println("Queue Full.");
        }
    }
    public int Dequeue()
    {
        if(!isEmpty())
        {
            int x = queue[front + 1];
            front = (front + 1) % size;
            return x;
        }
        return -1;
    }
    public int QueueFront()
    {
        return queue[(front + 1) % size];
    }
    public int QueueRear()
    {
        return queue[rear];
    }
    public void PrintQueue()
    {
        if(!isEmpty())
        {
            for(int i = front + 1; i <= (rear < front ? size - 1 : rear); i++)
                System.out.print(queue[i] + " ");
            if(rear < front)
                for(int i = 0; i <= rear; i++)
                    System.out.print(queue[i] + " ");
        }
    }
    public boolean isEmpty()
    {
        return front == rear;
    }
    public boolean isFull()
    {
        return ((rear + 1) % size == front);
    }
    public int size()
    {
        return (rear - front + size) % size;
    }
}