import java.util.HashMap;
import java.util.Scanner;

public class LC242_ValidAnagram{
    static boolean answer(String s, String t){
        if(t.length() != s.length()){
            return false;
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }
            else{
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(!map.containsKey(t.charAt(i))){
                return false;
            }
            else if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i)) >=1){
                map.replace(t.charAt(i), map.get(t.charAt(i))-1);
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(answer(s, t));
        sc.close();
    }
}