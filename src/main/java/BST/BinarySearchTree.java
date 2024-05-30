package BST;

import com.sun.source.tree.Tree;

public class BinarySearchTree {
    private TreeNode root;
    private class TreeNode{
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }
    // insert a value
    public void insert(int value){
        root=insert(root,value);


    }
    public TreeNode insert(TreeNode root, int value){
        if (root==null){
            root=new TreeNode(value);
            return root;
        }
        if (value < root.data) {

            root.left=insert(root.left, value);
        }else{
            root.right=insert(root.right, value);
        }
        return root;
    }
    public void inOrder(){
        inOrder(root);


    }

    // search a given key
    public TreeNode search(int key){
        return search(root, key);
    }
    public TreeNode search(TreeNode root, int key){
        if(root==null || root.data==key){
            return root;
        }
        if(key<root.data){
            return search(root.left, key);
        }else{
            return search(root.right, key);
        }
    }




    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);


    }


    public static void main(String[] args) {
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(5);
        bst.insert(7);
        bst.insert(10);
        bst.insert(8);
        bst.insert(9);
        bst.insert(14);
        bst.inOrder();
        System.out.println();
        if(null !=bst.search(5)){
            System.out.println("key found");

        }else{
            System.out.println("not found");
        }


    }
}
