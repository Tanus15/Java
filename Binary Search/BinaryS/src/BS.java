public class BS {
    static char smallL(char[] ar,char target){
        int s=0;
        int e=ar.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(ar[mid]>target){
                e=mid-1;

            }
            else{
                s=mid+1;
            }
            
            
        }
        return ar[s%ar.length];
    }
    public static void main(String[] args) {
        char[] arr={'c','f','j','k','m'};
        char tar='m';
        System.out.println(smallL(arr, tar) );  
    }
    
}
