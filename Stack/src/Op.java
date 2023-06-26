import java.util.*;
public class Op {
    
    static void push(Stack<Integer> S,int n){
        for(int i=0;i<n;i++){
            Scanner sc=new Scanner(System.in);
            int j=sc.nextInt();
            S.push(j);

        }
        
    }
    static void pop(Stack<Integer>S,int n){
        System.out.println("Pop operation");
        for(int i=0;i<n;i++){
            Integer y=(Integer) S.pop();
            System.out.println(y);
        }
    }
    static void Peek(Stack<Integer>S){
        System.out.println("Peek operation");
        Integer x=(Integer)S.peek();
        System.out.println(x);

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       Stack<Integer> se=new Stack<Integer>();
       push(se,n);
       pop(se,n);
       push(se,n);
       Peek(se);
    }
    
}
