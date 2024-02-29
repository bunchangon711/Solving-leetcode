import java.util.Scanner;

public class LC27_RemoveElement {
    static int answer(int[] nums, int val){
        int count = 0;
        int notVal = 0;
        int check = 0;
        while(check<nums.length){       //Actually just push the different elements from val to the start of array and count
            if(nums[check] != val){
                count++;
                nums[notVal] = nums[check];
                notVal+=1;
            }
            check++;
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
        int val = sc.nextInt();
        System.out.println(answer(nums, val));
        sc.close();
    }
}
