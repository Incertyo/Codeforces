import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g_max=0;
        int n = sc.nextInt();
        int l_max=0;
        for(int i =0;i<n;i++){
            int exit=sc.nextInt();
            int enter=sc.nextInt();
            l_max=l_max-exit+enter;
            g_max=Math.max(g_max,l_max);

        }
        System.out.println(g_max);
    }
}
