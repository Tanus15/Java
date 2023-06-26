public class LiList {
    private Node head;
    private Node tail;
    private int size;
    LiList(){
        this.size=0;
    }

    public class Node{
        int value;
        Node next;
        public Node(int value){
            this.value=value;
            this.next=null;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }

    }
    public void insertFirst(int val){
        Node n = new Node(val);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size++;


    }
    
    public void insertLast(int val) {
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node nn=new Node(val);
        tail.next=nn;
        nn=tail;
        size++;

    } 
    public void insertMid(int val,int idx){
        if(idx==0){
            insertFirst(val);
            return;
        }
        if(idx==size){
            insertLast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        Node n=new Node(val, temp.next);
        temp.next=n;
        size++;

        
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        LiList obj=new LiList();
        obj.insertFirst(10);
        obj.insertFirst(20);
        
        obj.insertMid(40,1);
        obj.insertLast(60);
        obj.insertLast(25);
        obj.display();
    }
    
}
