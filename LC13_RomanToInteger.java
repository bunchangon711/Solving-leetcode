import java.util.Scanner;

public class LC13_RomanToInteger{
    static int convertRomanChar(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }
    static int answer(String s){
        int sum = 0;
        for(int i=0;i<s.length()-1;i++){
            if(convertRomanChar(s.charAt(i)) < convertRomanChar(s.charAt(i+1))){
                sum -= convertRomanChar(s.charAt(i));
            }
            else sum += convertRomanChar(s.charAt(i));
        }
        sum += convertRomanChar(s.charAt(s.length()-1));
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}