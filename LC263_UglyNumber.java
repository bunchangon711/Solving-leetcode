import java.util.Scanner;

public class LC263_UglyNumber {
    static boolean answer(int n){
        if(n<1){
            return false;
        }
        int[] factor = {2,3,5};
        for(int i: factor){
            while(n%i==0){
                n/=i;
            }
        }
        return (n==1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
        sc.close();
    }
}
