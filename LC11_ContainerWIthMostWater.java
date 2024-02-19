import java.util.Scanner;
import java.lang.Math;

public class LC11_ContainerWIthMostWater {
    static int answer(int[] height){
        int maxWater = 0;
        int currentWater = 0;
        int l = 0;
        int r = height.length-1;
        while(l!=r){
            currentWater = (r-l) * (Math.min(height[l], height[r]));
                if(currentWater>maxWater){
                    maxWater = currentWater;
                }
            if(height[l] <= height[r]){
                l++;
                while(height[l] < height[l-1]){
                    l++;
                }
            }
            else {
                r--;
                while(height[r] < height[r+1]){
                    r--;
                }
            }    
        }
        return maxWater;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        System.out.println(answer(height));
        sc.close();
    }
}
