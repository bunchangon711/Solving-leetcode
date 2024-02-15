import java.util.Arrays;
import java.util.Scanner;

public class LC1_TwoSum {
    static int[] answer(int[] nums, int target){
        int[] index = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    index[0] = i;
                    index[1] = j;
                }
            }
        }
        return index;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(Arrays.toString(answer(nums, target)));
        sc.close();
    }
}
