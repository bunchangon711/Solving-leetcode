import java.util.Scanner;

public class LC9_PalindromeNumber{
    static boolean answer(int x){
        if(x<0){
            return false;
        }
        int target = x;
        int reversed = 0;
        while(x != 0){
            reversed *=10;
            reversed += x %10;
            x/=10;
        }
        return (reversed == target);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(answer(x));
        sc.close();
    }
}