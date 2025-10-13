import java.util.Scanner;

public class ExcitingBets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            Long a= sc.nextLong();
            Long b= sc.nextLong();
            if(a<b){
                long temp= a;
                a=b;
                b=temp;
            }
            if(a==b){
                System.out.println("0 0");
            }
            else{
                long gcd= a-b;
                long mv=Math.min(b%gcd,gcd-b%gcd);
                System.out.println(gcd+" "+mv);
            }
        }
        sc.close();
    }
}
