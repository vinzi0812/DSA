import dsa.*;
import java.util.Scanner;
class PolyAddition{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Polynomial p1 = new Polynomial();
        Polynomial p2 = new Polynomial();
        Polynomial p3 = new Polynomial();
        System.out.print("Enter number of terms in 1st polynomial: ");
        int t1 = sc.nextInt();
        for(int i = 0; i < t1; i++)
        {
            System.out.println("Enter the coefficient and exponent of the term: ");
            int coeff = sc.nextInt();
            int exp = sc.nextInt();
            p1.insertAtEnd(coeff, exp);
        }
        System.out.print("Enter number of terms in 2nd polynomial: ");
        int t2 = sc.nextInt();
        for(int i = 0; i < t2; i++)
        {
            System.out.println("Enter the coefficient and exponent of the term: ");
            int coeff = sc.nextInt();
            int exp = sc.nextInt();
            p2.insertAtEnd(coeff, exp);
        }
        Polynomial.Node temp1 = p1.getHead();
        p1.next(temp1);
        Polynomial.Node temp2 = p2.getHead();
        p2.next(temp2);
        p1.printList();
        while(temp1 != null && temp2 != null)
        {
            if(p1.getExp(temp1) == p2.getExp(temp2))
            {
                p3.insertAtEnd(p1.getCoeff(temp1) + p2.getCoeff(temp2), p1.getExp(temp1));
                p1.next(temp1);
                p2.next(temp2);
            }
            else if(p1.getExp(temp1) > p2.getExp(temp2))
            {
                p3.insertAtEnd(p1.getCoeff(temp1), p1.getExp(temp1));
                p1.next(temp1);
            }
            else{
                p3.insertAtEnd(p2.getCoeff(temp2), p2.getExp(temp2));
                p2.next(temp2);
            }
        }
        while(temp1 != null)
        {
            p3.insertAtEnd(p1.getCoeff(temp1), p1.getExp(temp1));
            p1.next(temp1);
        }
        while(temp2 != null)
        {
            p3.insertAtEnd(p2.getCoeff(temp2), p2.getExp(temp2));
            p2.next(temp2);
        }
        System.out.print("1st polynomial: ");
        p1.printList();
        System.out.print("2nd polynomial: ");
        p2.printList();
        System.out.print("Sum of the polynomials: ");
        p3.printList();
        sc.close();
    }
}