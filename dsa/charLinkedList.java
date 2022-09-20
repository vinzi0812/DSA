package dsa;
public class charLinkedList{
    class Node{
        char data;
        Node next;
        Node(char d){
            data=d;
            next=null;
        }
    }
    Node head;
    public void insertAtBegin(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtEnd(char data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insertAtPos(char data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head;
            head = newNode;
        }
        else{
            Node temp = head;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public char deleteAtBegin(){
        char x = 0;
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            x = temp.data;
            head = head.next;
            temp.next = null;
        }
        return x;
    }
    public char deleteAtEnd(){
        char x = 0;
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            x = temp.data;
            temp.next = null;
        }
        return x;
    }
    public char deleteAtPos(int pos){
        char x = 0;
        if(pos == 1){
            head = head.next;
        }
        else{
            Node temp = head;
            for(int i = 1; i < pos-1; i++){
                temp = temp.next;
            }
            x = temp.data;
            temp.next = temp.next.next;
        }
        return x;
    }
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}