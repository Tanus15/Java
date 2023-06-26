import java.util.*;
public class BSearch {
    /*static int binaryS(int[] ar,int target){
        int s=0;
        int e=ar.length-1;*/
        
        /**for(int i=0;i<ar.length;i++){
            int mid=s+(e-s)/2;
            if(ar[mid]>target){
                e=mid-1;
            }
            else if(ar[mid]<target){
                s=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;

    }*/
    static int order(int[] ar,int target){
        int s=0;
        int e=ar.length-1;
        boolean isAsc=ar[s]<ar[e];
        if(isAsc){
            for(int i=0;i<ar.length;i++){
                int mid=s+(e-s)/2;
                if(ar[mid]>target){
                    e=mid-1;
                }
                else if(ar[mid]<target){
                    s=mid+1;
                }
                else{
                    return mid;
                }
            }
        
        }
        else{
            for(int i=0;i<ar.length;i++){
                int mid=s+(e-s)/2;
                if(ar[mid]>target){
                    s=mid+1;
                }
                else if(ar[mid]<target){
                    e=mid-1;
                }
                else{
                    return mid;
                }
            }
            
        }
        return -1;
        
        
    }

    
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6};
        int target=9;
        int ans=order(arr, target);
        System.out.println(ans);
        
        
        
        
        
    }
    
}
