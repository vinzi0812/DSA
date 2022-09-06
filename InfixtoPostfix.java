import dsa.STACK;
import java.util.*;
class InfixtoPostfix
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        char[] pr = {'+', '-', '*', '/', '%', '^'};
        STACK obj = new STACK();
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
                
                while(obj.top() != '(')
                {
                    ans[k++] = obj.top();
                    obj.pop();
                }
                obj.pop();
            }
            else
            {
                if(obj.isEmpty() || indexOf(pr, (eq[i])) > indexOf(pr, obj.top()))
                {
                    obj.push(eq[i]);
                }
                else
                {
                    ans[k++] = obj.top();
                    obj.pop();
                    obj.push(eq[i]);
                }
            }
        }
        while(!obj.isEmpty())
        {
            ans[k++] = obj.top();
            if(obj.top() == '(')
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