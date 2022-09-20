import dsa.*;
import java.util.*;
class PalindromeLinkedList{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to check whether it is palindrome or not: ");
        String s = sc.nextLine();
        charLinkedList l = new charLinkedList();
        charLinkedList r = new charLinkedList();
        int flag = 0;
        for(int i = 0; i < s.length()/2 ; i++)
        {
            l.insertAtBegin(s.charAt(i));
        }
        l.printList();
        for(int i = (s.length() % 2 == 0 ? (s.length()/2): (s.length()/2 + 1)); i < s.length(); i++)
        {
            r.insertAtBegin(s.charAt(i));
        }
        r.printList();
        charLinkedList n = new charLinkedList();
        for(int i = 0; i < s.length()/2; i++)
        {
            char x = r.deleteAtBegin();
            n.insertAtBegin(x);
        }
        n.printList();
        for(int i = 0; i < s.length()/2; i++)
        {
            if(l.deleteAtBegin() == n.deleteAtBegin())
                continue;
            else{
                flag = 1;
                break;
            }
        }
        if(flag == 0)
        {
            System.out.println("PALINDROME.");
        }
        else{
            System.out.println("NOT A PALINDROME.");
        }
        System.exit(0);
        sc.close();
    }
}