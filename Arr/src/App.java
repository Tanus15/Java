public class App {
    public static String superDigit(String n, int k) {
    // Write your code here
        String sum="";
        for(int i=0;i<k;i++){
            sum+=n;
        }
        return sum;

    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        String n="123";
        int k=3;
        superDigit(n, k);

        
    }
}
