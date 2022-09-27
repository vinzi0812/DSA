class DoublyLinkedList{
    public class Node{
        char data;
        Node prev;
        Node next;
        Node(char data){
            this.data = data;
            prev = null;
            next = null;
        }
    }
    Node head;
    void insertAtFront(char data){
        Node newNode = new Node(data);
        if(head == null)
            head = newNode;
        else{
            newNode.next = head.next;
            head.next.prev = newNode;
            head = newNode;
        }
    }
    void insertAtEnd(char data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null)
            head = newNode;
        else{
            while(head.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void insertAtPos(char data, int pos){
        Node newNode = new Node(data);
        Node temp = head;
        if(pos == 1)
            insertAtFront(data);
        else{
            for(int i = 1; i < pos - 1; i++){
                temp=temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
}
