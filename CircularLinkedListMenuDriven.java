import dsa.*;
import java.util.*;
class CircularLinkedListMenuDriven
{
    public static void main(String[] args) {
        intCircularLinkedList l = new intCircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while(choice != 7){
            System.out.println("1. Insert at begin");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete at begin");
            System.out.println("5. Delete at end");
            System.out.println("6. Delete at position");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter data: ");
                    int data = sc.nextInt();
                    l.insertAtBegin(data);
                    l.display();
                    break;
                case 2:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    l.insertAtEnd(data);
                    l.display();
                    break;
                case 3:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    System.out.print("Enter position: ");
                    int pos = sc.nextInt();
                    l.insertAtPos(data, pos);
                    l.display();
                    break;
                case 4:
                    l.deleteAtBegin();
                    l.display();
                    break;
                case 5:
                    l.deleteAtEnd();
                    l.display();
                    break;
                case 6:
                    System.out.print("Enter position: ");
                    pos = sc.nextInt();
                    l.deleteAtPos(pos);
                    l.display();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}