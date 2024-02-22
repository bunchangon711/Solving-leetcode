import java.util.Scanner;

public class LC1758_MinChangesToAlternatingBinaryString{
    static int answer(String s){
        if(s.length()==1){
            return 0;
        }
        int count = 0;
        int minCount = Integer.MAX_VALUE;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i) != '0'){
                count++;
            }
            else if (i%2==1 && s.charAt(i) != '1'){
                count++;
            }
        }
        minCount = count;
        count = 0;
        for(int i=0;i<s.length();i++){
            if(i%2==0 && s.charAt(i) != '1'){
                count++;
            }
            else if (i%2==1 && s.charAt(i) != '0'){
                count++;
            }
        }
        if(count < minCount){
            minCount = count;
        }
        return minCount;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(answer(s));
        sc.close();
    }
}