import java.util.Scanner;

public class LC53_MaximumSubarray{
    static int answer(int[] nums){
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum > max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
                continue;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(answer(arr));
        sc.close();
    }
}