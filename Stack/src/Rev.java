import java.util.*;
public class Rev {
    
    static void push(Stack<String>S,int n){
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<n;i++){
            String j=sc.nextLine();
            S.push(j);
        }

    }
    static void reverse(Stack<String>S){
        if(S.empty()){
            System.out.println("Stack is empty");
        }
        else{
            while(!S.empty()){
                String y=(String)S.pop();
                System.out.print(y +" ");
            }
            System.out.println();
        }
     
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        
        while(t-->0){
            int n=sc.nextInt();
            Stack<String> se=new Stack<>();
            push(se,n);
            reverse(se);
            reverse(se);
        }
    }
    
}
