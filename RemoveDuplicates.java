import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String ag[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 1;
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i - 1]) {
                arr[i] = arr[j];
                i++;
            }
        }
        for(int k=0;k<i;k++){
            System.out.print(arr[k]+" ");
        }
    }
}
