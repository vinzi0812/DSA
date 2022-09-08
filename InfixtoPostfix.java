import dsa.*;
import java.util.*;
class InfixtoPostfix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char[] pr = {'+', '-', '*', '/', '%', '^'};
        charSTACK obj = new charSTACK();
        System.out.println("Enter an equation: ");
        String e = sc.nextLine();
        char[] eq = e.toCharArray();
        char[] ans = new char[eq.length];
        int k = 0, flag = 0;
        for(int i = 0; i < eq.length; i++)
        {
            if(eq[i] != '+' && eq[i] != '-' && eq[i] != '*' && eq[i] != '*' && eq[i] != '/' && eq[i] != '%' && eq[i] != '^' && eq[i] != '(' && eq[i] != ')')
            {
                ans[k++] = eq[i];
            }
            else if(eq[i] == '(')
            {
                obj.push(eq[i]);
            }
            else if(eq[i] == ')')
            {
                
                while(obj.peek() != '(')
                {
                    ans[k++] = obj.peek();
                    obj.pop();
                }
                obj.pop();
            }
            else
            {
                if(obj.isEmpty() || indexOf(pr, (eq[i])) > indexOf(pr, obj.peek()))
                {
                    obj.push(eq[i]);
                }
                else
                {
                    do{
                        ans[k++] = obj.peek();
                        obj.pop();
                    }while(indexOf(pr, eq[i]) <= indexOf(pr, obj.peek()));
                    obj.push(eq[i]);
                }
            }
        }
        while(!obj.isEmpty())
        {
            ans[k++] = obj.peek();
            if(obj.peek() == '(')
            {
                flag = 1;
            }
            obj.pop();
        }
        if(flag == 1)
        {
            System.out.println("Invalid Equation");
        }
        else
        {
            for(int i = 0; i < eq.length; i++)
            {
                System.out.print(ans[i]);
            }
        }
    }
    static int indexOf(char[] arr, char c)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[0] == c || arr[1] == c)
            {
                return 1;
            }
            else if(arr[2] == c || arr[3] == c)
            {
                return 2;
            }
            else if(arr[i] == c)
            {
                return i;
            }
        }
        return 0;
    }
}