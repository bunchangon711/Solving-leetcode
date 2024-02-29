import java.util.ArrayList;
import java.util.Scanner;

public class LC682_BaseballGame {
    static int answer(String[] operations){
        int sum = 0;
        ArrayList<Integer> lst = new ArrayList<>();
        for(String s:operations){
            if(s.charAt(0) == '+'){
                lst.add(lst.get(lst.size()-1)+lst.get(lst.size()-2));
            }
            else if(s.charAt(0) == 'D'){
                lst.add(lst.get(lst.size()-1)*2);
            }
            else if(s.charAt(0) == 'C'){
                lst.remove(lst.size()-1);
            }
            else{
                lst.add(Integer.parseInt(s));
            }
        }
        for(int i:lst){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] operations = new String[n];
        for(int i=0;i<n;i++){
            operations[i] = sc.nextLine();
        }
        System.out.println(answer(operations));
        sc.close();
    }
}
