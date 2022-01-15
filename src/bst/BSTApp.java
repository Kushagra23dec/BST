package bst;

class Node{
    int data;
    Node left;
    Node right;
}

class BST{

    public void display(Node r){

        if(r == null){
            return;
        }
        System.out.println(r.data);
        if(r.left == null){
            return;
        }
        if(r.right == null){
            return;
        }
        int i = 1;
        while( i == 1){
            if(r.left == null ){

            }
        }

    }

    public Node createNewNode(int k){
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    public Node insert(Node node, int val){
        if(node == null){
            return createNewNode(val);
        }
        if(val <= node.data){
            node.left = insert(node.left, val);
        }   else if(val >= node.data){
            node.right = insert(node.right, val);
        }
    return node;
    }
}

public class BSTApp {
    public static void main(String[] args) {
    BST bst = new BST();
    Node root = null;

   root =  bst.insert(root, 8);
   root = bst.insert(root, 3);
   root = bst.insert(root, 9);
   root = bst.insert(root, 11);
   root = bst.insert(root, 1);
   root = bst.insert(root, 5);
   root = bst.insert(root, 4);
   root = bst.insert(root, 7);

   bst.display(root);



    }
}
