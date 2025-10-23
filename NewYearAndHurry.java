import java.util.Scanner;

public class NewYearAndHurry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k=sc.nextInt();
            int rem= 240-k;
            int time=0;
            int ans=0;
            for(int i=1;i<=n;i++) {
                time += (5 * i);
                if (time == rem) {
                    ans = i;
                    break;
                } else if (time > rem) {
                    ans = i - 1;
                    break;
                }
            }
            if(time<rem){
                System.out.println(n);
            }
            else{
                System.out.println(ans);
            }

        }

}
