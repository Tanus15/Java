import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
    }
    static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
    
}
