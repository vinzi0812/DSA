import dsa.*;
import java.util.*;
class CircularQueueMenuDriven
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the queue: ");
        int size = sc.nextInt();
        intCircularQueue q = new intCircularQueue(size);
        System.out.println("Enter the number as per your choice: ");
        System.out.println("1. Enqueue\n2. Dequeue\n3. Queue Front\n4. Queue Rear\n5. Exit.");
        int ch = 0;
        do{
            System.out.print("\nEnter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the number you want to queue: ");
                    int el = sc.nextInt();
                    q.Enqueue(el);
                    q.PrintQueue();
                    break;
                case 2:
                    System.out.println(q.isEmpty() ? "Queue Empty." : q.Dequeue() + " has been dequeued.");
                    q.PrintQueue();
                    break;
                case 3:
                    System.out.println(q.isEmpty() ? "Queue Empty." : q.QueueFront());
                    break;
                case 4:
                    System.out.println(q.isEmpty() ? "Queue Empty." : q.QueueRear());
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid option.");
                    break;
            }
        }while(ch != 5);
    }
}