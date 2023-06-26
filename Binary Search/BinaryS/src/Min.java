public class Min {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int mid;
        if(s<e){
            return nums[0];
        }
        if(s==e){
            return nums[e];
        }
        
            mid=s+(e-s)/2;
            if(mid<e && nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }
            if(mid>s && nums[mid]<nums[mid-1]){
                return nums[mid];
            }
            if(nums[e]>nums[s]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            

            
        
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 3, 4 };
        Min e=new Min();
        int a=e.findMin(arr);
        System.out.println(a);
        
    }
}
