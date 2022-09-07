import dsa.*;
import java.util.*;
class ReverseusingSTACK
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the list: ");
        int n = sc.nextInt();
        STACK obj = new STACK();
        System.out.println("Enter the elements: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print((i+1)+". ");
            obj.push(sc.next().charAt(0));
        }
        System.out.println("Reversed: ");
        while(!obj.isEmpty())
        {
            System.out.println(obj.peek());
            obj.pop();
        }
    }
}