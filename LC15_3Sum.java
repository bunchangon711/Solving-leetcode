import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/*
 *  5 TEST CASE STILL TLE
 *  NEED TO FIX
 */

public class LC15_3Sum {
    static List<List<Integer>> answer(int[] nums){
        List<List<Integer>> threeSum = new ArrayList<>();
        List<Integer> numsLst = new ArrayList<Integer>();  
        for(int i=0;i<nums.length;i++){
            numsLst.add(nums[i]);
        }
        int threeSumPos = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                int tmp = 0 - (nums[i] + nums[j]);       //The last number so the triplet sum is 0
                numsLst.remove(Integer.valueOf(nums[i]));
                numsLst.remove(Integer.valueOf(nums[j]));       //Temporary remove nums[i] and nums[j] to ensure tmp is not those 2 elements
                if(numsLst.contains(tmp)){
                    threeSum.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[j], tmp)));
                    Collections.sort(threeSum.get(threeSumPos));        //Sort inner arraylist elements for future removal
                    threeSumPos++;
                }
                numsLst.add(nums[i]);
                numsLst.add(nums[j]);
            }
        }
        List<List<Integer>> distinct = threeSum.stream().distinct().collect(Collectors.toList());       //Remove duplicate inner arraylist
        return distinct;    
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
