import java.util.Scanner;

public class T_Primes {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while(n -->0){
            long num = sc.nextLong();
            int c=2;
            for(int i=2;i<=Math.ceil(Math.sqrt(num));i++) {
                if (num % i == 0) {
                    c++;
                }
                if (c >3) {
                    break;
                }
            }
            if(num==1){
                c--;
            }
            if(c==3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
