import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LC14_LongestCommonPrefix {
    static String answer(String[] strs){
        StringBuilder s = new StringBuilder();
        Arrays.sort(strs, Comparator.comparingInt(String::length));
        outerloop:
        for(int i=0;i<strs[0].length();i++){
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i) != strs[0].charAt(i)){
                    break outerloop;
                }
            }
            s.append(strs[0].charAt(i));
        }
        return s.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        for(int i=0;i<n;i++){
            strs[i] = sc.nextLine();
        }
        System.out.println(answer(strs));
        sc.close();
    }
}
