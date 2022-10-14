import java.util.Scanner;
class Exp6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Tree t = new Tree();
		System.out.println("Enter a infix expression: ");
		String o = sc.nextLine();
		String s = s.convert(s);
		t.input(s);
		System.out.print("Preorder: ");
		t.preorder();
		System.out.println("");
		System.out.print("Inorder: ");
		t.inorder();
		System.out.println("");
		System.out.print("Postorder: ");
		t.postorder();
		System.exit(0);
	}
}
class Node{
	char data;
	Node left, right;
	Node(char data){
		this.data = data;
		left = null;
		right = null;
	}
}
class Tree{
	Node root;
	NodeStack o;
	String convert(String exp){
		o = new NodeStack();
		String s = "";
		char e[] = exp.toCharArray();
		int k = 0;
		for(int i = e.length; i >= 0; i--){
			Node a = new Node(e[i]);
			if(!isOperator(eq[i]))
				s + e[i];
			else if(e[i] == ')')
				o.push(a);
			else if(e[i] == '('){
				while(o.st[top].data != ')')
					s + (o.pop()).data;
				Node waste = o.pop();
			}
			else{
				if(o.isEmpty() || indexOf(e[i]) >= indexOf(o.st[top].data))
					o.push(a);
				else{
					s + o.pop().data;
					s.push(a);
				}
			}
		}
		while(!o.isEmpty()){
			s + o.pop().data;
		}
		return s;
	}
	int indexOf(char data){
		if(data == '+' || data == '-')
			return 1;
		else if(data == '*' || data == '/')
			return 2;
		else if(data == '^')
			return 3;
		return 0;
	}
	void input(String e){
		o = new NodeStack();
		char exp[] = e.toCharArray();
		for(int i = exp.length - 1; i >= 0; i--){
			Node a = new Node(exp[i]);
			if(isOperator(exp[i])){
				a.left = o.pop();
				a.right = o.pop();	
			}
			o.push(a);
		}
		root = o.pop();
		if(!o.isEmpty()){
			System.out.println("Invalid Prefix Expression.");
		}
	}
	boolean isOperator(char data){
		if(data == '+' || data == '-' || data == '*' || data == '/' || data == '^')
			return true;
		return false;
	}
	void inorder(){
		inorder(root);
	}
	void inorder(Node root){
		if(root == null){
			return;
		}
		else{
			inorder(root.left);
			System.out.print(root.data+ " ");
			inorder(root.right);
		}
	}
	void preorder(){
		preorder(root);
	}
	void preorder(Node root){
		if(root == null){
			return;
		}
		else{
			System.out.print(root.data+ " ");
			preorder(root.left);
			preorder(root.right);
		}
	}
	void postorder(){
		postorder(root);
	}
	void postorder(Node root){
		if(root == null){
			return;
		}
		else{
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+ " ");
		}
	}
}
class NodeStack{
	Node st[];
	int top;
	int size;
	NodeStack(){
		this.size = 100;
		top = -1;
		st = new Node[size];
	}
	boolean isEmpty(){
		return top == -1;
	}
	boolean isFull(){
		return top == size - 1;
	}
	
	void push(Node a){
		if(!isFull()){
			st[++top] = a;
			System.out.println(a.data+ " has been pushed.");
		}
		else
			System.out.println("STACK OVERFLOW.");
	}
	Node pop(){
		if(!isEmpty()){
			System.out.println(st[top].data+ " has been popped.");
			Node a = st[top];
			top--;
			return a;
		}
		else{
			System.out.println("STACK UNDERFLOW.");
			return null;
		}
	}
}
