public class Min {
    public static void main(String[] args) {
        int[] ar={18,12,-7,3,14,28};
        int b=MinEle(ar);
        System.out.println(b);
        
    }
    static int MinEle(int[] arr){
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;

    }
    
    
}
