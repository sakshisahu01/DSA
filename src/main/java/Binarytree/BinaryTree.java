package Binarytree;

public class BinaryTree {
    private TreeNode root;
    private class TreeNode{
        private TreeNode left;
        private TreeNode right;
        private int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first=new TreeNode(2);
        TreeNode second=new TreeNode(6);
        TreeNode third=new TreeNode(7);
        TreeNode fourth=new TreeNode(3);
        TreeNode fifth=new TreeNode(8);
        TreeNode sixth=new TreeNode(9);
        TreeNode seventh=new TreeNode(9);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
        second.right=fifth;
        third.left=sixth;
        third.right=seventh;

    }
    //recursive method
    public void preOrder(TreeNode root){
        if(root==null){
            return;

        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }


    public void inOrder(TreeNode root){
        if(root==null){
            return;

        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }
    public void postOrder(TreeNode root){
        if(root==null){
            return;

        }
        postOrder(root.left);
        preOrder(root.right);
        System.out.println(root.data + " ");

    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder( bt.root);
        bt.inOrder(bt.root);// for inorder
        bt.postOrder(bt.root);// for postorder

    }
}
