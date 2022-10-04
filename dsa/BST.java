class BST{
    Node root;
    public class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public BST(){
        root = null;
    }
    public void insert(int data){
        root = insert(root, data);
    }
    public Node insert(Node node, int data){
        if(node == null){
            node = new Node(data);
        }
        else{
            if(data >= node.data){
                node.right = insert(node.right, data);
            }
            else{
                node.left = insert(node.left, data);
            }
        }
        return node;
    }
    public void inorder(){
        inorder(root);
    }
    public void inorder(Node r){
        if(r != null){
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }
    public void preorder(){
        preorder(root);
    }
    public void preorder(Node r){
        if(r != null){
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    public void postorder(){
        postorder(root);
    }
    public void postorder(Node r){
        if(r != null){
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
    public void delete(int k){
        if(root == null){
            System.out.println("Tree is empty");
        }
        else if(search(k) == false){
            System.out.println("Sorry " + k + " is not present");
        }
        else{
            root = delete(root, k);
            System.out.println(k + " deleted from the tree");
        }
    }
    public Node delete(Node root, int k){
        Node p, p2, n;
        if(root.data == k){
            Node lt, rt;
            lt = root.left;
            rt = root.right;
            if(lt == null && rt == null){
                return null;
            }
            else if(lt == null){
                p = rt;
                return p;
            }
            else if(rt == null){
                p = lt;
                return p;
            }
            else{
                p2 = rt;
                p = rt;
                while(p.left != null){
                    p = p.left;
                }
                p.left = lt;
                return p2;
            }
        }
        if(k < root.data){
            n = delete(root.left, k);
            root.left = n;
        }
        else{
            n = delete(root.right, k);
            root.right = n;
        }
        return root;
    }
    public int countNodes(){
        return countNodes(root);
    }
    public int countNodes(Node r){
        if(r == null){
            return 0;
        }
        else{
            int l = 1;
            l += countNodes(r.left);
            l += countNodes(r.right);
            return l;
        }
    }
    public boolean search(int val){
        return search(root, val);
    }
    public boolean search(Node r, int val){
        boolean found = false;
        while((r != null) && !found){
            int rval = r.data;
            if(val < rval){
                r = r.left;
            }
            else if(val > rval){
                r = r.right;
            }
            else{
                found = true;
                break;
            }
            found = search(r, val);
        }
        return found;
    }
    public int countLeaves(){
        return countLeaves(root);
    }
    public int countLeaves(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return 1;
        }
        else{
            return countLeaves(node.left) + countLeaves(node.right);
        }
    }
    
    public static void main(String[] args){
        BinaryTree bt = new BinaryTree();
    }
}
