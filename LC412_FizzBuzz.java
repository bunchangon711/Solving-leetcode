import java.util.ArrayList;
import java.util.Scanner;

public class LC412_FizzBuzz{
    static ArrayList<String> answer(int n){
        ArrayList<String> lst = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                lst.add("FizzBuzz");
            }
            else if(i%3==0){
                lst.add("Fizz");
            }
            else if(i%5==0){
                lst.add("Buzz");
            }
            else lst.add(Integer.toString(i));
        }
        return lst;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(answer(n));
        sc.close();
    }
}