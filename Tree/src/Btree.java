public class Btree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }

    }
    static class BinaryT{
        static int index=-1;
        static Node buildTree(int[] node){
            index++;
            if(node[index]==-1){
                return null;
            }
            Node newn=new Node(node[index]);
            newn.left=buildTree(node);
            newn.right=buildTree(node);
            return newn;

        }

    }
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftN=countOfNodes(root.left);
        int rightN=countOfNodes(root.right);
        return leftN+rightN+1;
    }
    public static int sum(Node root){
        if(root==null){
            return  0;
        }
        int leftsum=sum(root.left);
        int rightsum=sum(root.right);
        return leftsum+rightsum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int lefth=height(root.left);
        int righth=height(root.right);
        int myh=Math.max(lefth,righth)+1;
        return myh;
    }
    public static void main(String[] args) {
        int[] node={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryT tree=new BinaryT();
        Node root = tree.buildTree(node);
        System.out.println(countOfNodes(root));
        System.out.println(sum(root));
        System.out.println(height(root));
    
        
    }
}
