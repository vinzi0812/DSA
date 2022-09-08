package dsa;
public class charSTACK
{
    char stack[];
    int size;
    int top;
    public charSTACK()
    {
        size = 100;
        top = -1;
        stack = new char[size];
    }
    public void push(char n)
    {
        if(!isFull())
        {
            stack[++top] = n;
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
            System.out.println(peek() + " has been popped.");
            top--;
        }
        else
        {
            System.out.println("STACK UNDERFLOW.");
        }
    }
    public char peek()
    {
        return stack[top];
    }
    public boolean isEmpty()
    {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size - 1;
    }
}