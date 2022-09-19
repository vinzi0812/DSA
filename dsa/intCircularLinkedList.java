package dsa;
public class intCircularLinkedList{
    class Node{
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }
    Node head;
    public intCircularLinkedList(){
        head.next = head;
    }
    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = newNode;
        }
        else{
            newNode.next = head.next;
            head.next = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            newNode.next = newNode;
        }
        else{
            newNode.next = head.next;
            head.next = newNode;
            head = newNode;
        }
    }
    public void insertAtPos(int data, int pos){
        Node newNode = new Node(data);
        if(pos == 1){
            newNode.next = head.next.next;
            head.next = newNode;
        }
        else{
            Node temp = head.next;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void deleteAtBegin(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head.next = head.next.next;
        }
    }
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head.next;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = head.next;
            head = temp;
        }
    }
    public void deleteAtPos(int pos){
        if(pos == 1){
            head.next = head.next.next;
        }
        else{
            Node temp = head.next;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
    }
    public void display(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head.next;
            while(temp != head){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }
}