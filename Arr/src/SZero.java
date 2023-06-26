
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;

public class SZero {
    public static void main(String[] args) {
        /**int[] a={0,1,1,0,0,1,0};
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            if (a[start] == 0) start++;
            else {
                if (a[end] == 1) end--;
                else {
                    a[start++] = 0;
                    a[end--] = 1;
                }
            }
        }
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        **/
        int a[]={5,6,8,6,5,4,3};
        int k=0;
        int s=0;
        int e=a.length;
        int temp[]=new int[a.length];
        int min=0;
         for (int i = 0; i < a.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < a.length; j++){  
                if (a[j] < a[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = a[index];   
            a[index] = a[i];  
            a[i] = smallerNumber;  
        }  
        
        for(int i=0;i<e-1;i++){
           if(a[i]!=a[i+1]){
            temp[k++]=a[i];
           }
        }
        temp[k++] = a[e- 1];
        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
        }
        
            
            
        
        
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        /**LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
            
        }
        Collections.synchronizedSet(set);
        System.out.print(set);**/
        
        
    }
    
}
