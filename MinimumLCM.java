import java.util.Scanner;

public class MinimumLCM {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long n= sc.nextLong();
            long a=1;
            long b=n-1;
            long finala=0;
            long finalb=0;
            long min=Integer.MAX_VALUE;
            for(long i=a;i<=n/2;i++){
               long lcm=(a*b)/gcd(a,b);
               if(lcm<min){
                   min=lcm;
                   finala=a;
                   finalb=b;
               }
               a++;
               b--;
            }
            System.out.println(finala+" "+finalb);

        }
    }

    private static long gcd(long a, long b) {
       if(b==0)return a;
       else return gcd(b,a%b);
    }
}
