

import java.util.Arrays;
import java.util.Scanner;

public class MainakAndArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            int n= sc.nextInt();
            int min=Integer.MAX_VALUE;
            int max=Integer.MIN_VALUE;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int ans=arr[n-1]-arr[0];
            Arrays.sort(arr);
            for(int i=0;i<n-1;i++){
                ans=Math.max(ans,arr[i+1]-arr[i]);
            }
            for(int i=0;i<n;i++){
                ans=Math.max(ans,arr[i]-arr[0]);
            }
            for(int i=0;i<n;i++){
                ans=Math.max(ans,arr[n-1]-arr[i]);
            }

            System.out.println(ans);

        }
    }
}
