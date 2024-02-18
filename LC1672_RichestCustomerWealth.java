import java.util.Scanner;

public class LC1672_RichestCustomerWealth {
    static int answer(int[][] accounts){
        int richest = 0;
        for(int i=0;i<accounts.length;i++){
            int currentSum = 0;
            for(int j=0;j<accounts[i].length;j++){
                currentSum += accounts[i][j];
            }
            if(currentSum > richest){
                richest = currentSum;
            }
        }
        return richest;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] accounts = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                accounts[m][n] = sc.nextInt();
            }
        }
        System.out.println(answer(accounts));
        sc.close();
    }
}
