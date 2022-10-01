package dsa;
public class Polynomial {
    Node head;
    public class Node{
        Node next;
        int coeff;
        int exp;
        Node(int coeff, int exp)
        {
            this.coeff = coeff;
            this.exp = exp;
            next = null;
        }
    }
    public Node getHead()
    {
        return head;
    }
    public void next(Node temp)
    {
        temp = temp.next;
    }
    public int getCoeff(Node node)
    {
        return node.coeff;
    }
    public int getExp(Node node)
    {
        return node.exp;
    }
    public void insertAtBegin(int coeff, int exp){
        Node newNode = new Node(coeff,exp);
        if(head == null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }
    public void insertAtEnd(int coeff, int exp){
        Node newNode = new Node(coeff,exp);
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
    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.coeff+"x^"+temp.exp+(temp.next!=null?"+ ":" "));
            temp = temp.next;
        }
        System.out.println();
    }
}