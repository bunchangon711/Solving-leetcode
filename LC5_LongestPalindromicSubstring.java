import java.util.Scanner;

public class LC5_LongestPalindromicSubstring {
    static String answer(String s){
        if(s.length() == 1){
            return s;
        }
        String longest = s.charAt(0) +"";
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i) == s.charAt(j) && s.substring(i, j+1).length() > longest.length()){
                    String reverse = new StringBuilder(s.substring(i, j+1)).reverse().toString();
                    if(reverse.equals(s.substring(i, j+1))){
                        longest = s.substring(i, j+1);
                        break;
                    }
                }
            }
        }
        return longest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}
