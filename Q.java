import java.io.*;
import java.util.*;

public class Q {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            Arrays.fill(a, 0);
            // Place m+1 elements spaced by k positions
            for (int i = 0; i <= m; i++) {
                int pos = i * k;
                if (pos >= n) break;
                a[pos] = 100000000;
            }
            for (int i = 0; i < n; i++) {
                pw.print(a[i] + " ");
            }
            pw.println();
        }
        pw.close();
    }
}