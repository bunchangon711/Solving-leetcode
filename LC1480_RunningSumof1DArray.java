import java.util.Arrays;
import java.util.Scanner;

public class LC1480_RunningSumof1DArray{
    static int[] answer(int[] arr){
        int[] sum = new int[arr.length];
        sum[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            sum[i] = sum[i-1] + arr[i];
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(answer(arr)));
        sc.close();
    }
}