import java.util.Scanner;

public class LC3042_CountPrefixAndSuffixI{
    static boolean isPrefixAndSuffix(String wordi, String wordj){
        if(wordi.length() > wordj.length()){
            return false;
        }
        boolean prefix = wordi.equals(wordj.substring(0, wordi.length()).toString());
        boolean suffix = wordi.equals(wordj.substring(wordj.length()-wordi.length(), wordj.length()).toString());
        return (prefix && suffix);
    }
    static int countPrefixSuffixPairs(String[] words){
        if(words.length == 1){
            return 0;
        }
        int count = 0;
        for(int i=0;i<words.length-1;i++){
            for(int j=i+1;j<words.length;j++){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }
        System.out.println(countPrefixSuffixPairs(words));
        sc.close();
    }
}