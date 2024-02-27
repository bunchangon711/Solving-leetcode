import java.util.ArrayList;
import java.util.Scanner;

public class LC20_ValidParentheses{
    static boolean answer(String s){
        ArrayList<String> openParenthesis = new ArrayList<String>();
        openParenthesis.add(" ");
        while (s.length()>0) {
            if(s.charAt(0) == '(' || s.charAt(0) == '[' || s.charAt(0) == '{'){
                openParenthesis.add(Character.toString(s.charAt(0)));
                s = s.substring(1, s.length());
            }
            else if(s.charAt(0) - openParenthesis.get(openParenthesis.size()-1).charAt(0)>0 &&
            s.charAt(0) - openParenthesis.get(openParenthesis.size()-1).charAt(0)<3){
                openParenthesis.remove(openParenthesis.size()-1);
                s = s.substring(1, s.length());
            }
            else return false;
        }
        if(openParenthesis.size()!=1){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}