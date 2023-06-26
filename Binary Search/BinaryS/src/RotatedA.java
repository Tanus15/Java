public class RotatedA {
    //Sorted rotated binary Search
    //1.find the pivot-> largest no in array where your next no is asc.
    //*search in first half */ mid>mid+1
    //if mid<mid-1 ans->mid-1;
    //3.start ele>mid -> start - end=mid-1;
    //4.otherwise s<mid s=mid+1;
    static int search(int[] ar,int target){
        int pivot=pivot(ar);
        if(pivot==-1){
            return BSearch(ar, target, 0, ar.length-1);
        }


        //case 1-> pivot ele= target
        //target>start start-pivot-1;
        //target<start piovot+1-end;
        if(ar[pivot]==target){
            return pivot;
        }
        if(target>=ar[0]){
            return BSearch(ar, target, 0, pivot-1);

        }
        return BSearch(ar, target, pivot+1, ar.length-1);
    }
    static int BSearch(int[] arr,int tar,int s,int e){
        
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
        return -1;
    }
    static int pivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            // 4 cases over here
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;

            }
            else if(mid>start && arr[mid-1]>arr[mid]){
                return mid-1;
            }
            else if(arr[start]>= arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={ 4,5,6,7,0,1,2};
        int target=6;
        System.out.println(pivot(arr));
        
        
    }
    
}
