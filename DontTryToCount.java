import java.util.Scanner;

public class DontTryToCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for (int i = 0; i < loop; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            String main = sc.next();
            String tar = sc.next();
            StringBuilder sb = new StringBuilder(main);
            int count = 0;
            boolean found = false;
            for (int j = 0; j < 8; j++) {
                if (sb.indexOf(tar) != -1) {
                    System.out.println(count);
                    found = true;
                    break;
                }
                sb.append(sb);
                count++;
            }
            if (!found) {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}