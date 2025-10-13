import java.util.Arrays;
import java.util.Scanner;

public class BalancedRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int k= sc.nextInt();
            int []arr= new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int c=1;
            int Max=1;
            for(int i=0;i<n-1;i++){
                if(arr[i+1]-arr[i]<=k){
                    c++;
                }
                else{
                    c=1;
                }
                Max=Math.max(c,Max);
            }
            System.out.println(n-Max);

        }
    }
}
