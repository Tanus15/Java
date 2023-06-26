import java.util.*;
public class LSearch {
    public static void main(String[] args) {
       int[] num={23,45,1,2,8,19,-3,16,-11,28};
       int target=-11;
       int ans=LinearSearch(num,target);
       System.out.println(ans);
       String name="Ganesh";
       char s='e';
       int a=LiSearch(name, s);
       System.out.println(a);
        
    }
    //search the array
    static int LinearSearch(int[] arr,int target){
        if(arr.length==0){
            return-1;
        }
        for(int i=0;i<arr.length;i++){
            int ele=arr[i];
            if(ele==target){
                return i;
            }
        }
        return -1;

    }
    static int LiSearch(String ar,char s){
        if(ar.length()==0){
            return -1;
        }
        for(int i=0;i<ar.length();i++){
            
            if(s==ar.charAt(i)){
                return i;
            }

        }
        return -1;
    }
    
}
