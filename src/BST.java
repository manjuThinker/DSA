public class BST {
    public class Node{
        int element;
        Node left;
        Node right;
        public Node(int e, Node l, Node r){
            element=e;
            left=l;
            right=r;
        }
    }
    Node root;
    public BST(){
        root=null;
    }
    public Node insert(Node temproot, int e){
        if (temproot!=null){
            if (e<temproot.element)
                temproot.left = insert(temproot.left, e);
            else if (e> temproot.element)
                temproot.right=insert(temproot.right, e);
        }
        else {
            Node n = new Node(e, null, null);
            temproot=n;
        }
        return temproot;
    }

    public void inorder(Node temproot) {
        if(temproot!=null){
            inorder(temproot.left);
            System.out.print(temproot.element+" ");
            inorder(temproot.right);
        }
    }
    public void preorder(Node temproot){
        if(temproot!=null){
            System.out.print(temproot.element+" ");
            preorder(temproot.left);
            preorder(temproot.right);
        }
    }

    public void postorder(Node temproot){
        if (temproot!=null){
            postorder(temproot.left);
            postorder(temproot.right);
            System.out.print(temproot.element+ " ");
        }
    }

    public void levelorder(){
        QuesesLinkedList q=new QuesesLinkedList();
        Node t=root;
        System.out.println(t.element+" ");
        q.Enqueue(t);
        while (!q.Isempty()){
            t=(Node) q.Dequeue();
            if (t.left!=null){
                System.out.print(t.left.element+" ");
                q.Enqueue(t.left);
            }
            if (t.right!=null){
                System.out.print(t.right.element+" ");
                q.Enqueue(t.right);
            }
        }
    }

    public boolean searchIterative(int key){
        Node temproot=root;
        while (temproot!=null){
            if(key==temproot.element)
                return true;
            else if (key<temproot.element) {
                temproot=temproot.left;
            } else if (key>temproot.element) {
                temproot=temproot.right;

            }
        }
        return false;
    }

    public boolean searchRecurssive(Node temproot, int key){
        if (temproot!=null) {
            if (key == temproot.element)
                return true;
            else if (key < temproot.element)
                return searchRecurssive(temproot.left, key);
            else if (key > temproot.element)
                return searchRecurssive(temproot.right, key);
        }
        return false;
    }
    public int count(Node temproot){
        if (temproot!=null){
            int x=count(temproot.left);
            int y=count(temproot.right);
            return x+y+1;
        }
        else return 0;
    }
    public int height(Node temproot){
        if (temproot!=null){
            int x=height(temproot.left);
            int y=height(temproot.right);
            if (x>y)
                return x+1;
            else return y+1;
        }
        return 0;
    }
    public static void main(String args[]){
        BST B= new BST();
        B.root=B.insert(B.root,8);
        B.insert(B.root,7);
        B.insert(B.root,2);
        B.insert(B.root,1);
        B.insert(B.root,78);
        B.insert(B.root,54);
        B.insert(B.root,87);
        B.insert(B.root,4);
        B.insert(B.root,90);
        B.inorder(B.root);
        System.out.println("root is "+ B.root.right.element);
        System.out.println("preorder traversal ");
        B.preorder(B.root);
        System.out.println();
        System.out.println("Postorder traversal ");
        B.postorder(B.root);
        System.out.println();
        System.out.print("level traversal ");
        System.out.println();
        B.levelorder();
        System.out.println();
        boolean z=B.searchIterative(2);
        System.out.println(z);
        System.out.println("recurssive search  "+B.searchRecurssive(B.root, 3));
        int r=B.count(B.root);
        System.out.println("count of the BST is  "+r);
        System.out.println("Height of the BST is  "+B.height(B.root));



    }
}
