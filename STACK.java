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
    void push(char n)
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