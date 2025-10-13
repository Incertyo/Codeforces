import java.util.Scanner;

public class OddGrasshoppers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long x0= sc.nextLong();
            long n= sc.nextLong();
            long rem= n%4;
            long t=n-rem+1;
            for(long i=t;i<=n;i++){
                if(x0%2==0){
                    x0-=i;
                }
                else{
                    x0+=i;
                }
            }
            System.out.println(x0);

        }
    }
}
