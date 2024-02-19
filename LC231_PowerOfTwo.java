import java.util.Scanner;

public class LC231_PowerOfTwo {
    static boolean answer(int n){
        if(n == 1){
            return true;
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        else return answer(n/=2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
        sc.close();
    }
}
