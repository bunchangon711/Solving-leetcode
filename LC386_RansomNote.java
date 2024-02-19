import java.util.HashMap;
import java.util.Scanner;

public class LC386_RansomNote {
    static boolean answer(String ransomNote, String magazine){
        HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
        for(int i=0;i<magazine.length();i++){
            if(!letters.containsKey(magazine.charAt(i))){
                letters.put(magazine.charAt(i), 1);
            }
            else letters.put(magazine.charAt(i), letters.get(magazine.charAt(i))+1);
        }
        for(int i=0;i<ransomNote.length();i++){
            if(letters.containsKey(ransomNote.charAt(i)) && letters.get(ransomNote.charAt(i)) > 0){
                letters.put(ransomNote.charAt(i), letters.get(ransomNote.charAt(i))-1);
            }
            else return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ransomNote = sc.nextLine();
        String magazine = sc.nextLine();
        System.out.println(answer(ransomNote, magazine));
        sc.close();
    }
}
