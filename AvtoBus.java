import java.util.Scanner;

public class AvtoBus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        while(loop -->0){
            long n= sc.nextLong();
            if(n<4 || n%2==1){
                System.out.println(-1);
            }
            else{
                System.out.println((n+5)/6L+" "+(n/4L));
            }
        }
    }
}