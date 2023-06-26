public class Wealth {
    public static void main(String[] args) {
        int[][] ar={{1,2,3},{1,2,3}};
        int a=maximumW(ar);
        System.out.println(a);
        
    }
    public static int maximumW(int[][] arr){
        int ans=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        
        return ans;
        
    }
    
}
