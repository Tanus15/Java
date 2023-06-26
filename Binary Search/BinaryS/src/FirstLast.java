public class FirstLast {
    static int[] searchR(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int s=search(nums, target, true);
        int e=search(nums, target, false);
        ans[0]=s;
        ans[1]=e;
        return ans;

        // chech for first occurence
        
    }
    static int search(int[] nums,int target,boolean firstSearch){
        int ans=-1;
        int s = 0;
        int e = nums.length - 1;
        int mid;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (target < nums[mid]) {
                e = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                ans=mid;
                
                if(firstSearch){
                    s=mid+1;
                }
                else{
                    e=mid-1;
                }

            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={3,7,7,7,8,9};
        int target=7;
        System.out.println(searchR(arr, target));
    }
}
