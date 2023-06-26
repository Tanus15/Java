import java.util.*;
public class Tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BuildTree {
        static int index = -1;

        static Node buildTree(int[] node) {
            index++;
            if (node[index] == -1) {
                return null;
            }
            Node nn = new Node(node[index]);
            nn.left = buildTree(node);
            nn.right = buildTree(node);
            return nn;

        }

        static void preorder(Node root) {
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);

        }
        static void postOrder(Node root){
            if(root==null){
                return;
            }
            postOrder(root.right);
            postOrder(root.left);
            System.out.print(root.data+" ");
        }
        static void levelorder(Node root){
            if(root==null){
                return;
            }
            Queue<Node>q=new LinkedList<>();
            q.add(root);
            q.add(null);
            while(!q.isEmpty()){
                Node currNode=q.remove();
                if(currNode==null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.println(currNode.data+" ");
                    if(currNode.left!=null){
                        q.add(currNode.left);
                    }
                    if(currNode.right!=null){
                        q.add(currNode.right);
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BuildTree tr = new BuildTree();
        Node root = tr.buildTree(node);
        System.out.println(root.data);
        tr.preorder(root);
        tr.levelorder(root);
        tr.postOrder(root);

    }
}