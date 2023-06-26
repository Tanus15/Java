import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] ar={ {14,28,42,56,70},
                     {13,26,39,52,65},
                     {12,24,36,48,60}};
        int target=39;
        int[] b=Search(ar, target);
        System.out.println(Arrays.toString(b));
        
    }
    static int[] Search(int[][] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(target==arr[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
