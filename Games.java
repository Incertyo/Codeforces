import java.util.HashMap;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] home = new int[n];
        HashMap<Integer,Integer> guest = new HashMap<>();
        for(int i=0;i<n;i++){
            home[i]=sc.nextInt();
            int temp=sc.nextInt();
            guest.put(temp,guest.getOrDefault(temp,0)+1);
        }
        int c=0;
        for(int i=0;i<n;i++){
            c=c+guest.getOrDefault(home[i],0);
        }
        System.out.println(c);
    }
}
