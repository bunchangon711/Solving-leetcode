import java.util.HashMap;
import java.util.Scanner;

public class LC3_LongestSubstring {
    static int answer(String s){
        int max = 0;
        int currentMax = 0;
        int i=0;
        HashMap<Character, Integer> uniqueChar = new HashMap<Character, Integer>();
        while(i<s.length()){
            if(!uniqueChar.containsKey(s.charAt(i))){
                uniqueChar.put(s.charAt(i), i);
                currentMax++;
                if(currentMax > max){
                    max = currentMax;
                }
            }
            else{
                i = uniqueChar.get(s.charAt(i)) + 1;
                uniqueChar.clear();
                currentMax = 0;
                continue;
            }
            i++;
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}
