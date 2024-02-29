import java.util.Scanner;

public class LC26_RemoveDuplicates {
    static int answer(int[] nums){
        int count = 1;
        int l = 0;
        int r = 1;
        while(r<nums.length){
            if(nums[r] != nums[l]){
                count++;
                nums[l+1] = nums[r];
                l+=1;
            }
            r++;
        }
        return count;
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
