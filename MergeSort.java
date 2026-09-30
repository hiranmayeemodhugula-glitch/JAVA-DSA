import java.util.Arrays;
import java.util.Scanner;
public class MergeSort  {
    public static void main(String ag[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[] arr1=new int[m+n];
        int[] arr2=new int[n];
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }
        int a=m-1; int b=n-1; int index=m+n-1;
        while(a>=0&&b>=0){
           if(arr1[a]>arr2[b]){
               arr1[index--]=arr1[a--];
           }
           else{
               arr1[index--]=arr2[b--];
           }
        }
        while(b>=0){
            arr1[index--]=arr2[b--];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
