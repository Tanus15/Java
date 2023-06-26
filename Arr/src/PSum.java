import java.util.*;
public class PSum{
    public static void main(String[] args) {
        int a[]={4,5,7,8,2,1,9,0};
        int s=9;
    
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++ ){
                if(a[i]+a[j]==s){
                    System.out.println(a[i] +" "+ a[j]);

                }
            }

        }
        
    }
    
    

}