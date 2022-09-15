import dsa.*;
import java.util.*;
class EvaluationOfPrefix
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        intSTACK obj = new intSTACK();
        System.out.println("Enter a prefix equation: ");
        String s = sc.nextLine();
        char[] eq = s.toCharArray();
        int a, b;
        for(int i = eq.length - 1; i >= 0; i--)
        {
            if(Character.isDigit(eq[i]))
                obj.push(Character.digit(eq[i],10));
            else
            {
                a = obj.peek();
                obj.pop();
                b = obj.peek();
                obj.pop();
                obj.push(operate(a,b,eq[i]));
            }
        }
        System.out.println(obj.peek());
        sc.close();
    }
    static int operate(int a, int b, char c)
    {
        if(c == '+')
            return a+b;
        else if(c == '-')
            return a-b;
        else if(c == '*')
            return a*b;
        else if(c == '/')
            return a/b;
        else if(c == '%')
            return a%b;
        else
            return (int) Math.pow((double) a,(double) b);
    }
}