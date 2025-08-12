import java.util.Scanner;

public class sIMPLErEPETITON {
    public static boolean isPrime(long n){
        if(n<2){
            return false;
        }
        for (int i = 2; i*i<=n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            long x = sc.nextLong();
            byte k = sc.nextByte();
            if(k==1){
                System.out.println(isPrime(x)?"YES":"NO");
            }
            else{
                if(x==1){
                    System.out.println(k==2?"YES":"NO");
                }
                else{
                    System.out.println("NO");
                }
            }

        }
    }
}
