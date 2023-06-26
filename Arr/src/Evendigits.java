public class Evendigits {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumber(nums));
        
    }
    static int findNumber(int[] arr){
        int count=0;
        for (int i :arr) 
            
        {
            if(even(i)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int i){
        int nod=digit(i);
        
        return nod%2==0;
    }
    static int digit(int i){
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;

    }
}
