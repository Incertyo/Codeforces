import java.util.Scanner;

public class MultiplyBy2_DivideBy6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long n= sc.nextLong();
            int c=0;
            while(n>1){
                if(n%6==0){
                    n/=6;
                    c++;
                }
                else{
                    n*=2;
                    c++;
                }
            }
            if(n!=1){
                System.out.println(-1);
            }
            else{
                System.out.println(c);
            }

        }
    }
}
