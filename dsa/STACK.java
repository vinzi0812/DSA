package dsa;
public class STACK
{
    char stack[];
    int size;
    int t;
    public STACK()
    {
        size = 100;
        t = -1;
        stack = new char[size];
    }
    public void push(char n)
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
    public void pop()
    {
        if(!isEmpty())
        {
            System.out.println(top() + " has been popped.");
            t--;
        }
        else
        {
            System.out.println("STACK UNDERFLOW.");
        }
    }
    public char top()
    {
        return stack[t];
    }
    public boolean isEmpty()
    {
        return t == -1;
    }
    public boolean isFull()
    {
        return t == size - 1;
    }
}