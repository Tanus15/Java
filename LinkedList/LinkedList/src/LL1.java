import java.util.*;
public class LL1 {
    public static void main(String[] args) {
        LinkedList<Integer> le=new LinkedList<>();
        le.addFirst(10);
        le.addLast(20);
        le.addFirst(30);
        le.addFirst(5);
        le.add(3, 7);
       Iterator it=le.iterator();
       while(it.hasNext())
        System.out.print(it.next()+"->");
       System.out.println();
       

    }
    
}
