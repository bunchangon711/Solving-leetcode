import java.util.Arrays;
import java.util.Scanner;

public class LC1929_ConcatenationArray {
    static int[] ans(int[] nums){
        /*List<Integer> lst = Arrays.stream(nums).boxed().collect(Collectors.toList());     8ms runtime
        for(int i:nums){                                                                    45mb memory
            lst.add(i);
        }
        return lst.stream().mapToInt(Integer::intValue).toArray(); */
        int[] concatenation = new int[nums.length*2];       //1ms runtime     45.45mb memory
        for(int i=0;i<nums.length;i++){
            concatenation[i] = nums[i];
            concatenation[i+nums.length] = nums[i];
        }
        return concatenation;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(ans(nums)));
        sc.close();
    }
}
