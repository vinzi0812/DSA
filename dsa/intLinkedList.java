package dsa;
public class intLinkedList{
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }
    Node head;
    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
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
    public void insertAtPos(int data, int pos){
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
    public void deleteAtBegin(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
    }
    public void deleteAtEnd(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }
            temp.next = null;
        }
    }
    public void deleteAtPos(int pos){
        if(pos == 1){
            head = head.next;
        }
        else{
            Node temp = head;
            for(int i=1; i<pos-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
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