//cEiling of the number arr=[2,3,5,9,14,18] target=14 
//ceiling=find the smallest no array that will be greater and equal to target ele.
public class BSearch {
    static int ceiling(int[] arr,int target){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
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
        return s;

    }
    //floor= find the greater number in array that will be smaller or equal to target.
    static int floorS(int[] arr,int tar){
        int s=0;
        int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            
            if(arr[mid]>tar){
                e=mid-1;
            }
            else if(arr[mid]<tar){
                s=mid+1;
            }
            else{
                return mid;
            }

        }
        return e;
    }
    public static void main(String[] args) {
        int[] ar={2,3,5,9,14,16,18};
        int target=15;
        System.out.println(ceiling(ar, target));
        System.out.println(floorS(ar, target));
    }

}
