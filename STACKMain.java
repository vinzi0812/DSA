import java.util.*;
class STACKMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        STACK s = new STACK(size);
        while(true)
        {
            System.out.println("Choose one of the options: ");
            System.out.println("1.PUSH\n2.POP\n3.PRINT\n4.EXIT");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("Enter the element to be pushed: ");
                    int a = sc.nextInt();
                    s.push(a);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    if(s.top != -1)
                    {
                        System.out.println("STACK:");
                        for(int i = 0; i <= s.top; i++)
                        {
                            System.out.println(s.stack[i]);
                        }
                    }
                    else
                    {
                        System.out.println("Empty Stack.");
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Input. Enter correct option.");
                    break;
            }
        }
    }
}
class STACK
{
    char stack[];
    int size;
    int t;
    STACK()
    {
        size = 100;
        t = -1;
    }
    void push(int n)
    {
        if(!isFull())
        {
            stack[++t] = n;
            System.out.println(n + " has been pushed.");
        }
        else
        {
            System.out.println("STACK OVERFLOW.");
        }
    }
    void pop()
    {
        if(!isEmpty())
        {
            t--;
            System.out.println("Element has been popped.");
        }
        else
        {
            System.out.println("STACK UNDERFLOW.");
        }
    }
    char top()
    {
        return stack[t];
    }
    boolean isEmpty()
    {
        return t == -1;
    }
    boolean isFull()
    {
        return t == size - 1;
    }
}