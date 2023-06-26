public class Infinite {
    static int findingRange(int[] arr,int target){
        int s=0;
        int e=1;
        while(arr[e]<target){
            int temp=e+1;
            e=e+(e-s+1)*2;
            s=temp;
        }
        return infiniteA(arr, target, s, e);

    }
    static int infiniteA(int[] arr,int target,int s,int e){
        int mid;
        while(s<=e){
            mid=s+(e-s)/2;
            
            if(arr[mid]>target){
                e=mid-1;
            }
            else if(arr[mid]<target){
                s=mid+1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int[] ar={2,3,4,5,6,7,10,12,13,14,15,17,18,19,26,28,100,101,105,106};
        System.out.println(findingRange(ar, 15));
    }
    
}
