public class LL2 {
    Node head;
    Node tail;
    int size;
    LL2(){
        size=0;
    }
    public class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int data){
            this.data=data;
            
        }
        public void insertF(int val){
            Node n=new Node(val);
            n.next=head;
            n.prev=null;
            if(head!=null){
                head.prev=n;
            }
            head=n;


        }
    }
    
}
