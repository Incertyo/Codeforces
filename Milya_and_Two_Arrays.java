import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Milya_and_Two_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int c=0;
        for(int i = 0; i < n; i++){
            int m = sc.nextInt();
            int[][]arr= new int[2][m];
            int sum = 0;
            HashSet<Integer> set = new HashSet<>();
            for(int k=0;k<2;k++) {
                for (int j = 0; j < m; j++) {
                    arr[k][j] = sc.nextInt();
                }
            }
            Arrays.sort(arr[0]);

            for(int j=0;j<m;j++){
                 sum=arr[0][j]+arr[1][j];
                set.add(sum);

            }
            int size=set.size();
            System.out.println(size>2?"YES":"NO");
        }
    }
}
