
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class LC217_ContainsDuplicate{
    static boolean answer(int[] nums){
        Arrays.sort(nums);
        HashSet<Integer> countNum = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(countNum.contains(nums[i])){
                return true;
            }
            else countNum.add(nums[i]);
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(answer(nums));
        sc.close();
    }
}