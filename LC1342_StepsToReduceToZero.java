import java.util.Scanner;

public class LC1342_StepsToReduceToZero{
    static int answer(int n){
        int steps = 0;
        while(n>0){
            if(n%2==0){
                n/=2;
            }
            else n-=1;
            steps++;
        }
        return steps;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
        sc.close();
    }
}