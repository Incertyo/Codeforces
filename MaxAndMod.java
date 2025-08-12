import java.util.*;

public class MaxAndMod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                int[] p = new int[n];
                p[0] = 1;
                p[1] = n;
                for (int i = 2; i < n; i++) {
                    p[i] = i;
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(p[i] + " ");
                }
                System.out.println();
            }
        }
    }
}